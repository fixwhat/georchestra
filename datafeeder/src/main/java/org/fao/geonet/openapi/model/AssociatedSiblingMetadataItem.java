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
 * AssociatedSiblingMetadataItem
 */

public class AssociatedSiblingMetadataItem {
    @JsonProperty("agg_isDescriptionOf")
    private List<String> aggIsDescriptionOf = null;

    @JsonProperty("agg_isTemporalStatOf")
    private List<String> aggIsTemporalStatOf = null;

    @JsonProperty("agg_largerWorkCitation")
    private List<String> aggLargerWorkCitation = null;

    @JsonProperty("description")
    private Description description = null;

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("mdType")
    private List<String> mdType = null;

    @JsonProperty("title")
    private MultilingualValue title = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("url")
    private MultilingualValue url = null;

    public AssociatedSiblingMetadataItem aggIsDescriptionOf(List<String> aggIsDescriptionOf) {
        this.aggIsDescriptionOf = aggIsDescriptionOf;
        return this;
    }

    public AssociatedSiblingMetadataItem addAggIsDescriptionOfItem(String aggIsDescriptionOfItem) {
        if (this.aggIsDescriptionOf == null) {
            this.aggIsDescriptionOf = new ArrayList<>();
        }
        this.aggIsDescriptionOf.add(aggIsDescriptionOfItem);
        return this;
    }

    /**
     * Get aggIsDescriptionOf
     * 
     * @return aggIsDescriptionOf
     **/
    @ApiModelProperty(value = "")
    public List<String> getAggIsDescriptionOf() {
        return aggIsDescriptionOf;
    }

    public void setAggIsDescriptionOf(List<String> aggIsDescriptionOf) {
        this.aggIsDescriptionOf = aggIsDescriptionOf;
    }

    public AssociatedSiblingMetadataItem aggIsTemporalStatOf(List<String> aggIsTemporalStatOf) {
        this.aggIsTemporalStatOf = aggIsTemporalStatOf;
        return this;
    }

    public AssociatedSiblingMetadataItem addAggIsTemporalStatOfItem(String aggIsTemporalStatOfItem) {
        if (this.aggIsTemporalStatOf == null) {
            this.aggIsTemporalStatOf = new ArrayList<>();
        }
        this.aggIsTemporalStatOf.add(aggIsTemporalStatOfItem);
        return this;
    }

    /**
     * Get aggIsTemporalStatOf
     * 
     * @return aggIsTemporalStatOf
     **/
    @ApiModelProperty(value = "")
    public List<String> getAggIsTemporalStatOf() {
        return aggIsTemporalStatOf;
    }

    public void setAggIsTemporalStatOf(List<String> aggIsTemporalStatOf) {
        this.aggIsTemporalStatOf = aggIsTemporalStatOf;
    }

    public AssociatedSiblingMetadataItem aggLargerWorkCitation(List<String> aggLargerWorkCitation) {
        this.aggLargerWorkCitation = aggLargerWorkCitation;
        return this;
    }

    public AssociatedSiblingMetadataItem addAggLargerWorkCitationItem(String aggLargerWorkCitationItem) {
        if (this.aggLargerWorkCitation == null) {
            this.aggLargerWorkCitation = new ArrayList<>();
        }
        this.aggLargerWorkCitation.add(aggLargerWorkCitationItem);
        return this;
    }

    /**
     * Get aggLargerWorkCitation
     * 
     * @return aggLargerWorkCitation
     **/
    @ApiModelProperty(value = "")
    public List<String> getAggLargerWorkCitation() {
        return aggLargerWorkCitation;
    }

    public void setAggLargerWorkCitation(List<String> aggLargerWorkCitation) {
        this.aggLargerWorkCitation = aggLargerWorkCitation;
    }

    public AssociatedSiblingMetadataItem description(Description description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * 
     * @return description
     **/
    @ApiModelProperty(value = "")
    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public AssociatedSiblingMetadataItem id(String id) {
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

    public AssociatedSiblingMetadataItem mdType(List<String> mdType) {
        this.mdType = mdType;
        return this;
    }

    public AssociatedSiblingMetadataItem addMdTypeItem(String mdTypeItem) {
        if (this.mdType == null) {
            this.mdType = new ArrayList<>();
        }
        this.mdType.add(mdTypeItem);
        return this;
    }

    /**
     * Get mdType
     * 
     * @return mdType
     **/
    @ApiModelProperty(value = "")
    public List<String> getMdType() {
        return mdType;
    }

    public void setMdType(List<String> mdType) {
        this.mdType = mdType;
    }

    public AssociatedSiblingMetadataItem title(MultilingualValue title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * 
     * @return title
     **/
    @ApiModelProperty(value = "")
    public MultilingualValue getTitle() {
        return title;
    }

    public void setTitle(MultilingualValue title) {
        this.title = title;
    }

    public AssociatedSiblingMetadataItem type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * 
     * @return type
     **/
    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AssociatedSiblingMetadataItem url(MultilingualValue url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * 
     * @return url
     **/
    @ApiModelProperty(value = "")
    public MultilingualValue getUrl() {
        return url;
    }

    public void setUrl(MultilingualValue url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociatedSiblingMetadataItem associatedSiblingMetadataItem = (AssociatedSiblingMetadataItem) o;
        return Objects.equals(this.aggIsDescriptionOf, associatedSiblingMetadataItem.aggIsDescriptionOf)
                && Objects.equals(this.aggIsTemporalStatOf, associatedSiblingMetadataItem.aggIsTemporalStatOf)
                && Objects.equals(this.aggLargerWorkCitation, associatedSiblingMetadataItem.aggLargerWorkCitation)
                && Objects.equals(this.description, associatedSiblingMetadataItem.description)
                && Objects.equals(this.id, associatedSiblingMetadataItem.id)
                && Objects.equals(this.mdType, associatedSiblingMetadataItem.mdType)
                && Objects.equals(this.title, associatedSiblingMetadataItem.title)
                && Objects.equals(this.type, associatedSiblingMetadataItem.type)
                && Objects.equals(this.url, associatedSiblingMetadataItem.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggIsDescriptionOf, aggIsTemporalStatOf, aggLargerWorkCitation, description, id, mdType,
                title, type, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatedSiblingMetadataItem {\n");

        sb.append("    aggIsDescriptionOf: ").append(toIndentedString(aggIsDescriptionOf)).append("\n");
        sb.append("    aggIsTemporalStatOf: ").append(toIndentedString(aggIsTemporalStatOf)).append("\n");
        sb.append("    aggLargerWorkCitation: ").append(toIndentedString(aggLargerWorkCitation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mdType: ").append(toIndentedString(mdType)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
