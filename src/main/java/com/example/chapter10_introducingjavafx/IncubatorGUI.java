package com.example.chapter10_introducingjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IncubatorGUI extends Application
{
    // create an object of the Incubator class
    Incubator incubator = new Incubator();

    @Override
    public void start(Stage stage)
    {
        Label header = new Label("Incubator Control Panel");
        header.setPadding(new Insets(20));

        TextArea info = new TextArea();
        info.setEditable(false);
        info.setPadding(new Insets(20));

        // create 4 x buttons, increase, decrease, display temp & help
        Button increase = new Button();
        increase.setText("Increase");
        increase.setOnAction(e -> incubator.increaseTemperature());

        Button decrease = new Button();
        decrease.setText("Decrease");
        decrease.setOnAction(e -> incubator.decreaseTemperature());

        Button display = new Button();
        display.setText("Display temperature");
        display.setOnAction(e -> info.setText("The current temperature is: "
                        + incubator.getTemperature())
                );

        Button help = new Button();
        help.setText("Help");
        help.setOnAction(e -> info.setText("HELP"
                + "\n" + "To increase the temperature, press 'Increase'"
                + "\n" + "The maximum temperature is 10."
                + "\n" + "To decrease the temperature, press 'Decrease'"
                + "\n" + "The minimum temperature is -10."
                + "\n" + "To view current temperature, press 'Display temperature'"
                + "\n" + "For Info, press Help"

        ));

        HBox buttonPanel = new HBox(10);
        buttonPanel.setPadding(new Insets(20));
        buttonPanel.setAlignment(Pos.BASELINE_CENTER);
        buttonPanel.getChildren().addAll(increase, decrease, display, help);

        VBox root = new VBox(20);
        root.setAlignment(Pos.TOP_LEFT);
        root.getChildren().addAll(header, info, buttonPanel);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Incubator Settings");
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}
