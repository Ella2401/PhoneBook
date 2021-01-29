package model;

public class Contact {

    private int id;
    private String name;
    private String phone;
    private String city;
    private String address;
    private String email;

    public Contact() {
        super();
    }

    public Contact(int id, String name, String phone, String city, String address, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.email = email;

    }

    public void getContact() {
        System.out.println("Id:      " + getId());
        System.out.println("Name:    " + getName());
        System.out.println("Phone:   " + getPhone());
        System.out.println("City:    " + getCity());
        System.out.println("Address: " + getAddress());
        System.out.println("Email:   " + getEmail());
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getCity() {
        return this.city;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
