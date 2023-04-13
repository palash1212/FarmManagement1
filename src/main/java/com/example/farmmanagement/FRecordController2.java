package com.example.farmmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FRecordController2 {
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
    private Button SubmitButton;

    @FXML
    private TextArea TA1;

    @FXML
    private TextArea TA2;

    @FXML
    private TextField TF1;

    @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(FRecord2.class.getResource("FRecord.fxml"));
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
    void SubmitButtonAction(ActionEvent event) throws IOException{
        File file = new File("src/main/java/com/example/farmmanagement/FinRecord");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()){
            String date = sc.next();
            int E = sc.nextInt();
            int W = sc.nextInt();
            int S = sc.nextInt();
            int F = sc.nextInt();
            int O = sc.nextInt();
            int T = E+W+S+F+O;
            if(date.equals(TF1.getText())){

                TA1.setText("Date : "+date+"\n"+"Electricity Bill : "+E+"\n"+"Water Bill : "+W+"\n"+"Stuff Salary : "+S+"\n"+"Food Cost : "+F+"\n"+"Other Cost : "+O+"\n"+"Total Cost :"+T);
                L4.setText("");
                break;

            }
            else{
                L4.setText("               Wrong Code");
                TA1.setText("");
            }

        }
        sc.close();
    }


}
