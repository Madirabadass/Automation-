import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import javafx.scene.layout.Priority;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

import java.security.Key;


public class Postmen {

    public static String token;

    @Test(priority = 1)
    public void loginAccesstoken(){
        RestAssured.baseURI ="https://api.betwayafrica.com";
        String responsebody = RestAssured.given().log().all().queryParam("s").header("Authorization", "Basic MjU4ODkyMjIyMjIwOmNhc2lubzEy").body("").when().post("api/v4/Authenticate/Login").then().log().all().assertThat().statusCode(200)
        .extract().response().asString();
        System.out.println("The body is" + responsebody);
        JsonPath jsp = new JsonPath(responsebody);
        token = jsp.getString("accessToken");
        System.out.println("The acesstaken extracted from the response body is: "+ token);

    }

    @Test(priority = 2)
    public void getAccounts() {
        RestAssured.baseURI = "https://api.betwayafrica.com";
        String responsebody = RestAssured.given().log().all().queryParam("").header("Authorization", "Bearer"+" "+token).body("").when().get("api/v2/Mozambique/Account").then().log().all().assertThat().statusCode(200)
                .extract().response().asString();
        System.out.println("The body is" + responsebody);

    }
    @Test(priority = 3)
    public void getBalances() {
        RestAssured.baseURI = "https://api.betwayafrica.com";
        String responsebody = RestAssured.given().log().all().queryParam("").header("Authorization", "Bearer"+" "+token).body("").when().get("api/v2/Balance").then().log().all().assertThat().statusCode(200)
                .extract().response().asString();
        System.out.println("The body is" + responsebody);
    }
    @Test(priority = 4)
    public void updatedetails()
    {


    }
}
