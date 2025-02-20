package dk.svoldgaard.transportmanagementsystem.GUI.Controller;

// project import
import dk.svoldgaard.transportmanagementsystem.BE.Booking;
import dk.svoldgaard.transportmanagementsystem.BE.Clint;
import dk.svoldgaard.transportmanagementsystem.GUI.Model.BookingModel;

// java import
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class BookingController implements Initializable {

    // TableView
    @FXML
    private TableView<Booking> tblBookingData;
    @FXML
    private TableColumn<Booking,String> colMark;
    @FXML
    private TableColumn<Booking,Integer> colCllCount;
    @FXML
    private TableColumn<Booking, String> colPalletType;
    @FXML
    private TableColumn<Booking,Integer> colLength;
    @FXML
    private TableColumn<Booking, Integer> colWeidth;
    @FXML
    private TableColumn<Booking,Integer> colHeight;
    @FXML
    private TableColumn<Booking, Double> colWeight;
    @FXML
    private TableColumn<Booking,Integer> colM2;
    @FXML
    private TableColumn<Booking,Integer> colLDM;

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
    private ListView<Clint> lstClint;

    // Label
    @FXML
    private Label lblClintNumber;


    // other instances
    private BookingModel bookingModel;

    public BookingController(){
        bookingModel = new BookingModel();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        colMark.setCellValueFactory(new PropertyValueFactory<>("mark"));
        colCllCount.setCellValueFactory(new PropertyValueFactory<>("cllAmount"));
        colHeight.setCellValueFactory(new PropertyValueFactory<>("height"));
        colWeidth.setCellValueFactory(new PropertyValueFactory<>("width"));
        colLength.setCellValueFactory(new PropertyValueFactory<>("length"));
        colWeight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        colLDM.setCellValueFactory(new PropertyValueFactory<>("loadingMeter")); // LDM is loadingMeter
        colM2.setCellValueFactory(new PropertyValueFactory<>("m2"));

        colPalletType.setCellValueFactory(new PropertyValueFactory<>("palletType"));


        // this set the lst for the clint
        lstClint.setItems(bookingModel.getClint());
        tblBookingData.setItems(bookingModel.getTblBookingData());

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
