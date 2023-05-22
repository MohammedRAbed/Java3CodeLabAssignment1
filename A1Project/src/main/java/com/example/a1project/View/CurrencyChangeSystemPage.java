package com.example.a1project.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurrencyChangeSystemPage extends Stage {
    public CurrencyChangeSystemPage() {
        Label title = new Label("Currency Conversion System");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold");
        Button logoutButton = new Button("Log out");
        logoutButton.setPadding(new Insets(10));
        logoutButton.setStyle(
                "-fx-background-color: #dca232; -fx-font-style: italic; -fx-font-weight:bold; -fx-text-fill: white"
        );
        logoutButton.setOnAction(e->{
            ViewManager.openLoginPage();
            ViewManager.closeCCSPage();
        });

        BorderPane topBox = new BorderPane();
        topBox.setLeft(title);
        topBox.setRight(logoutButton);

        Label usd = new Label("USD");
        usd.setStyle(
                "-fx-text-fill: #03004e; -fx-font-weight: bold; -fx-font-size: 19px"
        );
        VBox usdLabel = new VBox(usd);
        usdLabel.setAlignment(Pos.CENTER);
        Label nis = new Label("NIS");
        nis.setStyle(
                "-fx-text-fill: #03004e; -fx-font-weight: bold; -fx-font-size: 19px"
        );
        VBox nisLabel = new VBox(nis);
        nisLabel.setAlignment(Pos.CENTER);
        TextField usdTF = new TextField();
        usdTF.setPadding(new Insets(8));
        TextField nisTF = new TextField();
        nisTF.setPadding(new Insets(8));
        GridPane gridPane = new GridPane();
        Label to = new Label("TO");
        to.setStyle(
                "-fx-text-fill: #03004e; -fx-font-weight: bold; -fx-font-size: 17px"
        );
        gridPane.add(usdLabel,0,0);
        gridPane.add(nisLabel,2,0);
        gridPane.add(usdTF,0,1);
        gridPane.add(to,1,1);
        gridPane.add(nisTF,2,1);
        gridPane.setHgap(17);
        gridPane.setVgap(17);
        gridPane.setPadding(new Insets(70));

        Button convertButton = new Button("Convert");
        convertButton.setPadding(new Insets(10));
        convertButton.setStyle(
                "-fx-background-color: #03004e; -fx-font-style: italic; -fx-font-weight:bold; -fx-text-fill: white"
        );
        convertButton.setOnAction(e->{
            if (!usdTF.getText().isEmpty() && nisTF.getText().isEmpty()) {
                double usdValue = Double.parseDouble(usdTF.getText());
                double nisResult = usdValue*3.6;
                nisTF.setText(nisResult+"");
                usdTF.setText("");
            } else if (usdTF.getText().isEmpty() && !nisTF.getText().isEmpty()) {
                double nisValue = Double.parseDouble(nisTF.getText());
                double usdResult = nisValue/3.6;
                usdTF.setText(usdResult+"");
                nisTF.setText("");
            }
        });

        VBox root = new VBox(topBox,gridPane,convertButton);
        root.setPadding(new Insets(50));
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,600,400);
        setTitle("Currency Change System Page");
        setScene(scene);
    }
}
