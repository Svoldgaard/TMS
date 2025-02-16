package dk.svoldgaard.transportmanagementsystem.GUI.Controller;

import dk.svoldgaard.transportmanagementsystem.BE.Booking;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class BookingController implements Initializable {

    // TableView
    @FXML
    private TableView<Booking> tblBookingData;
    @FXML
    private TableColumn colMark;
    @FXML
    private TableColumn colCllCount;
    @FXML
    private TableColumn colPalletType;
    @FXML
    private TableColumn colLength;
    @FXML
    private TableColumn colWeidth;
    @FXML
    private TableColumn colHeight;
    @FXML
    private TableColumn colWeight;
    @FXML
    private TableColumn colM2;
    @FXML
    private TableColumn colLDM;

    // all text Field
    @FXML
    private TextField txtClintName;
    @FXML
    private TextField txtClintAdress;
    @FXML
    private TextField txtClintZipCode;
    @FXML
    private TextField txtClintCity;
    @FXML
    private TextField txtLoadingPlace;
    @FXML
    private TextField txtLoadingAdress;
    @FXML
    private TextField txtLoadingZipCode;
    @FXML
    private TextField txtLoadingCity;
    @FXML
    private TextField txtDeliveryPlace;
    @FXML
    private TextField txtDeliveryAdress;
    @FXML
    private TextField txtDeliveryZipCode;
    @FXML
    private TextField txtDeliveryCity;



    // listView
    @FXML
    private ListView lstClint;

    // Label
    @FXML
    private Label lblClintNumber;

    public BookingController(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void btnAdd(ActionEvent actionEvent) {
    }

    @FXML
    private void btnRemove(ActionEvent actionEvent) {
    }

    @FXML
    private void btnCreateClint(ActionEvent actionEvent) {
    }

    @FXML
    private void btnSave(ActionEvent actionEvent) {
    }

    @FXML
    private void btnCancel(ActionEvent actionEvent) {
        ((Stage) (((Button) actionEvent.getSource()).getScene().getWindow())).close();
    }


}
