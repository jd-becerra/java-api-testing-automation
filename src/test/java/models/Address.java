package models;

import java.util.Objects;

/**
 * Represents the address part of a user object returned by the API.
 * Used as a nested model inside {BaseUser}.
 */
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoLocation geo;

    /**
     * Creates an Address instance.
     *
     * @param street street name
     * @param suite apartment/suite information
     * @param city city name
     * @param zipcode postal code
     * @param geo geographic location
     */
    public Address(String street, String suite, String city, String zipcode, GeoLocation geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    // Getters
    public String getStreet() { return street; }
    public String getSuite() { return suite; }
    public String getCity() { return city; }
    public String getZipcode() { return zipcode; }
    public GeoLocation getGeo() { return geo;}

    /**
     * Returns JSON representation of the address.
     */
    @Override
    public String toString() {
        return "{\n" +
            "       street: " + getStreet() + ",\n" +
            "       suite: " + getSuite() + ",\n" +
            "       city: " + getCity() + ",\n" +
            "       zipcode: " + getZipcode() + ",\n" +
            "       geo: " + getGeo() + "\n" +
        "   }";
    }

    /**
     * Compares address objects by value.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address that = (Address) o;

        return Objects.equals(street, that.street) &&
            Objects.equals(suite, that.suite) &&
            Objects.equals(city, that.city) &&
            Objects.equals(zipcode, that.zipcode) &&
            Objects.equals(geo, that.geo);
    }

    /**
     * Compares address objects by value.
     */
    @Override
    public int hashCode() {
        return Objects.hash(street, suite, city, zipcode, geo);
    }
}
