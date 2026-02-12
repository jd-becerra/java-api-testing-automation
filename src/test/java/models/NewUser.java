package models;

public class NewUser extends BaseUser{
    public NewUser(String name, String username, String email, Address address, String phone, String website, Company company) {
        super(name, username, email, address, phone, website, company);
    }
}
