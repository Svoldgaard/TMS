package dk.svoldgaard.transportmanagementsystem.BE;

public class Trip {
    private int tripNumber;

    public Trip(int tripNumber) {
        this.tripNumber = tripNumber;
    }

    public int getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(int tripNumber) {
        this.tripNumber = tripNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(tripNumber);
    }
}
