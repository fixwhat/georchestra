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
 * MeResponse
 */

public class MeResponse {
    @JsonProperty("admin")
    private Boolean admin = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("groupsWithEditor")
    private List<Integer> groupsWithEditor = null;

    @JsonProperty("groupsWithRegisteredUser")
    private List<Integer> groupsWithRegisteredUser = null;

    @JsonProperty("groupsWithReviewer")
    private List<Integer> groupsWithReviewer = null;

    @JsonProperty("groupsWithUserAdmin")
    private List<Integer> groupsWithUserAdmin = null;

    @JsonProperty("hash")
    private String hash = null;

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("organisation")
    private String organisation = null;

    @JsonProperty("profile")
    private String profile = null;

    @JsonProperty("surname")
    private String surname = null;

    @JsonProperty("username")
    private String username = null;

    public MeResponse admin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    /**
     * Get admin
     * 
     * @return admin
     **/
    @ApiModelProperty(value = "")
    public Boolean isAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public MeResponse email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * 
     * @return email
     **/
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MeResponse groupsWithEditor(List<Integer> groupsWithEditor) {
        this.groupsWithEditor = groupsWithEditor;
        return this;
    }

    public MeResponse addGroupsWithEditorItem(Integer groupsWithEditorItem) {
        if (this.groupsWithEditor == null) {
            this.groupsWithEditor = new ArrayList<>();
        }
        this.groupsWithEditor.add(groupsWithEditorItem);
        return this;
    }

    /**
     * Get groupsWithEditor
     * 
     * @return groupsWithEditor
     **/
    @ApiModelProperty(value = "")
    public List<Integer> getGroupsWithEditor() {
        return groupsWithEditor;
    }

    public void setGroupsWithEditor(List<Integer> groupsWithEditor) {
        this.groupsWithEditor = groupsWithEditor;
    }

    public MeResponse groupsWithRegisteredUser(List<Integer> groupsWithRegisteredUser) {
        this.groupsWithRegisteredUser = groupsWithRegisteredUser;
        return this;
    }

    public MeResponse addGroupsWithRegisteredUserItem(Integer groupsWithRegisteredUserItem) {
        if (this.groupsWithRegisteredUser == null) {
            this.groupsWithRegisteredUser = new ArrayList<>();
        }
        this.groupsWithRegisteredUser.add(groupsWithRegisteredUserItem);
        return this;
    }

    /**
     * Get groupsWithRegisteredUser
     * 
     * @return groupsWithRegisteredUser
     **/
    @ApiModelProperty(value = "")
    public List<Integer> getGroupsWithRegisteredUser() {
        return groupsWithRegisteredUser;
    }

    public void setGroupsWithRegisteredUser(List<Integer> groupsWithRegisteredUser) {
        this.groupsWithRegisteredUser = groupsWithRegisteredUser;
    }

    public MeResponse groupsWithReviewer(List<Integer> groupsWithReviewer) {
        this.groupsWithReviewer = groupsWithReviewer;
        return this;
    }

    public MeResponse addGroupsWithReviewerItem(Integer groupsWithReviewerItem) {
        if (this.groupsWithReviewer == null) {
            this.groupsWithReviewer = new ArrayList<>();
        }
        this.groupsWithReviewer.add(groupsWithReviewerItem);
        return this;
    }

    /**
     * Get groupsWithReviewer
     * 
     * @return groupsWithReviewer
     **/
    @ApiModelProperty(value = "")
    public List<Integer> getGroupsWithReviewer() {
        return groupsWithReviewer;
    }

    public void setGroupsWithReviewer(List<Integer> groupsWithReviewer) {
        this.groupsWithReviewer = groupsWithReviewer;
    }

    public MeResponse groupsWithUserAdmin(List<Integer> groupsWithUserAdmin) {
        this.groupsWithUserAdmin = groupsWithUserAdmin;
        return this;
    }

    public MeResponse addGroupsWithUserAdminItem(Integer groupsWithUserAdminItem) {
        if (this.groupsWithUserAdmin == null) {
            this.groupsWithUserAdmin = new ArrayList<>();
        }
        this.groupsWithUserAdmin.add(groupsWithUserAdminItem);
        return this;
    }

    /**
     * Get groupsWithUserAdmin
     * 
     * @return groupsWithUserAdmin
     **/
    @ApiModelProperty(value = "")
    public List<Integer> getGroupsWithUserAdmin() {
        return groupsWithUserAdmin;
    }

    public void setGroupsWithUserAdmin(List<Integer> groupsWithUserAdmin) {
        this.groupsWithUserAdmin = groupsWithUserAdmin;
    }

    public MeResponse hash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Get hash
     * 
     * @return hash
     **/
    @ApiModelProperty(value = "")
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public MeResponse id(String id) {
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

    public MeResponse name(String name) {
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

    public MeResponse organisation(String organisation) {
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

    public MeResponse profile(String profile) {
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

    public MeResponse surname(String surname) {
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

    public MeResponse username(String username) {
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
        MeResponse meResponse = (MeResponse) o;
        return Objects.equals(this.admin, meResponse.admin) && Objects.equals(this.email, meResponse.email)
                && Objects.equals(this.groupsWithEditor, meResponse.groupsWithEditor)
                && Objects.equals(this.groupsWithRegisteredUser, meResponse.groupsWithRegisteredUser)
                && Objects.equals(this.groupsWithReviewer, meResponse.groupsWithReviewer)
                && Objects.equals(this.groupsWithUserAdmin, meResponse.groupsWithUserAdmin)
                && Objects.equals(this.hash, meResponse.hash) && Objects.equals(this.id, meResponse.id)
                && Objects.equals(this.name, meResponse.name)
                && Objects.equals(this.organisation, meResponse.organisation)
                && Objects.equals(this.profile, meResponse.profile) && Objects.equals(this.surname, meResponse.surname)
                && Objects.equals(this.username, meResponse.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin, email, groupsWithEditor, groupsWithRegisteredUser, groupsWithReviewer,
                groupsWithUserAdmin, hash, id, name, organisation, profile, surname, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeResponse {\n");

        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    groupsWithEditor: ").append(toIndentedString(groupsWithEditor)).append("\n");
        sb.append("    groupsWithRegisteredUser: ").append(toIndentedString(groupsWithRegisteredUser)).append("\n");
        sb.append("    groupsWithReviewer: ").append(toIndentedString(groupsWithReviewer)).append("\n");
        sb.append("    groupsWithUserAdmin: ").append(toIndentedString(groupsWithUserAdmin)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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
