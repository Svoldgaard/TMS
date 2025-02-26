package dk.svoldgaard.transportmanagementsystem.GUI.Controller;


// project import
import dk.svoldgaard.transportmanagementsystem.BE.Booking;
import dk.svoldgaard.transportmanagementsystem.BE.Trip;
import dk.svoldgaard.transportmanagementsystem.BE.TruckTrailer;
import dk.svoldgaard.transportmanagementsystem.GUI.Model.PlanningModel;


// jave import
import dk.svoldgaard.transportmanagementsystem.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class PlanningController implements Initializable {



    // JavaFx instance
    @FXML
    private TextField txtSearch;

    // all regarding current tures
    @FXML
    private ListView<Trip> lstCurrentTurs;

    // this is all regarding tblBooking
    @FXML
    private TableView<Booking> tblBooking;
    @FXML
    private TableColumn<Booking,Integer> colBookingNr;
    @FXML
    private TableColumn<Booking,String> colClint;
    @FXML
    private TableColumn<Booking,String> colLoadingPlace;
    @FXML
    private TableColumn<Booking,String> colLoadingDate;
    @FXML
    private TableColumn<Booking,Integer> colLoadingZip;
    @FXML
    private TableColumn<Booking,String> colLoadingContryCode;
    @FXML
    private TableColumn<Booking,String> colDeliveryPlace;
    @FXML
    private TableColumn<Booking,String> colDeliveryDate;
    @FXML
    private TableColumn<Booking,Integer> colDeliberyZip;
    @FXML
    private TableColumn<Booking,String> colDeliveryContryCode;
    @FXML
    private TableColumn<Booking, Double> colWeight;
    @FXML
    private TableColumn<Booking,Integer> colColliAmount;
    @FXML
    private TableColumn<Booking,Double> colLoadingMeter;
    @FXML
    private TableColumn<Booking,Double> colPrice;

    // all regarding current tures Selected
    @FXML
    private TableView<Booking> tblCurrentTureselected;
    @FXML
    private TableColumn<Booking,Integer> colPlanedBookingNr;
    @FXML
    private TableColumn<Booking,String> colPlanedClint;
    @FXML
    private TableColumn<Booking,String> colPlanedLoadingPlace;
    @FXML
    private TableColumn<Booking, Date> colPlanedLoadingday;
    @FXML
    private TableColumn<Booking,String> colPlanedDeliveryPlace;
    @FXML
    private TableColumn<Booking,Date> colPlanedDeliveryDate;
    @FXML
    private TableColumn<Booking,Integer> colPlanedZip;
    @FXML
    private TableColumn<Booking,Integer> colPlanedDeliveryZip;
    @FXML
    private TableColumn<Booking,Double> colPlanedWeight;
    @FXML
    private TableColumn<Booking,Double> colPlanedCllAmount;
    @FXML
    private TableColumn<Booking,Double> colPlanedLoadingMeter;
    @FXML
    private TableColumn<Booking,Double> colPlanedPrice;

    // all regarding truck & Trailer
    @FXML
    private TableView<TruckTrailer> tblTruckTrailer;
    @FXML
    private TableColumn<TruckTrailer,String> colTruck;
    @FXML
    private TableColumn<TruckTrailer,String> colTrailer;

    // all other instances

    private PlanningModel planningModel;

    public PlanningController() {
        planningModel = new PlanningModel();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // Current Bookings
        colBookingNr.setCellValueFactory(new PropertyValueFactory<>("bookingNumber"));
        colClint.setCellValueFactory(new PropertyValueFactory<>("client"));
        colLoadingPlace.setCellValueFactory(new PropertyValueFactory<>("loadingPlace"));
        colLoadingDate.setCellValueFactory(new PropertyValueFactory<>("loadingDate"));
        colLoadingZip.setCellValueFactory(new PropertyValueFactory<>("loadingZipCode"));
        colLoadingContryCode.setCellValueFactory(new PropertyValueFactory<>("loadingCountryCode"));
        colDeliveryPlace.setCellValueFactory(new PropertyValueFactory<>("deliveryPlace"));
        colDeliveryDate.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        colDeliberyZip.setCellValueFactory(new PropertyValueFactory<>("deliveryZipCode"));
        colDeliveryContryCode.setCellValueFactory(new PropertyValueFactory<>("deliveryCountryCode"));
        colWeight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        colColliAmount.setCellValueFactory(new PropertyValueFactory<>("cllAmount"));
        colLoadingMeter.setCellValueFactory(new PropertyValueFactory<>("loadingMeter"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        tblBooking.setItems(planningModel.getBooking());

        // Bookings on trip

        colPlanedBookingNr.setCellValueFactory(new PropertyValueFactory<>("bookingNumber"));
        colPlanedClint.setCellValueFactory(new PropertyValueFactory<>("client"));
        colPlanedLoadingPlace.setCellValueFactory(new PropertyValueFactory<>("loadingPlace"));
        colPlanedLoadingday.setCellValueFactory(new PropertyValueFactory<>("loadingDate"));
        colPlanedZip.setCellValueFactory(new PropertyValueFactory<>("loadingZipCode"));
        colPlanedDeliveryPlace.setCellValueFactory(new PropertyValueFactory<>("deliveryPlace"));
        colPlanedDeliveryDate.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
        colPlanedDeliveryZip.setCellValueFactory(new PropertyValueFactory<>("deliveryZipCode"));
        colPlanedWeight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        colPlanedCllAmount.setCellValueFactory(new PropertyValueFactory<>("cllAmount"));
        colPlanedLoadingMeter.setCellValueFactory(new PropertyValueFactory<>("loadingMeter"));
        colPlanedPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        tblCurrentTureselected.setItems(planningModel.getCurrentTripBooking()); // this has to be changed when all is set up correct


        // Truck & Trailer

        colTruck.setCellValueFactory(new PropertyValueFactory<>("truckPlate"));
        colTrailer.setCellValueFactory(new PropertyValueFactory<>("trailerPlate"));

        tblTruckTrailer.setItems(planningModel.getTruckTrailer());

        // trips
        lstCurrentTurs.setItems(planningModel.getCurrentTurs());


        // Search
        txtSearch.textProperty().addListener((observable, oldValue, newValue) -> {
            try{
                planningModel.searchBooking(newValue);
            }catch(Exception e){
                e.printStackTrace();
            }
        });

    }
    @FXML
    private void btnBooking(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/dk.svoldgaard/transportManagementsystem/FXML/Booking.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage = new Stage();
        stage.setTitle("Transport Management System - Booking");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void btnCMR(ActionEvent actionEvent) {
    }

    @FXML
    private void btnLogOut(ActionEvent actionEvent) {
        ((Stage) (((Button) actionEvent.getSource()).getScene().getWindow())).close();
    }


}
