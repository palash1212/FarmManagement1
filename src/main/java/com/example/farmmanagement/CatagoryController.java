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

public class CatagoryController {

    @FXML
    public Stage stage;

    @FXML
    public Scene scene;

    @FXML
    public Parent root;
    @FXML
    void BuyButton(ActionEvent event) {

    }

    @FXML
    void CancelButton(ActionEvent event) {

    }

    @FXML
    void CattleButton(ActionEvent event) {

    }

    @FXML
    void CowButton(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Catagory.class.getResource("Cow.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void DairyButton(ActionEvent event) {

    }

    @FXML
    void ExitButton(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void FinancialButton(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Catagory.class.getResource("FRecord.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void GoatButton(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Catagory.class.getResource("Goat.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void PlaceButton(ActionEvent event) {

    }

    @FXML
    void StuffButton(ActionEvent event) {

    }

    public void StuffButtons(ActionEvent actionEvent) {
    }
}
