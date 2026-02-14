package models;

import java.util.Objects;

/**
 * Represents company information of a user returned by the API.
 * Used as a nested object inside {BaseUser}.
 */
public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    /**
     * Creates a Company instance.
     *
     * @param name company name
     * @param catchPhrase company catchphrase
     * @param bs business slogan/description
     */
    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    // Getters
    public String getName() { return name; }
    public String getCatchPhrase() { return catchPhrase; }
    public String getBs() { return bs; }

    /**
     * Returns JSON representation of the company.
     */
    public String toString() {
        return "{\n" +
            "   name: " + getName() + ",\n" +
            "   catchphrase: " + getCatchPhrase() + "\n" +
            "   bs: " + getBs() + "\n" +
            "}";
    }

    /**
     * Compares companies by value.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company that = (Company) o;

        return Objects.equals(name, that.name) &&
            Objects.equals(catchPhrase, that.catchPhrase) &&
            Objects.equals(bs, that.bs);
    }

    /**
     * Generates hash code consistent with equals().
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, catchPhrase, bs);
    }
}
