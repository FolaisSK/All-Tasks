package eStore;

import java.util.ArrayList;

public class Customer extends User{
    private ArrayList<String> billingInformation = new ArrayList<String>();

    public Customer(String name, int age, String password, String emailAddress, Address homeAddress, String phoneNumber) {
        super(name, age, password, emailAddress, homeAddress, phoneNumber);
    }


}
