package com.example.farmmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;

public class CowHealthController {
    @FXML
    public Stage stage;

    @FXML
    public Scene scene;
    @FXML
    public Parent root;

    @FXML
    private Button BackButton;

    @FXML
    private Label CowHealthLabel;

    @FXML
    private Button ExitButton;

    @FXML
    private Button NextButton;

    @FXML
    void BackButtonAction(ActionEvent event)throws IOException {
        root = FXMLLoader.load(CowHealth.class.getResource("Cow.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ExitButtonAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void NextButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(CowHealth.class.getResource("CowHealth2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
