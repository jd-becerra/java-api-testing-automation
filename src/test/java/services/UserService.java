package services;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import models.ExistingUser;

import static io.restassured.RestAssured.given;

public class UserService {
    private String endpoint = "https://jsonplaceholder.typicode.com/users";

    public ValidatableResponse getUsers() {
        return
            given().
            when().
                get(endpoint).
            then();
    }

    public ValidatableResponse getUser(int id) {
        return
            given().
                queryParam("id", id).
            when().
                get(endpoint).
            then();
    }


}
