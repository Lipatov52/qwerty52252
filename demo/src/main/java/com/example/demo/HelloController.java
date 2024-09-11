package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button da;

    @FXML
    void da(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Stage stage = (Stage) da.getScene().getWindow();
        stage.close();

        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("next.fxml"));
        Scene scene = new Scene(fxmlLoader1.load(), 400, 500);
        Stage stage1 = new Stage();
        stage1.setTitle("2");
        stage1.setScene(scene);
        stage1.show();
    }

    @FXML
    void pods(ActionEvent event) {
        JOptionPane.showMessageDialog(null,"Разработчик Липатов Юрий");

    }
    @FXML
    void initialize() {


    }

}
