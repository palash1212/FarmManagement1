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
import  javafx.scene.control.TextArea;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CowFoodController {
    @FXML
    public Stage stage;

    @FXML
    public Scene scene;

    @FXML
    public Parent root;

    @FXML
    private Button BackButton;

    @FXML
    private Label CowFoodLabel;

    @FXML
    private Button ExitButton;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    private Label L4;
    @FXML
    private Label L5;

    @FXML
    private Button SubmitButton;

    @FXML
    private TextArea TA1;

    @FXML
    private TextField TF1;
   // ArrayList<String>codenumber = new ArrayList<>();

    @FXML
    void SubmitButtonAction(ActionEvent event) throws IOException {
        File file = new File("src/main/java/com/example/farmmanagement/cowFood");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()){
            String c = sc.next();
          // System.out.println(c);
            String g = sc.next();
            String h = sc.next();
            String s= sc.next();
            String b= sc.next();
            String m= sc.next();
            if(c.equals(TF1.getText())){

               TA1.setText("Code : "+c+"\n"+"Grass : "+g+"\n"+"Hay : "+h+"\n"+"Silage : "+s+"\n"+"Bran : "+b+"\n"+"Molasses : "+m);
               L5.setText("");
               break;

            }
            else{
               L5.setText("Wrong Code");
               TA1.setText("");
            }

        }
        sc.close();
    }
    @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(CowFood.class.getResource("CowFood2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ExitButtonAction(ActionEvent event) {
        System.exit(0);
    }

}
