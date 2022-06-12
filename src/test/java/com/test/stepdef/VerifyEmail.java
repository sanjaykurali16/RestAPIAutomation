package com.test.stepdef;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.pojo.Posts;
import com.test.pojo.Users;
import com.test.restapi.RestResource;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

/**
 * Represents a student enrolled in the school.
 *
 * @Sanjay testing
 *
 */
public class VerifyEmail {

  String userId;
  List<String> postsId;

  @Given("Users, Posts, comments api is up & running")
  public void users_posts_comments_api_is_up_running() {
    // Write code here that turns the phrase above into concrete actions

  }

  @When("Search for user with name {string}")
  public void search_for_user_with_name(String userName) throws Exception {
    // Write code here that turns the phrase above into concrete actions

    Response response = RestResource.getUserDetails(userName);
    System.out.println(response.asString());
    ObjectMapper mapper = new ObjectMapper();
    Users[] user = mapper.readValue(response.asString(), Users[].class);
    userId = user[0].getUserId().toString();
    System.out.println(userId);

  }

  @When("Search for the post with user Id")
  public void search_for_the_post_with_user_id() throws Exception {
    // Write code here that turns the phrase above into concrete actions

    Response response = RestResource.getPostDetails(userId);
    ObjectMapper mapper = new ObjectMapper();
    Posts[] postAll = mapper.readValue(response.asString(), Posts[].class);

    for (Posts post : postAll) {
      postsId.add(post.getId().toString());
    }

  }

  @When("Search for the comment with post Id")
  public void search_for_the_comment_with_post_id() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("Verify the email format")
  public void verify_the_email_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

}
