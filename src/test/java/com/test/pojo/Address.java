
package com.test.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

/**
 * Represents the address field in users API.
 *
 * @Sanjay testing
 *
 */
@Value
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {

  @JsonProperty("street")
  private String street;

  @JsonProperty("suite")
  private String suite;

  @JsonProperty("city")
  private String city;

  @JsonProperty("zipcode")
  private String zipcode;

  @JsonProperty("geo")
  private Geo geo;

}
