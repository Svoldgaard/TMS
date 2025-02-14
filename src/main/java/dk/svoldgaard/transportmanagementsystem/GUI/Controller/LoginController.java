package dk.svoldgaard.transportmanagementsystem.GUI.Controller;

// java import
import dk.svoldgaard.transportmanagementsystem.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {


    public TextField txtUsername;
    public TextField txtPassword;

    @FXML
    private void btnLogin(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/dk.svoldgaard/transportManagementsystem/FXML/Planning.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        Stage stage = new Stage();
        stage.setTitle("Transport Management System - Planning");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void BtnClose(ActionEvent actionEvent) {
        ((Stage) (((Button) actionEvent.getSource()).getScene().getWindow())).close();
    }
}