package com.example.imgur;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView imageView;

    @FXML
    private TextField tfUrl;

    private String imageurl;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        imageurl = tfUrl.getText();
        Image image = new Image(imageurl,false);
        imageView.setImage(image);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageurl = tfUrl.getText();
        Image image = new Image(imageurl,false);
        imageView.setImage(image);
    }
}