
package com.test.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

/**
 * Represents a student enrolled in the school.
 *
 * @Sanjay testing
 *
 */
@Data
@Builder
@Jacksonized
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Posts {

  @JsonProperty("userId")
  private Object userId;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("title")
  private Integer title;

  @JsonProperty("body")
  private Integer body;

}
