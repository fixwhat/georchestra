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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RatingCriteria
 */

public class RatingCriteria {
    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("internal")
    private Boolean internal = null;

    @JsonProperty("label")
    private Map<String, String> label = null;

    @JsonProperty("name")
    private String name = null;

    public RatingCriteria id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * 
     * @return id
     **/
    @ApiModelProperty(value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RatingCriteria internal(Boolean internal) {
        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     * 
     * @return internal
     **/
    @ApiModelProperty(value = "")
    public Boolean isInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public RatingCriteria label(Map<String, String> label) {
        this.label = label;
        return this;
    }

    public RatingCriteria putLabelItem(String key, String labelItem) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        this.label.put(key, labelItem);
        return this;
    }

    /**
     * Get label
     * 
     * @return label
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getLabel() {
        return label;
    }

    public void setLabel(Map<String, String> label) {
        this.label = label;
    }

    public RatingCriteria name(String name) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RatingCriteria ratingCriteria = (RatingCriteria) o;
        return Objects.equals(this.id, ratingCriteria.id) && Objects.equals(this.internal, ratingCriteria.internal)
                && Objects.equals(this.label, ratingCriteria.label) && Objects.equals(this.name, ratingCriteria.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, internal, label, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RatingCriteria {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
