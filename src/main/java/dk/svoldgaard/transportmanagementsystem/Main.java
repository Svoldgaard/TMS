package dk.svoldgaard.transportmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/dk.svoldgaard/transportManagementsystem/FXML/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 200, 200);
        stage.setTitle("Transport Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}