package org.georchestra.ldapadmin.emails;

import org.georchestra.ldapadmin.dao.AttachmentDao;
import org.georchestra.ldapadmin.dao.EmailDao;
import org.georchestra.ldapadmin.ds.AccountDao;
import org.georchestra.ldapadmin.ds.DataServiceException;
import org.georchestra.ldapadmin.ds.NotFoundException;
import org.georchestra.ldapadmin.dto.Account;
import org.georchestra.ldapadmin.model.Attachment;
import org.georchestra.ldapadmin.model.EmailEntry;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Controller
public class EmailController {

    @Autowired
    private EmailDao emailRepository;

    @Autowired
    private AttachmentDao attachmentRepo;

    @Autowired
	private AccountDao accountDao;


    @RequestMapping(value="/{recipient}/emails",
                    method= RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String emailsList(@PathVariable String recipient) throws JSONException {

        List<EmailEntry> emails = emailRepository.findByRecipient(UUID.fromString(recipient));
        JSONArray res = new JSONArray();
        for(EmailEntry email : emails)
            res.put(email.toJSON());

        return res.toString();
    }

    @RequestMapping(value="{recipient}/sendEmail", method = RequestMethod.POST)
    @ResponseBody
    public String sendEmail(@PathVariable String recipient,
                            @RequestParam("subject") String subject,
                            @RequestParam("content") String content,
                            @RequestParam("attachments[]") String[] attachmentsIds,
                            HttpServletRequest request) throws NotFoundException, DataServiceException {


        EmailEntry email = new EmailEntry();
        Account sender = this.accountDao.findByUID(request.getHeader("sec-username"));
        email.setSender(UUID.fromString(sender.getUUID()));
        email.setRecipient(UUID.fromString(recipient));
        email.setSubject(subject);
        email.setBody(content);
        List<Attachment> attachments = new LinkedList<Attachment>();
        for(String attId : attachmentsIds)
            attachments.add(attachmentRepo.findOne(Long.parseLong(attId)));
        email.setAttachments(attachments);

        return "OK : " + emailRepository.save(email).getId();
    }


    @RequestMapping(value="{recipient}/sendEmail", method = RequestMethod.GET)
    @ResponseBody
    public String sendEmail(@PathVariable String recipient){
        return "<form method=POST>" +
                "recipient : " + recipient + "<br>" +
                "subject : <input type='test' name='subject'><br>" +
                "content : <textarea name='content'></textarea><br>" +
                "first attachment <input type='text' name='attachments[]'><br>" +
                "second attachment <input type='text' name='attachments[]'><br>" +
                "<input type='submit'>" +
                "</form>";

    }




}
