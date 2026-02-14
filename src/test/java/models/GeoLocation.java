package models;

import java.util.Objects;

/**
 * Represents geographic coordinates of an address returned by the API.
 * Used as a nested object inside {Address}.
 */
public class GeoLocation {
    private String lat;  // Latitude
    private String lng;  // Longitude

    /**
     * Creates a GeoLocation instance.
     *
     * @param lat latitude value
     * @param lng longitude value
     */
    public GeoLocation(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    // Getters
    public String getLat() { return lat; }
    public String getLng() { return lng; }

    /**
     * Returns JSON representation of the location.
     */
    @Override
    public String toString() {
        return "{\n" +
            "   lat: " + getLat() + ",\n" +
            "   lng: " + getLng() + "\n" +
        "}";
    }

    /**
     * Compares GeoLocation objects by value.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GeoLocation that = (GeoLocation) o;
        return Objects.equals(lat, that.lat) && Objects.equals(lng, that.lng);
    }

    /**
     * Generates hash code consistent with equals().
     */
    @Override
    public int hashCode() {
        return Objects.hash(lat, lng);
    }
}
