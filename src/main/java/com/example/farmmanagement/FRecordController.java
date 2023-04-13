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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FRecordController {

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
    private Label FRecordLabel;

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
    private Label Err;

    @FXML
    private Button SubmitButton;
    @FXML
    private Button NextButton;

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

    @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(FRecord.class.getResource("Catagory-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void NextButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(FRecord.class.getResource("FRecord2.fxml"));
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
    void SubmitButtonAction(ActionEvent event) {

        String date = TF1.getText();
        String E = TF2.getText();
        String W = TF3.getText();
        String S = TF4.getText();
        String F = TF5.getText();
        String O = TF6.getText();

        if(date.equals("")||E.equals("")||W.equals("")||S.equals("")||F.equals("")||O.equals("")){
            Err.setText("Invalid Data!!please try again");
        }
       else{
            File file = new File("C:/Users/User/IdeaProjects/FarmManagement/src/main/java/com/example/farmmanagement/FinRecord");
            try{
                FileWriter fw = new FileWriter(file,true);
                fw.write(date+" "+E+" "+W+" "+S+" "+F+" "+O+"\n");
                fw.close();
                Err.setText("Detail has submited");
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }

}
