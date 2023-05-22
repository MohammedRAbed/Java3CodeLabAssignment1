package com.example.a1project.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class LoginPage extends Stage {
    private final String username = "user";
    private final String password = "userpass";
    public LoginPage() {
        //Insert image into input stream
        InputStream stream;
        try {
            // Path is adjustable [For the tab icon]
            stream = new FileInputStream(
                    "C:\\Users\\abedm\\Downloads\\user_login.jpg"
            );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Image icon = new Image(stream);
        ImageView iconImg = new ImageView(icon);
        //Important so the image will not become too big
        iconImg.setFitHeight(100);
        iconImg.setFitWidth(100);

        Label usernameLabel = new Label("user name");
        usernameLabel
                .setStyle("-fx-font-weight: bold");
        TextField usernameField = new TextField();
        usernameField
                .setStyle("-fx-border-color:blue; -fx-padding: 7px");
        Label passwordLabel = new Label("password");
        passwordLabel
                .setStyle("-fx-font-weight: bold");
        TextField passwordField = new TextField();
        passwordField
                .setStyle("-fx-border-color:blue; -fx-padding: 7px");



        Button loginButton = new Button("Login");
        loginButton
                .setStyle("-fx-background-color: blue; -fx-text-fill: white");
        loginButton.setPadding(new Insets(10));
        loginButton.setOnAction(e->{
            if (usernameField.getText().equals(username)
                    && passwordField.getText().equals(password)) {
                ViewManager.openCCSPage();
                ViewManager.closeLoginPage();
            } else
                ViewManager.openAlertPage();
        });

        VBox root = new VBox(10,
                iconImg,usernameLabel,
                usernameField,passwordLabel,
                passwordField,loginButton);
        root.setPadding(new Insets(50));
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root,300,450);
        setTitle("Login Page");
        setScene(scene);
    }
}
