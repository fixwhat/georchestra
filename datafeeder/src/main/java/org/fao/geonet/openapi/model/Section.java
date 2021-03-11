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
 * Section
 */

public class Section {
    @JsonProperty("field")
    private List<Field> field = null;

    @JsonProperty("name")
    private String name = null;

    public Section field(List<Field> field) {
        this.field = field;
        return this;
    }

    public Section addFieldItem(Field fieldItem) {
        if (this.field == null) {
            this.field = new ArrayList<>();
        }
        this.field.add(fieldItem);
        return this;
    }

    /**
     * Get field
     * 
     * @return field
     **/
    @ApiModelProperty(value = "")
    public List<Field> getField() {
        return field;
    }

    public void setField(List<Field> field) {
        this.field = field;
    }

    public Section name(String name) {
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
        Section section = (Section) o;
        return Objects.equals(this.field, section.field) && Objects.equals(this.name, section.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Section {\n");

        sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
