import java.time.LocalDate;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}

public class Package {
    private static int nextTrackingNumber = 1;

    private String trackingNumber;
    private Address senderAddress;
    private Address recipientAddress;
    private LocalDate estimatedDeliveryDate;

    public Package(Address senderAddress, Address recipientAddress, LocalDate estimatedDeliveryDate) {
        this.trackingNumber = "AS" + String.format("%03d", nextTrackingNumber++);
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public Address getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(Address senderAddress) {
        this.senderAddress = senderAddress;
    }

    public Address getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(Address recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public LocalDate getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    @Override
    public String toString() {
        return "Package " + trackingNumber + "\nSender Address: " + senderAddress + "\nRecipient Address: " + recipientAddress + "\nEstimated Delivery Date: " + estimatedDeliveryDate;
    }
}