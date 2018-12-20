package Ch8Classes;

public class Address {
    private int houseNum;
    private String aptNum;
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address(int houseNum, String street, String city, String state, int zip) {
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(String aptNum, String street, String city, String state, int zip) {
        this.aptNum = aptNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNum=" + houseNum +
                ", aptNum='" + aptNum + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
