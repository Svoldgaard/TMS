package dk.svoldgaard.transportmanagementsystem.GUI.Model;

import dk.svoldgaard.transportmanagementsystem.BE.Booking;
import dk.svoldgaard.transportmanagementsystem.BE.Clint;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BookingModel {

    private ObservableList<Clint> lstClint;
    private ObservableList<Booking> tblBookingData;

    public BookingModel(){
        lstClint = FXCollections.observableArrayList();
        tblBookingData = FXCollections.observableArrayList();

        mockDataClint();
    }

    public ObservableList<Clint> getClint() {
        return lstClint;
    }

    public ObservableList<Booking> getTblBookingData() {
        return tblBookingData;
    }

    private void mockDataClint(){
        lstClint.add(new Clint("Brdr.Holst Sørensen"));
        lstClint.add(new Clint("BWS"));
    }
}
