/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * OuterComposite
 */
@.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OuterComposite {
  public static final String SERIALIZED_NAME_MY_NUMBER = "my_number";
  @SerializedName(SERIALIZED_NAME_MY_NUMBER)
  private BigDecimal myNumber;

  public static final String SERIALIZED_NAME_MY_STRING = "my_string";
  @SerializedName(SERIALIZED_NAME_MY_STRING)
  private String myString;

  public static final String SERIALIZED_NAME_MY_BOOLEAN = "my_boolean";
  @SerializedName(SERIALIZED_NAME_MY_BOOLEAN)
  private Boolean myBoolean;

  public OuterComposite() {
  }

  public OuterComposite myNumber(BigDecimal myNumber) {
    
    this.myNumber = myNumber;
    return this;
  }

   /**
   * Get myNumber
   * @return myNumber
  **/
  @.annotation.Nullable

  public BigDecimal getMyNumber() {
    return myNumber;
  }


  public void setMyNumber(BigDecimal myNumber) {
    this.myNumber = myNumber;
  }


  public OuterComposite myString(String myString) {
    
    this.myString = myString;
    return this;
  }

   /**
   * Get myString
   * @return myString
  **/
  @.annotation.Nullable

  public String getMyString() {
    return myString;
  }


  public void setMyString(String myString) {
    this.myString = myString;
  }


  public OuterComposite myBoolean(Boolean myBoolean) {
    
    this.myBoolean = myBoolean;
    return this;
  }

   /**
   * Get myBoolean
   * @return myBoolean
  **/
  @.annotation.Nullable

  public Boolean getMyBoolean() {
    return myBoolean;
  }


  public void setMyBoolean(Boolean myBoolean) {
    this.myBoolean = myBoolean;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterComposite outerComposite = (OuterComposite) o;
    return Objects.equals(this.myNumber, outerComposite.myNumber) &&
        Objects.equals(this.myString, outerComposite.myString) &&
        Objects.equals(this.myBoolean, outerComposite.myBoolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myNumber, myString, myBoolean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    sb.append("    myNumber: ").append(toIndentedString(myNumber)).append("\n");
    sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
    sb.append("    myBoolean: ").append(toIndentedString(myBoolean)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("my_number");
    openapiFields.add("my_string");
    openapiFields.add("my_boolean");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OuterComposite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OuterComposite.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OuterComposite is not found in the empty JSON string", OuterComposite.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OuterComposite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OuterComposite` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("my_string") != null && !jsonObj.get("my_string").isJsonNull()) && !jsonObj.get("my_string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `my_string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("my_string").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OuterComposite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OuterComposite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OuterComposite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OuterComposite.class));

       return (TypeAdapter<T>) new TypeAdapter<OuterComposite>() {
           @Override
           public void write(JsonWriter out, OuterComposite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OuterComposite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OuterComposite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OuterComposite
  * @throws IOException if the JSON string is invalid with respect to OuterComposite
  */
  public static OuterComposite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OuterComposite.class);
  }

 /**
  * Convert an instance of OuterComposite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

