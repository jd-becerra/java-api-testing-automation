package models;

public class ExistingUser extends BaseUser {
    private int id;

    public ExistingUser(
        int id,
        String name,
        String username,
        String email,
        Address address,
        String phone,
        String website,
        Company company
    ) {
        super(name, username, email, address, phone, website, company);
        this.id = id;
    }

    public int getId() { return id; }
}
