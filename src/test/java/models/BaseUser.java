package models;

import java.util.Objects;

/**
 * Represents the base user model returned by the API.
 * Contains common user fields shared by {ExistingUser}.
 */
public class BaseUser {
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    /**
     * Creates a BaseUser instance.
     *
     * @param name full name
     * @param username username
     * @param email email address
     * @param address address object
     * @param phone phone number
     * @param website website URL
     * @param company company object
     */
    public BaseUser(
        String name,
        String username,
        String email,
        Address address,
        String phone,
        String website,
        Company company
    ) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    // Getters
    public String getName() { return name; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public Address getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getWebsite() { return website; }
    public Company getCompany() { return company; }

    /**
     * Returns JSON representation of the user.
     */
    @Override
    public String toString() {
        return "{\n" +
            "   name: " + getName() + ",\n" +
            "   username: " + getUsername() + ",\n" +
            "   email: " + getEmail() + ",\n" +
            "   address: " + getAddress() + ",\n" +
            "   phone: " + getPhone() + ",\n" +
            "   website: " + getWebsite() + ",\n" +
            "   company: " + getCompany() + "\n" +
        "}";
    }

    /**
     * Compares users by value.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseUser that = (BaseUser) o;

        return Objects.equals(name, that.name) &&
            Objects.equals(username, that.username) &&
            Objects.equals(email, that.email) &&
            Objects.equals(address, that.address) &&
            Objects.equals(phone, that.phone) &&
            Objects.equals(website, that.website) &&
            Objects.equals(company, that.company);
    }

    /**
     * Generates hash code consistent with equals().
     */
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            username,
            email,
            address,
            phone,
            website,
            company
        );
    }
}
