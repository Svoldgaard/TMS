package dk.svoldgaard.transportmanagementsystem.GUI.Model;

// project import

import dk.svoldgaard.transportmanagementsystem.BE.Booking;
import dk.svoldgaard.transportmanagementsystem.BE.TruckTrailer;

// Java import
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class PlanningModel {

    private ObservableList<Booking> tblBooking;
    private ObservableList<Booking> tblCurrentTureselected;
    private ObservableList<TruckTrailer> tblTruckTrailer;


    public PlanningModel() {
        tblBooking = FXCollections.observableArrayList();
        tblCurrentTureselected = FXCollections.observableArrayList();
        tblTruckTrailer = FXCollections.observableArrayList();
        mockDataPlanningList();
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

    public void mockDataPlanningList() {
        tblBooking.add(
                new Booking(
                        1,
                        "Holst Sørensen",
                        "Traktor Hallen",
                        LocalDate.of(2024, 2, 12),  // Convert the date to LocalDate
                        2544,
                        "NL",
                        "Brdr Holst Sørensen Ribe",
                        LocalDate.of(2025, 2, 14),  // Convert the date to LocalDate
                        6760,
                        "NL",
                        24000.00,
                        33,
                        9800.00
                )
        );
    }

}
