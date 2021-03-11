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
 * Selection
 */

public class Selection {
    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("label")
    private Map<String, String> label = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("watchable")
    private Boolean watchable = null;

    public Selection id(Integer id) {
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

    public Selection label(Map<String, String> label) {
        this.label = label;
        return this;
    }

    public Selection putLabelItem(String key, String labelItem) {
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

    public Selection name(String name) {
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

    public Selection watchable(Boolean watchable) {
        this.watchable = watchable;
        return this;
    }

    /**
     * Get watchable
     * 
     * @return watchable
     **/
    @ApiModelProperty(value = "")
    public Boolean isWatchable() {
        return watchable;
    }

    public void setWatchable(Boolean watchable) {
        this.watchable = watchable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Selection selection = (Selection) o;
        return Objects.equals(this.id, selection.id) && Objects.equals(this.label, selection.label)
                && Objects.equals(this.name, selection.name) && Objects.equals(this.watchable, selection.watchable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, name, watchable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Selection {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    watchable: ").append(toIndentedString(watchable)).append("\n");
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
