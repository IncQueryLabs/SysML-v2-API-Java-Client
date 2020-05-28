/*
 * SysML v2 API and Services
 * REST/HTTP binding (PSM) for the SysML v2 standard API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.omg.sysml.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Element
 */

public class Element extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;

  public static final String SERIALIZED_NAME_AT_ID = "@id";
  @SerializedName(SERIALIZED_NAME_AT_ID)
  private UUID atId;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private UUID identifier;


  public Element atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * Get atType
   * @return atType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAtType() {
    return atType;
  }


  public void setAtType(String atType) {
    this.atType = atType;
  }


  public Element atId(UUID atId) {
    
    this.atId = atId;
    return this;
  }

   /**
   * Get atId
   * @return atId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAtId() {
    return atId;
  }


  public void setAtId(UUID atId) {
    this.atId = atId;
  }


  public Element identifier(UUID identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getIdentifier() {
    return identifier;
  }


  public void setIdentifier(UUID identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Element element = (Element) o;
    return Objects.equals(this.atType, element.atType) &&
        Objects.equals(this.atId, element.atId) &&
        Objects.equals(this.identifier, element.identifier) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atId, identifier, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Element {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

