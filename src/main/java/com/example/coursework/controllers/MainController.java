package com.example.coursework.controllers;

import com.example.coursework.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox TeenagerCheckBox;

    @FXML
    private Button babyButton;

    @FXML
    private CheckBox babyCheckBox;

    @FXML
    private Button childButton;

    @FXML
    private CheckBox childCheckBox;

    @FXML
    private Button exitButton;

    @FXML
    private Button fullListButton;

    @FXML
    private TextField moneyField;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button searchButton;

    @FXML
    private CheckBox sizeBigCheckBox;

    @FXML
    private CheckBox sizeMiddleCheckBox;

    @FXML
    private CheckBox sizeSmallCheckBox;

    @FXML
    private Button teenagerButton;

    @FXML
    private TextField toyField;

    @FXML
    private Button registrButton;

    @FXML
    private Label showUserNameHere;


    public void setRegistrButton() throws Exception{
        /*DataBaseConnector connectNow = new DataBaseConnector();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "select UserName from UserAccount";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);

            while (queryOutput.next()){
                showUserNameHere.setText(queryOutput.getString("UserName"));
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    */


        Parent root = FXMLLoader.load(Main.class.getResource("registrationView.fxml"));
        Stage window = (Stage) registrButton.getScene().getWindow();
        window.setScene(new Scene(root, 1280,832));


    }

    public void setFullListButton() throws Exception{ //перехід на нову сторінку
        Parent root = FXMLLoader.load(Main.class.getResource("view2.fxml"));
        Stage window = (Stage) fullListButton.getScene().getWindow();
        window.setScene(new Scene(root, 1280,832));
    }


    public void setExitButton() throws Exception{ //кнопка виходу з програми
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

}
