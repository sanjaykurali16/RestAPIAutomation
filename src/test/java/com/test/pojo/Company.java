
package com.test.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

/**
 * Represents a student enrolled in the school.
 *
 * @Sanjay testing
 *
 */
@Value
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Company {

  @JsonProperty("name")
  private String name;

  @JsonProperty("catchPhrase")
  private String catchPhrase;

  @JsonProperty("bs")
  private String bs;

}
