package com.test.stepdef;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.pojo.Comments;
import com.test.pojo.Posts;
import com.test.pojo.Users;
import com.test.restapi.RestResource;
import com.test.utility.PropertiesFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;
import org.testng.asserts.SoftAssert;

/**
 * Step Definition for verify email feature.
 *
 * @Sanjay testing
 *
 */
public class VerifyEmail {

  String userId;
  List<String> postsId = new ArrayList<>();
  List<String> emailsId = new ArrayList<>();
  Properties prop;

  @Given("Search for user with name {string}")
  public void search_for_user_with_name(String userName) throws Exception {
    // Write code here that turns the phrase above into concrete actions

    prop = PropertiesFileReader.getProperty();

    Response response = RestResource.getUserDetails(userName, prop.getProperty("usersPath"));
    ObjectMapper mapper = new ObjectMapper();
    Users[] user = mapper.readValue(response.asString(), Users[].class);

    userId = user[0].getUserId().toString();

  }

  @When("Search for the post with user Id")
  public void search_for_the_post_with_user_id() throws Exception {
    // Write code here that turns the phrase above into concrete actions

    Response response = RestResource.getPostDetails(userId, prop.getProperty("postsPath"));
    ObjectMapper mapper = new ObjectMapper();
    Posts[] postAll = mapper.readValue(response.asString(), Posts[].class);

    for (Posts post : postAll) {

      postsId.add(post.getId().toString());
    }

  }

  @When("Search for the comment with post Id")
  public void search_for_the_comment_with_post_id() throws Exception {
    // Write code here that turns the phrase above into concrete actions

    for (String postId : postsId) {

      Response response = RestResource.getCommentDetails(postId, prop.getProperty("commentPath"));
      ObjectMapper mapper = new ObjectMapper();
      Comments[] commentAll = mapper.readValue(response.asString(), Comments[].class);

      for (Comments comment : commentAll) {

        emailsId.add(comment.getEmail().toString());
      }

    }
  }

  @Then("Verify the email format")
  public void verify_the_email_format() {
    // Write code here that turns the phrase above into concrete actions

    SoftAssert soft = new SoftAssert();

    for (String emailId : emailsId) {

      String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
          + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

      Pattern pattern = Pattern.compile(emailRegex);
      soft.assertTrue(pattern.matcher(emailId).matches(), "Email Id is of Incorrect Format");
    }

    soft.assertAll();

  }

}
