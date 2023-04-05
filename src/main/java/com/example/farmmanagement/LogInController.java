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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class LogInController {

    @FXML
    public Stage stage;

    @FXML
    public Scene scene;

    @FXML
    public Parent root;
    @FXML
    private AnchorPane Anchorpane1;

    @FXML
    private AnchorPane Anchorpane2;

    @FXML
    private AnchorPane Anchorpane3;

    @FXML
    private AnchorPane Anchorpane4;

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

    ArrayList<String>allUsername = new ArrayList<>();
    HashMap<String,String>usernameandpass = new HashMap<String,String>();

    @FXML
    void LoginButtonClick(ActionEvent event) throws IOException {

        String username = TextField1.getText();
        String password = String.valueOf(PassField1.getText());

        File file = new File("C:/Users/User/IdeaProjects/FarmManagement/src/main/java/com/example/farmmanagement/Register");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            Object[] lines = br.lines().toArray();
            for(int i=0; i<lines.length; i++){
                String[] row = lines[i].toString().split(": ");
                if(row[0].equals("UserName ")){
                    username = row[1];
                    allUsername.add(username);
                }
                else if(row[0].equals("Password ")){
                    password = row[1];
                }
                if(!username.equals("")&& !password.equals("")){
                    usernameandpass.put(username,password);
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }
        for(String uname : usernameandpass.keySet()){
            if(uname.equals(username)){
                if(usernameandpass.get(uname).equals(password)){
                    root = FXMLLoader.load(Catagory.class.getResource("Catagory-view.fxml"));
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            }
        }
//        root = FXMLLoader.load(Catagory.class.getResource("Catagory-view.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
    }

    @FXML
    void SignupButtonClick(ActionEvent event) throws IOException {

        String Fname = TextField2.getText();
        String Uname = TextField4.getText();
        String Email = TextField3.getText();
        String pass = String.valueOf(PassField2.getText());

        File file = new File("C:/Users/User/IdeaProjects/FarmManagement/src/main/java/com/example/farmmanagement/Register");

        if (Fname.equals("") || Email.equals("") || Uname.equals("") || pass.equals("")) {
            Label10.setText("Something went wrong!!Please try again");
        }
        else {
            try {
                FileWriter fw = new FileWriter(file, true);
                fw.write("FullName : " + Fname);
                fw.write("\nEmail : " + Email);
                fw.write("\nUserName : " + Uname);
                fw.write("\nPassword : " + pass);
                fw.write("\n----------\n");
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
