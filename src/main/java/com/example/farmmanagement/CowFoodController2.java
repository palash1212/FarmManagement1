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
import  javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CowFoodController2 {
    @FXML
    public Stage stage;

    @FXML
    public Scene scene;

    @FXML
    public Parent root;

    @FXML
    private Button BackButton;

    @FXML
    private Button ExitButton;
    @FXML
    private Button NextButton;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    private Label L4;

    @FXML
    private Label L5;

    @FXML
    private Label L6;

    @FXML
    private Label L7;
    @FXML
    private Label L8;
    @FXML
    private Label L9;

    @FXML
    private Button SubmitButton;

    @FXML
    private TextField TF1;

    @FXML
    private TextField TF2;

    @FXML
    private TextField TF3;

    @FXML
    private TextField TF4;

    @FXML
    private TextField TF5;
    @FXML
    private TextField TF6;

    ArrayList<String>codenumber = new ArrayList<>();

    @FXML
    void BackButtonAction(ActionEvent event)  throws IOException {
        root = FXMLLoader.load(CowFood2.class.getResource("Cow.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ExitButtonAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void SubmitButtonAction(ActionEvent event) throws IOException{
        String c = TF6.getText();
        String g = TF1.getText();
        String h = TF2.getText();
        String s= TF3.getText();
        String b= TF4.getText();
        String m= TF5.getText();

        codenumber.add(c);
        File file = new File("C:/Users/User/IdeaProjects/FarmManagement/src/main/java/com/example/farmmanagement/CowFood");

        if (c.equals("") ||g.equals("") || h.equals("") || s.equals("") || b.equals("") || m.equals("")) {
            L8.setText("Something went wrong!!Please try again");
        }
        else {
            FileWriter fw = new FileWriter(file, true);
//            fw.write("Grass : " + g + "\n");
//            fw.write("Hay : " + h + "\n");
//            fw.write("Silage : " + s + "\n");
//            fw.write("Bran : " + b + " kg\n");
//            fw.write("Molasses : " + m + "\n");
//            fw.write("--------\n");
            fw.write(c+" "+g+" "+h+" "+s+" "+b+" "+m+"\n");
            fw.close();
            L8.setText("Submission has Completed");
        }

    }
    @FXML
    void NextButtonAction(ActionEvent event)  throws IOException {
        root = FXMLLoader.load(CowFood2.class.getResource("CowFood.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
