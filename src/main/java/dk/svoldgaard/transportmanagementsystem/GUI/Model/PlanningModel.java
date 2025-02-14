package dk.svoldgaard.transportmanagementsystem.GUI.Model;

// project import

import dk.svoldgaard.transportmanagementsystem.BE.Booking;

// Java import
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class PlanningModel {

    private ObservableList<Booking> tblBooking;


    public PlanningModel() {
        tblBooking = FXCollections.observableArrayList();
        mockDataPlanningList();
    }

    public ObservableList<Booking> getBooking() {
        return tblBooking;
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
