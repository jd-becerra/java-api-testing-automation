package models;

import java.util.Objects;

/**
 * Represents a user with an assigned ID returned by the API.
 * Extends {@link BaseUser} with the unique user identifier.
 */
public class ExistingUser extends BaseUser{
    private final int id;

    /**
     * Creates an ExistingUser instance.
     *
     * @param id unique user ID
     * @param name full name
     * @param username username
     * @param email email address
     * @param address address object
     * @param phone phone number
     * @param website website URL
     * @param company company object
     */
    public ExistingUser(int id, String name, String username, String email, Address address, String phone, String website, Company company) {
        super(name, username, email, address, phone, website, company);
        this.id = id;
    }

    // Getters
    public int getId() { return id; }

    /**
     * Compares users by value, including ID.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExistingUser)) return false;
        if (!super.equals(o)) return false;

        ExistingUser that = (ExistingUser) o;

        return id == that.id;
    }

    /**
     * Generates hash code consistent with equals().
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
