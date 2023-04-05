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
    private Label L9;

    @FXML
    private Label Err;

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

    @FXML
    private TextField TF7;

    @FXML
    void BackButtonAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(FRecord.class.getResource("Catagory-view.fxml"));
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
        double E = Double.parseDouble(TF2.getText());
        double W = Double.parseDouble(TF3.getText());
        double S = Double.parseDouble(TF4.getText());
        double F = Double.parseDouble(TF5.getText());
        double O = Double.parseDouble(TF6.getText());

//        if(E>0 || W>0 || S>0 || F>0 || O>0 ){
            double T = E+W+S+F+O;
            TF7.setText(String.valueOf(T));


//        }
//       else{
//            Err.setText("Invalid Data!!please try again");
//        }

       File file = new File("C:/Users/User/IdeaProjects/FarmManagement/src/main/java/com/example/farmmanagement/FinRecord");
       try{
           FileWriter fw = new FileWriter(file,true);
           fw.write("Date : " +date);
           fw.write("\nElectricity Bill : "+E+" Taka");
           fw.write("\nWater Bill : "+W+" Taka");
           fw.write("\nStuff Salary : "+S+" Taka");
           fw.write("\nFood Cost : "+F+" Taka");
           fw.write("\nOther Cost : "+O+" Taka");
           fw.write("\nTotal Cost : "+T+" Taka");
           fw.write("\n\n");
           fw.close();
       }catch (Exception e){
           System.out.println(e);
       }

    }

}
