package providers;

import models.*;
import org.testng.annotations.DataProvider;

public class UserDataProvider {
    @DataProvider(name = "usersToGet")
    public static Object[][] usersToGet() {
        return new Object[][] {
            {
                new ExistingUser(
                    1,
                    "Leanne Graham",
                    "Bret",
                    "Sincere@april.biz",
                    new Address(
                        "Kulas Light",
                        "Apt. 556",
                        "Gwenborough",
                        "92998-3874",
                        new GeoLocation(
                            "-37.3159",
                            "81.1496"
                        )
                    ),
                    "1-770-736-8031 x56442",
                    "hildegard.org",
                    new Company(
                        "Romaguera-Crona",
                        "Multi-layered client-server neural-net",
                        "harness real-time e-markets"
                    )
                )
            }
        };
    }

    @DataProvider(name = "usersToCreate")
    public static Object[][] usersToCreate() {
        return new Object[][] {
            {
                new BaseUser(
                    "Jane Doe",
                    "jane_doe",
                    "jane_doe@gmail.com",
                    new Address(
                        "Street 1",
                        "Suite 20",
                        "San Francisco",
                        "39840",
                        new GeoLocation(
                            "30.293",
                            "29.39"
                        )
                    ),
                    "398-299-2000",
                    "jane_doe.com",
                    new Company(
                        "Company 1",
                        "This is our catchphrase",
                        "This is our bs"
                    )
                )
            }
        };
    }

    @DataProvider(name = "usersToUpdate")
    public static Object[][] usersToUpdate() {
        return new Object[][] {
            {
                new BaseUser(
                    "Jane Doe Updated",
                    "jane_doe_updated",
                    "jane_doe_updated@gmail.com",
                    new Address(
                        "Street 1 Updated",
                        "Suite 20 Updated",
                        "San Francisco Updated",
                        "39840 Updated",
                        new GeoLocation(
                            "30.293",
                            "29.39"
                        )
                    ),
                    "398-299-2000",
                    "jane_doe_updated.com",
                    new Company(
                        "Company 1 Updated",
                        "This is our catchphrase Updated",
                        "This is our bs Updated"
                    )
                )
            }
        };
    }
}
