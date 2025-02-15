package dk.svoldgaard.transportmanagementsystem.BE;

public class TruckTrailer {
    private String truckPlate;
    private String trailerPlate;

    public TruckTrailer(String truckPlate, String trailerPlate) {
        this.truckPlate = truckPlate;
        this.trailerPlate = trailerPlate;
    }

    public String getTruckPlate() {
        return truckPlate;
    }

    public void setTruckPlate(String truckPlate) {
        this.truckPlate = truckPlate;
    }

    public String getTrailerPlate() {
        return trailerPlate;
    }

    public void setTrailerPlate(String trailerPlate) {
        this.trailerPlate = trailerPlate;
    }

    @Override
    public String toString() {
        return "TruckTrailer{" +
                "truckPlate='" + truckPlate + '\'' +
                ", trailerPlate='" + trailerPlate + '\'' +
                '}';
    }
}
