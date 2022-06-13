package com.test.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

/**
 * Represents the response body of Users API.
 *
 * @Sanjay testing
 *
 */
@Data
@Builder
@Jacksonized
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Users {

  @JsonProperty("id")
  private Integer userId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("username")
  private String userName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("phone")
  private String phoneNumber;

  @JsonProperty("website")
  private String website;

  @JsonProperty("company")
  private Company company;

}
