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
  public static Response getUserDetails(String value, String path) {

    return given().param("username", value).get(path).thenReturn();
  }

  /**
   * Represents the get api calls to retrieve posts details of specific userId.
   */
  public static Response getPostDetails(String value, String path) {

    return given().param("userId", value).get(path).thenReturn();
  }

  /**
   * Represents the get api calls to retrieve comment details of specific postId.
   */
  public static Response getCommentDetails(String value, String path) {

    return given().param("postId", value).get(path).thenReturn();
  }

}
