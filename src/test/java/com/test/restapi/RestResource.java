package com.test.restapi;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

/**
 * Represents a student enrolled in the school.
 *
 * @Sanjay testing
 *
 */
public class RestResource {

  public static Response getUserDetails(String value) {
    return given().param("username", value).get("https://jsonplaceholder.typicode.com/users").thenReturn();
  }

  public static Response getPostDetails(String value) {
    return given().param("userId", value).get("https://jsonplaceholder.typicode.com/posts").thenReturn();
  }

  public static Response getCommentDetails(String value) {
    return given().param("postId", value).get("https://jsonplaceholder.typicode.com/comments").thenReturn();
  }

}
