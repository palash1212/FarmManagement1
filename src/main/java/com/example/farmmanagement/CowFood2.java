package com.example.farmmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CowFood2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CowFood2.class.getResource("CowFood2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Cow Food Chart");
        stage.setScene(scene);
        stage.show();
    }
}
