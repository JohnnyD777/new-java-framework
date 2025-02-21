package Controllers;

import io.restassured.specification.RequestSpecification;
import Models.User;

import static Constants.CommonConstants.BASE_URI;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;


public class PetController {
    RequestSpecification requestSpecification;
    private static final String USER_ENDPOINT = "pet";

    public PetController(){
        this.requestSpecification = given()
                .accept(JSON)
                .contentType(JSON)
                .baseUri(BASE_URI);
    }

 //Implement

}
