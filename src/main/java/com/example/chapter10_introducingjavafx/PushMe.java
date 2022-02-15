package com.example.chapter10_introducingjavafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PushMe extends Application {

    @Override
    public void start (Stage stage)
    {
        // create and configure a header
        Label header = new Label();
        header.setText("Push Me Button Experiment");
        header.setTextFill(Color.RED);
        header.setFont(Font.font("Arial", 50));

        // create and configure a text field for user entry
        TextField pushMeTextField = new TextField();
        pushMeTextField.setMaxWidth(250);

        // create and configure a label to display the output
        Label pushMeLabel = new Label();
        pushMeLabel.setTextFill(Color.RED);
        pushMeLabel.setFont(Font.font("Arial", 20));

        // create and configure a label which will cause the text to be displayed
        Button pushMeButton = new Button();
        pushMeButton.setText("Type something in the box then push me");
        pushMeButton.setOnAction(e -> pushMeLabel.setText("You entered: " + pushMeTextField.getText()));

        // create and configure a second text field for user entry
        TextField noPushMeTextField = new TextField();
        noPushMeTextField.setMaxWidth(250);

        // create and configure a second label to display the output
        Label noPushMeLabel = new Label();
        noPushMeLabel.setTextFill(Color.RED);
        noPushMeLabel.setFont(Font.font("Arial", 20));

        // create and configure a second label which will cause the text to be displayed
        Button noPushMeButton = new Button();
        noPushMeButton.setText("No push me!!");
        noPushMeButton.setOnAction(e -> noPushMeLabel.setText("You entered: " + noPushMeTextField.getText()));


        // create and configure a VBox to hold our components
        VBox root = new VBox();
        root.setSpacing(10);
        root.setAlignment(Pos.TOP_CENTER);

        // add the components to the VBox
        root.getChildren().addAll(header, pushMeTextField, pushMeButton, pushMeLabel);

        // create and configure a VBox to hold our components
        VBox root2 = new VBox();
        root2.setSpacing(10);
        root2.setAlignment(Pos.BOTTOM_CENTER);

        // add the components to the VBox
        root2.getChildren().addAll(root, noPushMeTextField, noPushMeButton, noPushMeLabel);


        // create a new scene
        Scene scene = new Scene(root2, 700, 300);

        // add the scene to the stage, then configure the stage and make it visible
        stage.setScene(scene);
        stage.setTitle("Push Me");
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}
