package com.example.farmmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;

public class CowController {
    @FXML
    public Stage stage;

    @FXML
    public Scene scene;

    @FXML
    public Parent root;
    @FXML
    private Button BackButton;

    @FXML
    private Button CodeButton;

    @FXML
    private Button ExitButton;

    @FXML
    private Button FoodButton;

    @FXML
    private Button HealthButton;

    @FXML
    private Label cowLabel1;
    @FXML
    private ImageView Image2;
//    Image image2 = new Image(getClass().getResourceAsStream("cow.png"));
//    public void displayImage2(){
//        Image2.setImage(image2);
//    }

    @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Cow.class.getResource("Catagory-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void CodeButtonAction(ActionEvent event) {

    }

    @FXML
    void ExitButtonAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void FoodButtonAction(ActionEvent event)  throws IOException {
        root = FXMLLoader.load(Cow.class.getResource("CowFood2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void HealthButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(CowHealth.class.getResource("CowHealth.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
