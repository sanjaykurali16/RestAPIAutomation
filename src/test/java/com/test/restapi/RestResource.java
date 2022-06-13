package com.test.restapi;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

/**
 * Represents the api calls.
 *
 * @Sanjay testing
 *
 */
public class RestResource {

  /**
   * Represents the get api calls to retrieve user details of specific userName.
   */
  public static Response getUserDetails(String value) {

    return given().param("username", value).get("https://jsonplaceholder.typicode.com/users")
        .thenReturn();
  }

  /**
   * Represents the get api calls to retrieve posts details of specific userId.
   */
  public static Response getPostDetails(String value) {

    return given().param("userId", value).get("https://jsonplaceholder.typicode.com/posts")
        .thenReturn();
  }

  /**
   * Represents the get api calls to retrieve comment details of specific postId.
   */
  public static Response getCommentDetails(String value) {

    return given().param("postId", value).get("https://jsonplaceholder.typicode.com/comments")
        .thenReturn();
  }

}
