package com.example.a1project;

import com.example.a1project.View.CurrencyChangeSystemPage;
import com.example.a1project.View.LoginPage;
import com.example.a1project.View.ViewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ViewManager.openLoginPage();
    }

    public static void main(String[] args) {
        launch();
    }
}