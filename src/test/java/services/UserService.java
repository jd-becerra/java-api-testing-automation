package services;

import io.restassured.response.ValidatableResponse;
import models.BaseUser;

import static io.restassured.RestAssured.given;

/**
 * Provides REST API operations for users.
 * Supports CRUD operations using JSONPlaceholder or any compatible REST service.
 */
public class UserService {
    private String endpoint = "https://jsonplaceholder.typicode.com/users";

    /**
     * Retrieves all users.
     *
     * @return ValidatableResponse containing the HTTP response
     */
    public ValidatableResponse getUsers() {
        return
            given().
            when().
                get(endpoint).
            then();
    }

    /**
     * Retrieves a single user by ID.
     *
     * @param id user ID
     * @return ValidatableResponse containing the HTTP response
     */
    public ValidatableResponse getUser(int id) {
        return
            given().
            when().
                get(endpoint + "/{id}", id).
            then();
    }

    /**
     * Creates a new user.
     *
     * @param newUser user object to create
     * @return ValidatableResponse containing the HTTP response
     */
    public ValidatableResponse createUser(BaseUser newUser) {
        return
            given().
                header("Content-Type", "application/json").
                body(newUser).
            when().
                post(endpoint).
            then();
    }

    /**
     * Updates an existing user by ID.
     *
     * @param userId user ID to update
     * @param user updated user object
     * @return ValidatableResponse containing the HTTP response
     */
    public ValidatableResponse updateUser(int userId, BaseUser user) {
        return
            given().
                body(user).
            when().
                put(endpoint + "/{id}", userId).
            then();
    }

    /**
     * Deletes a user by ID.
     *
     * @param deleteUserId user ID to delete
     * @return ValidatableResponse containing the HTTP response
     */
    public ValidatableResponse deleteUser(int deleteUserId) {
        return
            given().
            when().
                delete(endpoint + "/{id}", deleteUserId).
            then();
    }
}
