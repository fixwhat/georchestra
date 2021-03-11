/*
 * GeoNetwork Api Documentation (beta)
 * Learn how to access the catalog using the GeoNetwork REST API.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.fao.geonet.openapi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * UserDto
 */

public class UserDto {
    @JsonProperty("addresses")
    private List<Address> addresses = null;

    @JsonProperty("email")
    private List<String> email = null;

    @JsonProperty("emailAddresses")
    private List<String> emailAddresses = null;

    @JsonProperty("enabled")
    private Boolean enabled = null;

    @JsonProperty("groupsEditor")
    private List<String> groupsEditor = null;

    @JsonProperty("groupsRegisteredUser")
    private List<String> groupsRegisteredUser = null;

    @JsonProperty("groupsReviewer")
    private List<String> groupsReviewer = null;

    @JsonProperty("groupsUserAdmin")
    private List<String> groupsUserAdmin = null;

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("kind")
    private String kind = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("organisation")
    private String organisation = null;

    @JsonProperty("password")
    private String password = null;

    @JsonProperty("profile")
    private String profile = null;

    @JsonProperty("surname")
    private String surname = null;

    @JsonProperty("username")
    private String username = null;

    public UserDto addresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    public UserDto addAddressesItem(Address addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    /**
     * Get addresses
     * 
     * @return addresses
     **/
    @ApiModelProperty(value = "")
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public UserDto email(List<String> email) {
        this.email = email;
        return this;
    }

    public UserDto addEmailItem(String emailItem) {
        if (this.email == null) {
            this.email = new ArrayList<>();
        }
        this.email.add(emailItem);
        return this;
    }

    /**
     * Get email
     * 
     * @return email
     **/
    @ApiModelProperty(value = "")
    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public UserDto emailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    public UserDto addEmailAddressesItem(String emailAddressesItem) {
        if (this.emailAddresses == null) {
            this.emailAddresses = new ArrayList<>();
        }
        this.emailAddresses.add(emailAddressesItem);
        return this;
    }

    /**
     * Get emailAddresses
     * 
     * @return emailAddresses
     **/
    @ApiModelProperty(value = "")
    public List<String> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public UserDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     * 
     * @return enabled
     **/
    @ApiModelProperty(value = "")
    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UserDto groupsEditor(List<String> groupsEditor) {
        this.groupsEditor = groupsEditor;
        return this;
    }

    public UserDto addGroupsEditorItem(String groupsEditorItem) {
        if (this.groupsEditor == null) {
            this.groupsEditor = new ArrayList<>();
        }
        this.groupsEditor.add(groupsEditorItem);
        return this;
    }

    /**
     * Get groupsEditor
     * 
     * @return groupsEditor
     **/
    @ApiModelProperty(value = "")
    public List<String> getGroupsEditor() {
        return groupsEditor;
    }

    public void setGroupsEditor(List<String> groupsEditor) {
        this.groupsEditor = groupsEditor;
    }

    public UserDto groupsRegisteredUser(List<String> groupsRegisteredUser) {
        this.groupsRegisteredUser = groupsRegisteredUser;
        return this;
    }

    public UserDto addGroupsRegisteredUserItem(String groupsRegisteredUserItem) {
        if (this.groupsRegisteredUser == null) {
            this.groupsRegisteredUser = new ArrayList<>();
        }
        this.groupsRegisteredUser.add(groupsRegisteredUserItem);
        return this;
    }

    /**
     * Get groupsRegisteredUser
     * 
     * @return groupsRegisteredUser
     **/
    @ApiModelProperty(value = "")
    public List<String> getGroupsRegisteredUser() {
        return groupsRegisteredUser;
    }

    public void setGroupsRegisteredUser(List<String> groupsRegisteredUser) {
        this.groupsRegisteredUser = groupsRegisteredUser;
    }

    public UserDto groupsReviewer(List<String> groupsReviewer) {
        this.groupsReviewer = groupsReviewer;
        return this;
    }

    public UserDto addGroupsReviewerItem(String groupsReviewerItem) {
        if (this.groupsReviewer == null) {
            this.groupsReviewer = new ArrayList<>();
        }
        this.groupsReviewer.add(groupsReviewerItem);
        return this;
    }

    /**
     * Get groupsReviewer
     * 
     * @return groupsReviewer
     **/
    @ApiModelProperty(value = "")
    public List<String> getGroupsReviewer() {
        return groupsReviewer;
    }

    public void setGroupsReviewer(List<String> groupsReviewer) {
        this.groupsReviewer = groupsReviewer;
    }

    public UserDto groupsUserAdmin(List<String> groupsUserAdmin) {
        this.groupsUserAdmin = groupsUserAdmin;
        return this;
    }

    public UserDto addGroupsUserAdminItem(String groupsUserAdminItem) {
        if (this.groupsUserAdmin == null) {
            this.groupsUserAdmin = new ArrayList<>();
        }
        this.groupsUserAdmin.add(groupsUserAdminItem);
        return this;
    }

    /**
     * Get groupsUserAdmin
     * 
     * @return groupsUserAdmin
     **/
    @ApiModelProperty(value = "")
    public List<String> getGroupsUserAdmin() {
        return groupsUserAdmin;
    }

    public void setGroupsUserAdmin(List<String> groupsUserAdmin) {
        this.groupsUserAdmin = groupsUserAdmin;
    }

    public UserDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * 
     * @return id
     **/
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDto kind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get kind
     * 
     * @return kind
     **/
    @ApiModelProperty(value = "")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public UserDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * 
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDto organisation(String organisation) {
        this.organisation = organisation;
        return this;
    }

    /**
     * Get organisation
     * 
     * @return organisation
     **/
    @ApiModelProperty(value = "")
    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public UserDto password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get password
     * 
     * @return password
     **/
    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDto profile(String profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get profile
     * 
     * @return profile
     **/
    @ApiModelProperty(value = "")
    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public UserDto surname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * Get surname
     * 
     * @return surname
     **/
    @ApiModelProperty(value = "")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UserDto username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get username
     * 
     * @return username
     **/
    @ApiModelProperty(value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDto userDto = (UserDto) o;
        return Objects.equals(this.addresses, userDto.addresses) && Objects.equals(this.email, userDto.email)
                && Objects.equals(this.emailAddresses, userDto.emailAddresses)
                && Objects.equals(this.enabled, userDto.enabled)
                && Objects.equals(this.groupsEditor, userDto.groupsEditor)
                && Objects.equals(this.groupsRegisteredUser, userDto.groupsRegisteredUser)
                && Objects.equals(this.groupsReviewer, userDto.groupsReviewer)
                && Objects.equals(this.groupsUserAdmin, userDto.groupsUserAdmin) && Objects.equals(this.id, userDto.id)
                && Objects.equals(this.kind, userDto.kind) && Objects.equals(this.name, userDto.name)
                && Objects.equals(this.organisation, userDto.organisation)
                && Objects.equals(this.password, userDto.password) && Objects.equals(this.profile, userDto.profile)
                && Objects.equals(this.surname, userDto.surname) && Objects.equals(this.username, userDto.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses, email, emailAddresses, enabled, groupsEditor, groupsRegisteredUser,
                groupsReviewer, groupsUserAdmin, id, kind, name, organisation, password, profile, surname, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDto {\n");

        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    groupsEditor: ").append(toIndentedString(groupsEditor)).append("\n");
        sb.append("    groupsRegisteredUser: ").append(toIndentedString(groupsRegisteredUser)).append("\n");
        sb.append("    groupsReviewer: ").append(toIndentedString(groupsReviewer)).append("\n");
        sb.append("    groupsUserAdmin: ").append(toIndentedString(groupsUserAdmin)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
        sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
