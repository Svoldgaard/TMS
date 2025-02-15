package dk.svoldgaard.transportmanagementsystem.GUI.Controller;

import dk.svoldgaard.transportmanagementsystem.BE.Booking;
import dk.svoldgaard.transportmanagementsystem.GUI.Model.PlanningModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PlanningController implements Initializable {



    // JavaFx instance

    // all regarding current tures
    @FXML
    private ListView lstCurrentTurs;

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
    private TableView tblCurrentTureselected;
    @FXML
    private TableColumn colPlanedBookingNr;
    @FXML
    private TableColumn colPlanedClint;
    @FXML
    private TableColumn colPlanedLoadingPlace;
    @FXML
    private TableColumn colPlanedLoadingday;
    @FXML
    private TableColumn colPlanedDeliveryPlace;
    @FXML
    private TableColumn colPlanedDeliveryDate;
    @FXML
    private TableColumn colPlanedZip;
    @FXML
    private TableColumn colPlanedDeliveryZip;
    @FXML
    private TableColumn colPlanedWeight;
    @FXML
    private TableColumn colPlanedCllAmount;
    @FXML
    private TableColumn colPlanedLoadingMeter;
    @FXML
    private TableColumn colPlanedPrice;

    // all regarding truck & Trailer
    @FXML
    private TableView tblTruckTrailer;
    @FXML
    private TableColumn colTruck;
    @FXML
    private TableColumn colTrailer;

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

    }
    @FXML
    private void btnBooking(ActionEvent actionEvent) {
    }

    @FXML
    private void btnCMR(ActionEvent actionEvent) {
    }

    @FXML
    private void btnLogOut(ActionEvent actionEvent) {
        ((Stage) (((Button) actionEvent.getSource()).getScene().getWindow())).close();
    }


}
