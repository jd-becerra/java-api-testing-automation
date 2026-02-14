package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import services.UserService;

/**
 * Base class for API tests.
 * Initializes the UserService before running any test.
 */
public class BaseApiTest {
    protected UserService service;

    /** Initializes the user service before tests */
    @BeforeMethod(
        alwaysRun = true
    )
    public void initTest() {
        service = new UserService();
    }
}
