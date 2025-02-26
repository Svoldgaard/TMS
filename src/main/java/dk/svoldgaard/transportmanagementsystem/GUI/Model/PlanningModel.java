package dk.svoldgaard.transportmanagementsystem.GUI.Model;

// project import

import dk.svoldgaard.transportmanagementsystem.BE.Booking;
import dk.svoldgaard.transportmanagementsystem.BE.TruckTrailer;
import dk.svoldgaard.transportmanagementsystem.BE.Trip;

// Java import
import dk.svoldgaard.transportmanagementsystem.BLL.PlanningManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.List;

public class PlanningModel {

    private PlanningManager planningManager;

    private ObservableList<Booking> tblBooking;
    private ObservableList<Booking> tblCurrentTureselected;
    private ObservableList<TruckTrailer> tblTruckTrailer;
    private ObservableList<Trip> lstCurrentTurs;

    public PlanningModel() {

        planningManager = new PlanningManager();

        tblBooking = FXCollections.observableArrayList();
        tblCurrentTureselected = FXCollections.observableArrayList();
        tblTruckTrailer = FXCollections.observableArrayList();
        lstCurrentTurs = FXCollections.observableArrayList();

        // Call individual methods to populate the lists with mock data
        mockDataBookingList();
        mockDataCurrentTripBooking();
        mockDataTruckTrailerList();
        mockDataCurrentTursList();
    }

    public void searchBooking(String query){
        List<Booking> searchResults = planningManager.searchMovies(query);
        tblBooking.clear();
        tblBooking.addAll(searchResults);
    }


    public ObservableList<Booking> getBooking() {
        return tblBooking;
    }

    public ObservableList<Booking> getCurrentTripBooking() {
        return tblCurrentTureselected;
    }

    public ObservableList<TruckTrailer> getTruckTrailer() {
        return tblTruckTrailer;
    }

    public ObservableList<Trip> getCurrentTurs() {
        return lstCurrentTurs;
    }

    // Method to mock data for tblBooking
    public void mockDataBookingList() {
        tblBooking.add(
                new Booking(
                        1,
                        "Holst Sørensen",
                        "Traktor Hallen",
                        LocalDate.of(2024, 2, 12),
                        2544,
                        "NL",
                        "Brdr Holst Sørensen Ribe",
                        LocalDate.of(2025, 2, 14),
                        6760,
                        "NL",
                        24000.00,
                        33,
                        9800.00
                )
        );
        tblBooking.add(
                new Booking(
                        2,
                        "John Doe",
                        "Warehouse A",
                        LocalDate.of(2024, 3, 15),
                        8000,
                        "DK",
                        "Transport Co.",
                        LocalDate.of(2025, 3, 18),
                        5000,
                        "DK",
                        15000.00,
                        20,
                        9500.00
                )
        );
        tblBooking.add(
                new Booking(
                        3,
                        "Anna Schmidt",
                        "Port B",
                        LocalDate.of(2024, 5, 1),
                        3000,
                        "DE",
                        "Logistics GmbH",
                        LocalDate.of(2025, 5, 5),
                        5000,
                        "DE",
                        22000.00,
                        15,
                        11000.00
                )
        );
    }

    // Method to mock data for tblCurrentTureselected
    public void mockDataCurrentTripBooking() {
        tblCurrentTureselected.add(
                new Booking(
                        1,
                        "Holst Sørensen",
                        "Traktor Hallen",
                        LocalDate.of(2024, 2, 12),
                        2544,
                        "NL",
                        "Brdr Holst Sørensen Ribe",
                        LocalDate.of(2025, 2, 14),
                        6760,
                        "NL",
                        24000.00,
                        33,
                        9800.00
                )
        );
        tblCurrentTureselected.add(
                new Booking(
                        2,
                        "John Doe",
                        "Warehouse A",
                        LocalDate.of(2024, 3, 15),
                        8000,
                        "DK",
                        "Transport Co.",
                        LocalDate.of(2025, 3, 18),
                        5000,
                        "DK",
                        15000.00,
                        20,
                        9500.00
                )
        );
    }

    // Method to mock data for tblTruckTrailer
    public void mockDataTruckTrailerList() {
        tblTruckTrailer.add(
                new TruckTrailer(
                        "AD12344",
                        "AD7567"
                )
        );
        tblTruckTrailer.add(
                new TruckTrailer(
                        "AB56789",
                        "XY23456"
                )
        );
        tblTruckTrailer.add(
                new TruckTrailer(
                        "XY67890",
                        "AD12345"
                )
        );
    }

    // Method to mock data for lstCurrentTurs
    public void mockDataCurrentTursList() {
        lstCurrentTurs.add(new Trip(1));
        lstCurrentTurs.add(new Trip(2));
        lstCurrentTurs.add(new Trip(3));
    }
}
