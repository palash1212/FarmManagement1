package com.example.farmmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GoatFoodController {
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
    private Label GoatFoodLabel;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    private Label L4;

    @FXML
    private Button NextButton;

    @FXML
    private Button SubmitButton;

    @FXML
    private TextField TF1;
    @FXML
    private TextArea TA1;

    @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(GoatFood.class.getResource("Goat.fxml"));
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
    void NextButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(GoatFood.class.getResource("GoatFood2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void SubmitButtonAction(ActionEvent event) throws IOException{
        File file = new File("src/main/java/com/example/farmmanagement/GoatFood");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()){
            String c = sc.next();
            // System.out.println(c);
            String g = sc.next();
            String h = sc.next();
            String s= sc.next();
            String b= sc.next();
            String l= sc.next();
            if(c.equals(TF1.getText())){

                TA1.setText("Code : "+c+"\n"+"Grass : "+g+"\n"+"Hay : "+h+"\n"+"Silage : "+s+"\n"+"Bran : "+b+"\n"+"Legumes : "+l);
                L3.setText("");
                break;

            }
            else{
                L3.setText("Wrong Code");
                TA1.setText("");
            }

        }
        sc.close();
    }
}
