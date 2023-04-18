/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DataQuery
 */
@JsonPropertyOrder({
  DataQuery.JSON_PROPERTY_SUFFIX,
  DataQuery.JSON_PROPERTY_TEXT,
  DataQuery.JSON_PROPERTY_DATE,
  DataQuery.JSON_PROPERTY_ID,
  DataQuery.JSON_PROPERTY_OUTCOMES
})
@.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataQuery {
  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  private String suffix;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  /**
   * Gets or Sets outcomes
   */
  public enum OutcomesEnum {
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE"),
    
    SKIPPED("SKIPPED");

    private String value;

    OutcomesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OutcomesEnum fromValue(String value) {
      for (OutcomesEnum b : OutcomesEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OUTCOMES = "outcomes";
  private List<OutcomesEnum> outcomes = new ArrayList<>();

  public DataQuery() {
  }

  public DataQuery suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * test suffix
   * @return suffix
  **/
  @.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuffix() {
    return suffix;
  }


  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public DataQuery text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Some text containing white spaces
   * @return text
  **/
  @.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public DataQuery date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * A date
   * @return date
  **/
  @.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public DataQuery id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Query
   * @return id
  **/
  @.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public DataQuery outcomes(List<OutcomesEnum> outcomes) {
    
    this.outcomes = outcomes;
    return this;
  }

  public DataQuery addOutcomesItem(OutcomesEnum outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

   /**
   * Get outcomes
   * @return outcomes
  **/
  @.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTCOMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OutcomesEnum> getOutcomes() {
    return outcomes;
  }


  @JsonProperty(JSON_PROPERTY_OUTCOMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutcomes(List<OutcomesEnum> outcomes) {
    this.outcomes = outcomes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataQuery dataQuery = (DataQuery) o;
    return Objects.equals(this.suffix, dataQuery.suffix) &&
        Objects.equals(this.text, dataQuery.text) &&
        Objects.equals(this.date, dataQuery.date) &&
        Objects.equals(this.id, dataQuery.id) &&
        Objects.equals(this.outcomes, dataQuery.outcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suffix, text, date, id, outcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataQuery {\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
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

}

