package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Apisteps {

    @Given("Add place payload")
    public void add_place_payload() {

            RestAssured.baseURI ="https://api.betwayafrica.com";
            RestAssured.given().log().all().queryParam("").header("Authorization", "Basic MjU4ODkyMjIyMjIwOmNhc2lubzEy").body("").when().post("api/v4/Authenticate/Login").then().log().all().assertThat().statusCode(200);
            //String respponsebody
            //System.out.println("The body is" + respponsebody);
        // Write code here that turns the phrase above into concrete actions
        // System.out.println("Add the steps needed");

        throw new io.cucumber.java.PendingException();
    }
    @When("User calls {string} with post http request")
    public void user_calls_with_post_http_request(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the Api call is success with status code {int}")
    public void the_api_call_is_success_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("status in response is OK")
    public void status_in_response_is_ok() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I run the {string} api")
    public void iRunTheApi(String arg0) {

            RestAssured.baseURI ="https://api.betwayafrica.com";
            RestAssured.given().log().all().queryParam("").header("Authorization", "Basic MjU4ODkyMjIyMjIwOmNhc2lubzEy").body("").when().post("api/v4/Authenticate/Login").then().log().all().assertThat().statusCode(200);
            //String respponsebody
            //System.out.println("The body is" + respponsebody);

    }
}
