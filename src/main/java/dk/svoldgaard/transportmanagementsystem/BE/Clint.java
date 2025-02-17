package dk.svoldgaard.transportmanagementsystem.BE;

public class Clint {

    private int clintId;
    private String clintName;
    private String clintAdress;
    private int zipCode;
    private String city;

    public Clint(int clintId, String clintName, String clintAdress, int zipCode, String city) {
        this.clintId = clintId;
        this.clintName = clintName;
        this.clintAdress = clintAdress;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Clint(String clintName) {
        this.clintName = clintName;
    }

    public int getClintId() {
        return clintId;
    }

    public void setClintId(int clintId) {
        this.clintId = clintId;
    }

    public String getClintName() {
        return clintName;
    }

    public void setClintName(String clintName) {
        this.clintName = clintName;
    }

    public String getClintAdress() {
        return clintAdress;
    }

    public void setClintAdress(String clintAdress) {
        this.clintAdress = clintAdress;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return clintName;
    }
}
