package eStore;

public class Address {
    private String houseNumber;
    private String street;
    private String cityName;
    private String state;
    private String countryName;

    public Address(String houseNumber, String street, String cityName, String state, String countryName){
        this.houseNumber = houseNumber;
        this.street = street;
        this.cityName = cityName;
        this.state = state;
        this.countryName = countryName;
    }
}
