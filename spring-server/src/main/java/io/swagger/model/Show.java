package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Show
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T11:21:23.367Z")
@Entity
public class Show   {
  @JsonProperty("id")
  @Id
  private Long id = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("ticketsAvailable")
  private Long ticketsAvailable = null;

  @JsonProperty("endSellingDate")
  private OffsetDateTime endSellingDate = null;

  @JsonProperty("startSellingDate")
  private OffsetDateTime startSellingDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("price")
  private Double price = null;

  /**
   * The show type
   */
  public enum ShowTypeEnum {
    SPORT("SPORT"),
    
    MUSIC("MUSIC"),
    
    THEATER("THEATER");

    private String value;

    ShowTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ShowTypeEnum fromValue(String text) {
      for (ShowTypeEnum b : ShowTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("showType")
  private ShowTypeEnum showType = null;

  public Show id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Show location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "Barcelona", value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Show ticketsAvailable(Long ticketsAvailable) {
    this.ticketsAvailable = ticketsAvailable;
    return this;
  }

  /**
   * Get ticketsAvailable
   * @return ticketsAvailable
  **/
  @ApiModelProperty(value = "")


  public Long getTicketsAvailable() {
    return ticketsAvailable;
  }

  public void setTicketsAvailable(Long ticketsAvailable) {
    this.ticketsAvailable = ticketsAvailable;
  }

  public Show endSellingDate(OffsetDateTime endSellingDate) {
    this.endSellingDate = endSellingDate;
    return this;
  }

  /**
   * Get endSellingDate
   * @return endSellingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndSellingDate() {
    return endSellingDate;
  }

  public void setEndSellingDate(OffsetDateTime endSellingDate) {
    this.endSellingDate = endSellingDate;
  }

  public Show startSellingDate(OffsetDateTime startSellingDate) {
    this.startSellingDate = startSellingDate;
    return this;
  }

  /**
   * Get startSellingDate
   * @return startSellingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartSellingDate() {
    return startSellingDate;
  }

  public void setStartSellingDate(OffsetDateTime startSellingDate) {
    this.startSellingDate = startSellingDate;
  }

  public Show name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "sonar", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Show price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Show showType(ShowTypeEnum showType) {
    this.showType = showType;
    return this;
  }

  /**
   * The show type
   * @return showType
  **/
  @ApiModelProperty(example = "MUSIC", value = "The show type")


  public ShowTypeEnum getShowType() {
    return showType;
  }

  public void setShowType(ShowTypeEnum showType) {
    this.showType = showType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Show show = (Show) o;
    return Objects.equals(this.id, show.id) &&
        Objects.equals(this.location, show.location) &&
        Objects.equals(this.ticketsAvailable, show.ticketsAvailable) &&
        Objects.equals(this.endSellingDate, show.endSellingDate) &&
        Objects.equals(this.startSellingDate, show.startSellingDate) &&
        Objects.equals(this.name, show.name) &&
        Objects.equals(this.price, show.price) &&
        Objects.equals(this.showType, show.showType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, location, ticketsAvailable, endSellingDate, startSellingDate, name, price, showType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Show {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    ticketsAvailable: ").append(toIndentedString(ticketsAvailable)).append("\n");
    sb.append("    endSellingDate: ").append(toIndentedString(endSellingDate)).append("\n");
    sb.append("    startSellingDate: ").append(toIndentedString(startSellingDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    showType: ").append(toIndentedString(showType)).append("\n");
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

