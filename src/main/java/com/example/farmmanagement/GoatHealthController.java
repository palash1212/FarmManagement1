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
import java.io.IOException;
import java.util.Scanner;

public class GoatHealthController {
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
    private Label GoatHealthLabel;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    private Label L4;

    @FXML
    private Label L5;

    @FXML
    private Button NextButton;

    @FXML
    private Button SubmitButton;

    @FXML
    private TextArea TA1;

    @FXML
    private TextField TF1;


    @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(GoatHealth.class.getResource("Goat.fxml"));
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
        root = FXMLLoader.load(GoatHealth.class.getResource("GoatHealth2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void SubmitButtonAction(ActionEvent event) throws IOException{
        File file = new File("src/main/java/com/example/farmmanagement/GoatHealth");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()){
            String code = sc.next();
            String date = sc.next();
            String nxtdate = sc.next();
            String des= sc.next();
            if(code.equals(TF1.getText())){
                TA1.setText("Code : "+code+"\n"+"Date : "+date+"\n"+"Next Date : "+nxtdate+"\n"+"Description : "+des);
                L4.setText("");
                break;

            }
            else{
                L4.setText("Wrong Code");
                TA1.setText("");
            }

        }
        sc.close();
    }

}
