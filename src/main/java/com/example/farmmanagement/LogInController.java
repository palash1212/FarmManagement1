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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LogInController {

    @FXML
    public Stage stage;

    @FXML
    public Scene scene;

    @FXML
    public Parent root;


    @FXML
    private Label Label1;

    @FXML
    private Label Label2;

    @FXML
    private Label Label3;

    @FXML
    private Label Label4;

    @FXML
    private Label Label5;

    @FXML
    private Label Label6;

    @FXML
    private Label Label7;

    @FXML
    private Label Label8;

    @FXML
    private Label Label9;
    @FXML
    private Label Label10;

    @FXML
    private Button LoginButton;

    @FXML
    private PasswordField PassField1;

    @FXML
    private PasswordField PassField2;

    @FXML
    private Button SignupButton;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;

    @FXML
    private TextField TextField3;

    @FXML
    private TextField TextField4;

    @FXML
    ImageView Image1;

//    Image image1 = new Image(getClass().getResourceAsStream("signup.png"));
//    public void displayImage1(){
//        Image1.setImage(image1);
//    }

    ArrayList<String>allUsername = new ArrayList<>();
    ArrayList<String> allpass=new ArrayList<>();


    @FXML
    void LoginButtonClick(ActionEvent event) throws IOException {
        File fl=new File("src/main/java/com/example/farmmanagement/name_pass");
        Scanner sn=new Scanner(fl);

        while (sn.hasNext()){
            String name=sn.next();
            String pas=sn.next();
//            System.out.println(name);
//            System.out.println(pas);

            if(name.equals(TextField1.getText()) && pas.equals(PassField1.getText()) ){
                root = FXMLLoader.load(Catagory.class.getResource("Catagory-view.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            }
            else{
                Label4.setText("Wrong PassWord!!Please Try again");
            }
        }

    }

    @FXML
    void SignupButtonClick(ActionEvent event) throws IOException {

        String Fname = TextField2.getText();
        String Uname = TextField4.getText();
        String Email = TextField3.getText();
        String pass = String.valueOf(PassField2.getText());
          allUsername.add(Uname);
           allpass.add(pass);

        if (Fname.equals("") || Email.equals("") || Uname.equals("") || pass.equals("")) {
            Label10.setText("Something went wrong!!Please try again");
        }
        else {
            try {
                File file = new File("C:/Users/User/IdeaProjects/FarmManagement/src/main/java/com/example/farmmanagement/Register");
                FileWriter fw = new FileWriter(file, true);
                fw.write("FullName : " + Fname);
                fw.write("\nEmail : " + Email);
                fw.write("\nUserName : " + Uname);
                fw.write("\nPassword : " + pass);
                fw.write("\n----------\n");
                File file2 = new File("src/main/java/com/example/farmmanagement/name_pass");
                FileWriter fw2 = new FileWriter(file2, true);
                fw2.write(Uname+" ");
                fw2.write(pass+"\n");
                fw2.close();
                fw.close();
            } catch (IOException e) {
                System.out.println(e);
            }

            root = FXMLLoader.load(Catagory.class.getResource("Catagory-view.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

}

