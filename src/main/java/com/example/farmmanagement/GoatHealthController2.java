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
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GoatHealthController2 {

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
    private Button SubmitButton;

    @FXML
    private TextArea TA1;

    @FXML
    private TextField TF1;

    @FXML
    private TextField TF2;

    @FXML
    private TextField TF3;

    @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(GoatHealth2.class.getResource("GoatHealth.fxml"));
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
    void SubmitButtonAction(ActionEvent event)  throws IOException{
        String code = TF1.getText();
        String date = TF2.getText();
        String nextdate= TF3.getText();
        String des = TA1.getText();
        File file = new File("C:/Users/User/IdeaProjects/FarmManagement/src/main/java/com/example/farmmanagement/GoatHealth");

        if (code.equals("") || date.equals("") || nextdate.equals("") || des.equals("")) {
            L7.setText(" Something went wrong!!Please try again");
        }
        else {
            FileWriter fw = new FileWriter(file, true);
            fw.write( code + " " +date+" "+nextdate+" "+des+"\n");
            fw.close();
            L7.setText("      Submission has Completed");
        }

    }
}
