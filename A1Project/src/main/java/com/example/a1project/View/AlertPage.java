package com.example.a1project.View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlertPage extends Stage {
    public AlertPage() {
        Label label = new Label("username or password not correct");
        label.setStyle("-fx-font-weight: bold;");
        label.setAlignment(Pos.CENTER);
        VBox root = new VBox(label);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,350,100);
        setTitle("ERROR");
        setScene(scene);
    }
}
