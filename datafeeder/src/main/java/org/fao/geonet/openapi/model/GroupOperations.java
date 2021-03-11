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
 * GroupOperations
 */

public class GroupOperations {
    @JsonProperty("group")
    private Integer group = null;

    @JsonProperty("operations")
    private Map<String, Boolean> operations = null;

    public GroupOperations group(Integer group) {
        this.group = group;
        return this;
    }

    /**
     * Get group
     * 
     * @return group
     **/
    @ApiModelProperty(value = "")
    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public GroupOperations operations(Map<String, Boolean> operations) {
        this.operations = operations;
        return this;
    }

    public GroupOperations putOperationsItem(String key, Boolean operationsItem) {
        if (this.operations == null) {
            this.operations = new HashMap<>();
        }
        this.operations.put(key, operationsItem);
        return this;
    }

    /**
     * Get operations
     * 
     * @return operations
     **/
    @ApiModelProperty(value = "")
    public Map<String, Boolean> getOperations() {
        return operations;
    }

    public void setOperations(Map<String, Boolean> operations) {
        this.operations = operations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GroupOperations groupOperations = (GroupOperations) o;
        return Objects.equals(this.group, groupOperations.group)
                && Objects.equals(this.operations, groupOperations.operations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, operations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupOperations {\n");

        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
