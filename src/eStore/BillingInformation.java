package eStore;

public class BillingInformation {
    private String receiverName;
    private String receiverPhoneNumber;
    private Address deliveryAddress;
    private CreditCardInformation creditCardInformation;

    public BillingInformation(String receiverName, String receiverPhoneNumber, Address deliveryAddress, CreditCardInformation creditCardInformation){
        this.receiverName = receiverName;
        this.receiverPhoneNumber = receiverPhoneNumber;
        this. deliveryAddress = deliveryAddress;
        this.creditCardInformation = creditCardInformation;
    }
}
