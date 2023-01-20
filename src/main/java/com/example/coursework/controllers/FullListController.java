package com.example.coursework.controllers;

import com.example.coursework.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button returnButton;

    @FXML
    public void setReturnButton() throws Exception{
        Parent root = FXMLLoader.load(Main.class.getResource("view1.fxml"));
        Stage window = (Stage) returnButton.getScene().getWindow();
        window.setScene(new Scene(root, 1280,832));
    }

    @FXML
    void initialize() {

    }

}
