package com.example.chapter10_introducingjavafx;

/*
Q3. See if you can write the code to produce this triangle using three lines. We
suggest the following vertices:
(100, 70) (100, 250) (400, 250).

Q4. Below you see an application called ColourChanger which produces the
following graphic in which two buttons can be used to change the background
colour:
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

// extend Application class
public class Triangle extends Application {

    // override abstract start method
    @Override
    public void start(Stage stage)
    {
        // create triangle
        Polygon myTriangle = new Polygon(100,70,100,250,400,250);
        //myTriangle.setFill(Color.BLACK);

        // create caption
        Text caption = new Text(150, 300, "My Triangle Attempt");

        // set triangle to another colour
        Button greenTriangle = new Button();
        greenTriangle.setText("Set triangle to green");
        greenTriangle.setOnAction(e -> myTriangle.setFill(Color.GREEN));
        greenTriangle.setMinWidth(100);

        // set triangle to another colour
        Button blackTriangle = new Button();
        blackTriangle.setText("Set triangle to black");
        blackTriangle.setOnAction(e -> myTriangle.setFill(Color.BLACK));
        blackTriangle.setMinWidth(100);

        Button pinkTriangle = new Button();
        pinkTriangle.setText("Set triangle to pink");
        pinkTriangle.setOnAction(e -> myTriangle.setFill(Color.PINK));
        pinkTriangle.setMinWidth(100);

        // create an VBox to hold buttons
        VBox buttonContainer = new VBox();
        buttonContainer.setSpacing(10);
        buttonContainer.setAlignment(Pos.CENTER);
        // add buttons to VBox
        buttonContainer.getChildren().addAll(greenTriangle, blackTriangle, pinkTriangle);

        // create a VBox
        VBox layout = new VBox();
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        layout.setBackground(Background.EMPTY);

        Scene myScene = new Scene(layout, 500, 500);

        // create buttons to change background
        Button blueBackground = new Button();
        blueBackground.setText("Set background to blue");
        blueBackground.setOnAction(e -> myScene.setFill(Color.BLUE));
        blueBackground.setMinWidth(200);

        Button redBackground = new Button();
        redBackground.setText("Set background to red");
        redBackground.setOnAction(e -> myScene.setFill(Color.RED));
        redBackground.setMinWidth(200);

        Button yellowBackground = new Button();
        yellowBackground.setText("Set background to yellow");
        yellowBackground.setOnAction(e -> myScene.setFill(Color.YELLOW));
        yellowBackground.setMinWidth(200);

        // create an VBox to hold buttons
        VBox bgButtonContainer = new VBox();
        bgButtonContainer.setSpacing(10);
        bgButtonContainer.setAlignment(Pos.CENTER);
        // add buttons to VBox
        bgButtonContainer.getChildren().addAll(blueBackground, redBackground, yellowBackground);

        HBox buttonPanel = new HBox();
        buttonPanel.setSpacing(10);
        buttonPanel.setAlignment(Pos.CENTER);
        buttonPanel.getChildren().addAll(buttonContainer, bgButtonContainer);

        layout.getChildren().addAll(myTriangle, caption, buttonPanel);

        stage.setScene(myScene);
        stage.setTitle("My Triangle Scene");
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }



}
