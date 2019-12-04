package question2;

public class Address {
    String ally;
    String street;
    int zone;
    String city;
    long postalCode;

    public Address(String ally, String street, int zone, String city, long postalCode) {
        this.ally = ally;
        this.street = street;
        this.zone = zone;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "ally='" + ally + '\'' +
                ", street='" + street + '\'' +
                ", zone=" + zone +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }


}
