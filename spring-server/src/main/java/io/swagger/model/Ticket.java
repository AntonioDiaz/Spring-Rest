package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ticket
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T11:21:23.367Z")

public class Ticket   {
  @JsonProperty("number_of_tickets")
  private Long numberOfTickets = null;

  @JsonProperty("email")
  private String email = null;

  public Ticket numberOfTickets(Long numberOfTickets) {
    this.numberOfTickets = numberOfTickets;
    return this;
  }

  /**
   * How many tickets do you need?
   * @return numberOfTickets
  **/
  @ApiModelProperty(value = "How many tickets do you need?")


  public Long getNumberOfTickets() {
    return numberOfTickets;
  }

  public void setNumberOfTickets(Long numberOfTickets) {
    this.numberOfTickets = numberOfTickets;
  }

  public Ticket email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Ticket holder email (used to send confirmation)
   * @return email
  **/
  @ApiModelProperty(value = "Ticket holder email (used to send confirmation)")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ticket ticket = (Ticket) o;
    return Objects.equals(this.numberOfTickets, ticket.numberOfTickets) &&
        Objects.equals(this.email, ticket.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfTickets, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticket {\n");
    
    sb.append("    numberOfTickets: ").append(toIndentedString(numberOfTickets)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

