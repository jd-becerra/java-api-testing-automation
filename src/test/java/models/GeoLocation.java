package models;

public class GeoLocation {
    private double lat;  // Latitude
    private double lng;  // Longitude

    public GeoLocation(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() { return lat; }
    public double getLng() { return lng; }
}
