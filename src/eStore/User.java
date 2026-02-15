package eStore;

public class User {
    private String name;
    private int age;
    private String password;
    private String emailAddress;
    private Address homeAddress;
    private String phoneNumber;

    public User(String name, int age, String password, String emailAddress, Address homeAddress, String phoneNumber){
        this.name = name;
        this.age = age;
        this.password = password;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }
}
