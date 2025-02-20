package dk.svoldgaard.transportmanagementsystem.BE;

import java.time.LocalDate;

public class Booking {

    private int bookingNumber;
    private String client;
    private String loadingPlace;
    private LocalDate loadingDate;
    private int loadingZipCode;
    private String loadingCountryCode;
    private String deliveryPlace;
    private LocalDate deliveryDate;
    private int deliveryZipCode;
    private String deliveryCountryCode;
    private Double weight;
    private int cllAmount;
    private Double loadingMeter;  // This is LDM
    private Double price;

    // New Fields to match BookingController
    private String mark;
    private String palletType;
    private int length;
    private int width;
    private int height;
    private int m2;

    // Constructor
    public Booking(int bookingNumber, String client, String loadingPlace, LocalDate loadingDate, int loadingZipCode, String loadingCountryCode,
                   String deliveryPlace, LocalDate deliveryDate, int deliveryZipCode, String deliveryCountryCode,
                   Double weight, int cllAmount, Double loadingMeter) {

        this.bookingNumber = bookingNumber;
        this.client = client;
        this.loadingPlace = loadingPlace;
        this.loadingDate = loadingDate;
        this.loadingZipCode = loadingZipCode;
        this.loadingCountryCode = loadingCountryCode;
        this.deliveryPlace = deliveryPlace;
        this.deliveryDate = deliveryDate;
        this.deliveryZipCode = deliveryZipCode;
        this.deliveryCountryCode = deliveryCountryCode;
        this.weight = weight;
        this.cllAmount = cllAmount;
        this.loadingMeter = loadingMeter;
    }

    public Booking(int m2, int height, int width, int length, String palletType, String mark, Double loadingMeter, int cllAmount, Double weight) {
        this.m2 = m2;
        this.height = height;
        this.width = width;
        this.length = length;
        this.palletType = palletType;
        this.mark = mark;
        this.loadingMeter = loadingMeter;
        this.cllAmount = cllAmount;
        this.weight = weight;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getLoadingPlace() {
        return loadingPlace;
    }

    public void setLoadingPlace(String loadingPlace) {
        this.loadingPlace = loadingPlace;
    }

    public LocalDate getLoadingDate() {
        return loadingDate;
    }

    public void setLoadingDate(LocalDate loadingDate) {
        this.loadingDate = loadingDate;
    }

    public int getLoadingZipCode() {
        return loadingZipCode;
    }

    public void setLoadingZipCode(int loadingZipCode) {
        this.loadingZipCode = loadingZipCode;
    }

    public String getLoadingCountryCode() {
        return loadingCountryCode;
    }

    public void setLoadingCountryCode(String loadingCountryCode) {
        this.loadingCountryCode = loadingCountryCode;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getDeliveryZipCode() {
        return deliveryZipCode;
    }

    public void setDeliveryZipCode(int deliveryZipCode) {
        this.deliveryZipCode = deliveryZipCode;
    }

    public String getDeliveryCountryCode() {
        return deliveryCountryCode;
    }

    public void setDeliveryCountryCode(String deliveryCountryCode) {
        this.deliveryCountryCode = deliveryCountryCode;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getCllAmount() {
        return cllAmount;
    }

    public void setCllAmount(int cllAmount) {
        this.cllAmount = cllAmount;
    }

    public Double getLoadingMeter() {
        return loadingMeter;
    }

    public void setLoadingMeter(Double loadingMeter) {
        this.loadingMeter = loadingMeter;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingNumber=" + bookingNumber +
                ", client='" + client + '\'' +
                ", loadingPlace='" + loadingPlace + '\'' +
                ", loadingDate=" + loadingDate +
                ", loadingZipCode=" + loadingZipCode +
                ", loadingCountryCode='" + loadingCountryCode + '\'' +
                ", deliveryPlace='" + deliveryPlace + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", deliveryZipCode=" + deliveryZipCode +
                ", deliveryCountryCode='" + deliveryCountryCode + '\'' +
                ", weight=" + weight +
                ", cllAmount=" + cllAmount +
                ", loadingMeter=" + loadingMeter +
                ", price=" + price +
                '}';
    }
}
