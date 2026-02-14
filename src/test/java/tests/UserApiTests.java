package tests;

import io.restassured.response.ValidatableResponse;
import models.BaseUser;
import models.ExistingUser;
import org.testng.annotations.Test;
import providers.UserDataProvider;
import utils.Log;

import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

/**
 * Contains API tests for user endpoints.
 * Includes GET, POST, PUT, and DELETE validations with logging.
 */
public class UserApiTests extends BaseApiTest {

    /** Validates that retrieving all users returns HTTP 200. */
    @Test(groups = "getValidation")
    public void getUsersShouldReturn200() {
        Log.info("Sending GET request to retrieve all users.");
        ValidatableResponse response = service.getUsers();
        Log.info("Response received: " + response.extract().asString());
        response.assertThat().statusCode(200);
    }

    /** Validates content-type header for retrieving all users. */
    @Test(groups = "getValidation")
    public void getUsersContentTypeHeaderShouldBeJson() {
        Log.info("Sending GET request to retrieve all users (header check).");
        String expectedHeader = "application/json; charset=utf-8";
        ValidatableResponse response = service.getUsers();
        Log.info("Response headers: " + response.extract().headers().toString());
        response.assertThat().header("Content-Type", equalTo(expectedHeader));
    }

    /** Validates that retrieving all users returns 10 items. */
    @Test(groups = "getValidation")
    public void getUsersShouldReturnTenItems() {
        Log.info("Sending GET request to retrieve all users (size check).");
        int expectedSize = 10;
        ValidatableResponse response = service.getUsers();
        Log.info("Response body: " + response.extract().asString());
        response.assertThat().body("items.size()", equalTo(expectedSize));
    }

    /** Validates that retrieving a single user matches the expected user object. */
    @Test(groups = "getValidation",
        dataProvider = "usersToGet",
        dataProviderClass = UserDataProvider.class)
    public void getUserShouldReturnUserType(ExistingUser expectedUser) {
        int userId = 1;
        Log.info("Sending GET request to retrieve user with id: " + userId);
        ValidatableResponse response = service.getUser(userId);
        ExistingUser actualUser = response.extract().as(ExistingUser.class);
        Log.info("Expected user: " + expectedUser);
        Log.info("Actual user: " + actualUser);
        assertEquals(actualUser, expectedUser);
    }

    /** Validates that creating a user returns HTTP 201. */
    @Test(groups = "postValidation",
        dataProvider = "usersToCreate",
        dataProviderClass = UserDataProvider.class)
    public void createUserShouldReturn201(BaseUser userData) {
        Log.info("Sending POST request to create user: " + userData);
        ValidatableResponse response = service.createUser(userData);
        Log.info("Response received: " + response.extract().asString());
        response.assertThat().statusCode(201);
    }

    /** Validates that updating a user returns HTTP 200. */
    @Test(groups = "putValidation",
        dataProvider = "usersToUpdate",
        dataProviderClass = UserDataProvider.class)
    public void updateUserShouldReturn200(BaseUser userData) {
        int userId = 1;
        Log.info("Updating user with id: " + userId);
        Log.info("User body to send: " + userData);
        ValidatableResponse response = service.updateUser(userId, userData);
        Log.info("Response received: " + response.extract().asString());
        response.assertThat().statusCode(200);
    }

    /** Validates that deleting a user returns HTTP 200. */
    @Test(groups = "deleteValidation")
    public void deleteUserShouldReturn200() {
        int userId = 1;
        Log.info("Sending DELETE request for user with id: " + userId);
        ValidatableResponse response = service.deleteUser(userId);
        Log.info("Response received: " + response.extract().asString());
        response.assertThat().statusCode(200);
    }
}