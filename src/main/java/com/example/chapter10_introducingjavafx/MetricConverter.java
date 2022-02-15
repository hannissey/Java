package com.example.chapter10_introducingjavafx;

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MetricConverter extends Application
{
    @Override
    public void start(Stage stage)
    {
        DecimalFormat df = new DecimalFormat("0.0#");

        Label header = new Label("JavaFX Metric Converter Tool");
        header.setTextFill(Color.GREEN);
        header.setFont(Font.font("Arial", 50));
        header.setPadding(new Insets(20));

        Label header1 = new Label("Convert Centimetres to Inches");
        header1.setTextFill(Color.RED);
        header1.setFont(Font.font("Arial", 20));

        // first the components for converting back and forth from inches to centimetres
        // create input fields, and labels to show the units
        TextField cmText = new TextField();
        Label cmLabel = new Label("Cm");
        TextField inchText = new TextField();
        Label inchLabel = new Label("Inches");

        // create buttons to perform the calculations
        Button cmToInchButton = new Button(" ===> ");
        Button inchToCmButton = new Button(" <=== ");

        // create a VBox to hold the buttons
        VBox inchCmButtons = new VBox();
        inchCmButtons.getChildren().addAll(cmToInchButton, inchToCmButton);

        // create an HBox to hold all the items for the first row
        HBox inchCmPanel = new HBox(10); // compound container
        inchCmPanel.getChildren().addAll(cmText, cmLabel, inchCmButtons, inchText, inchLabel);
        inchCmPanel.setAlignment(Pos.CENTER);

        // next the components for converting back and forth from miles to kilometres

        Label header2 = new Label("Convert Kilometres to Miles");
        header2.setTextFill(Color.RED);
        header2.setFont(Font.font("Arial", 20));

        // create input fields, and labels to show the units
        TextField kmText = new TextField();
        Label kmLabel = new Label("Km");
        TextField mileText = new TextField();
        Label mileLabel = new Label("Miles "); // extra spaces make all labels the same length

        // create buttons to perform the calculations
        Button kmToMileButton = new Button(" ===> ");
        Button mileToKmButton = new Button(" <=== ");

        // create a VBox to hold the buttons
        VBox mileKmButtons = new VBox();
        mileKmButtons.getChildren().addAll(kmToMileButton, mileToKmButton);

        // create an HBox to hold all the items for the second row
        HBox mileKmPanel = new HBox(10); // compound container
        mileKmPanel.getChildren().addAll(kmText, kmLabel, mileKmButtons, mileText, mileLabel);
        mileKmPanel.setAlignment(Pos.CENTER);

        // finally, the components for converting back and forth from pounds to kilograms

        Label header3 = new Label("Convert Kilograms to Pounds");
        header3.setTextFill(Color.RED);
        header3.setFont(Font.font("Arial", 20));

        // create input fields, and labels to show the units
        TextField kgText = new TextField();
        Label kgLabel = new Label("Kg");
        TextField poundText = new TextField();
        Label poundLabel = new Label("Pounds "); // extra spaces make all labels the same length

        // create buttons to perform the calculations
        Button kgToPoundButton = new Button(" ===> ");
        Button poundToKgButton = new Button(" <=== ");

        // create a VBox to hold the buttons
        VBox poundKgButtons = new VBox();
        poundKgButtons.getChildren().addAll(kgToPoundButton, poundToKgButton);

        // create an HBox to hold all the items for the second row
        HBox poundKgPanel = new HBox(10); // compound container
        poundKgPanel.getChildren().addAll(kgText, kgLabel, poundKgButtons, poundText, poundLabel);
        poundKgPanel.setAlignment(Pos.CENTER);

        // Add some additional features to the MetricConverter—for example Celsius
        // to Fahrenheit or litres to pints.

        Label header4 = new Label("Convert Celsius to Fahrenheit");
        header4.setTextFill(Color.RED);
        header4.setFont(Font.font("Arial", 20));

        // create input fields, and labels to show the units
        TextField celsiusText = new TextField();
        Label celsiusLabel = new Label("Celsius");
        TextField fahrenheitText = new TextField();
        Label fahrenheitLabel = new Label("Fahrenheit");

        // create buttons to perform the calculations
        Button celsiusToFahrenheitButton = new Button(" ===> ");
        Button fahrenheitToCelsiusButton = new Button(" <=== ");

        // create a VBox to hold the buttons
        VBox celsiusFahrenheitButtons = new VBox();
        celsiusFahrenheitButtons.getChildren().addAll(celsiusToFahrenheitButton, fahrenheitToCelsiusButton);

        // create an HBox to hold all the items for the first row
        HBox celsiusFahrenheitPanel = new HBox(10); // compound container
        celsiusFahrenheitPanel.getChildren().addAll(celsiusText, celsiusLabel, celsiusFahrenheitButtons, fahrenheitText, fahrenheitLabel);
        celsiusFahrenheitPanel.setAlignment(Pos.CENTER);





        Label header5 = new Label("Convert Litres to Pints");
        header5.setTextFill(Color.RED);
        header5.setFont(Font.font("Arial", 20));

        // create input fields, and labels to show the units
        TextField litresText = new TextField();
        Label litresLabel = new Label("Litres");
        TextField pintsText = new TextField();
        Label pintsLabel = new Label("Pints");

        // create buttons to perform the calculations
        Button litresToPintsButton = new Button(" ===> ");
        Button pintsToLitresButton = new Button(" <=== ");

        // create a VBox to hold the buttons
        VBox litresPintsButtons = new VBox();
        litresPintsButtons.getChildren().addAll(litresToPintsButton, pintsToLitresButton);

        // create an HBox to hold all the items for the first row
        HBox litresPintsPanel = new HBox(10); // compound container
        litresPintsPanel.getChildren().addAll(litresText, litresLabel, litresPintsButtons, pintsText, pintsLabel);
        litresPintsPanel.setAlignment(Pos.CENTER);

        // create a VBox to hold all three rows
        VBox root = new VBox(10);
        root.getChildren().addAll(header, header1, inchCmPanel, header2, mileKmPanel,
                header3, poundKgPanel, header4, celsiusFahrenheitPanel, header5, litresPintsPanel);
        root.setAlignment(Pos.CENTER);

        // write the code for the buttons
        cmToInchButton.setOnAction(e ->
                    {
                        String s = cmText.getText();
                        double d = Double.parseDouble(s);
                        d = d / 2.54;
                        s = df.format(d);
                        inchText.setText(s);
                    }
                );

        inchToCmButton.setOnAction( e ->
                    {
                        String s = inchText.getText();
                        double d = Double.parseDouble(s);
                        d = d * 2.54;
                        s = df.format(d);
                        cmText.setText(s);
                    }

                );

        kmToMileButton.setOnAction( e ->
                    {
                        String s = kmText.getText();
                        double d = Double.parseDouble(s);
                        d = d / 1.609;
                        s = df.format(d);
                        mileText.setText(s);
                    }
                );

        mileToKmButton.setOnAction( e ->
                    {
                        String s = mileText.getText();
                        double d = Double.parseDouble(s);
                        d = d * 1.609;
                        s = df.format(d);
                        kmText.setText(s);
                    }
                );

        kgToPoundButton.setOnAction( e ->
                    {
                        String s = kgText.getText();
                        double d = Double.parseDouble(s);
                        d = d * 2.2;
                        s = df.format(d);
                        poundText.setText(s);
                    }
                );

        poundToKgButton.setOnAction( e ->
                    {
                        String s = poundText.getText();
                        double d = Double.parseDouble(s);
                        d = d / 2.2;
                        s = df.format(d);
                        kgText.setText(s);
                    }
                 );

        celsiusToFahrenheitButton.setOnAction( e ->
                    {
                        String s = celsiusText.getText();
                        double d = Double.parseDouble(s);
                        d = ((d * 9) / 5) + 32;
                        s = df.format(d);
                        fahrenheitText.setText(s);
                    }
                );

        fahrenheitToCelsiusButton.setOnAction( e ->
                {
                    String s = fahrenheitText.getText();
                    double d = Double.parseDouble(s);
                    d = ((d - 32) * 5) / 9;
                    s = df.format(d);
                    celsiusText.setText(s);
                }
        );

        litresToPintsButton.setOnAction( e ->
                {
                    String s = litresText.getText();
                    double d = Double.parseDouble(s);
                    d = d * 2.113376;
                    s = df.format(d);
                    pintsText.setText(s);
                }
                );

        pintsToLitresButton.setOnAction( e ->
                {
                    String s = pintsText.getText();
                    double d = Double.parseDouble(s);
                    d = d * 0.473176;
                    s = df.format(d);
                    litresText.setText(s);
                }
        );

        // create a new scene
        Scene scene = new Scene(root);

        // add the scene to the stage, then configure the stage and make it visible
        stage.setScene(scene);
        stage.setTitle("Metric Converter");
        stage.setWidth(1000);
        stage.setHeight(700);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

}
