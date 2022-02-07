package com.example.chapter10_introducingjavafx;

// all of our classes come from a package called javafx
// scene and stage are sub-packets of this group
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// all javafx classes are applications, therefore we need to
//extend the application class
public class SmileyFace extends Application
{
    @Override
    public void start(Stage stage)
    {
        // create and configure the main circle for the face
        Circle face = new Circle(125, 125, 80);
        face.setFill(Color.LIME);
        face.setStroke(Color.CRIMSON);

        // create and configure the circle for the right eye
        // Circle(double centerX, double centerY, double radius)
        Circle rightEye = new Circle(86, 100, 10);
        rightEye.setFill(Color.ANTIQUEWHITE);
        rightEye.setStroke(Color.TURQUOISE);

        // create and configure the circle for the left eye
        Circle leftEye = new Circle(162, 100, 10);
        leftEye.setFill(Color.YELLOW);
        leftEye.setStroke(Color.BLUE);

        // create and configure a smiling mouth
        // Arc(double centreX, double centreY, double radiusX, double radiusY,
        //double startAngle, double length)
        Arc mouth = new Arc(125,150,45,35,0,-180);
        mouth.setFill(Color.CRIMSON);
        mouth.setStroke(Color.DARKSALMON);
        mouth.setType(ArcType.ROUND);

        // create and configure the text
        Text caption = new Text(80, 240, "Smiley Face");
        caption.setFill(Color.CORAL);
        caption.setFont(Font.font("Verdana", 15));

        // create a group that holds all the features
        Group root = new Group(face, rightEye,leftEye, mouth, caption);

        // create and configure a new scene
        Scene scene = new Scene(root, 250.0D, 275.0D, Color.ANTIQUEWHITE);

        // add the scene to the stage, and set the title
        stage.setScene(scene);
        stage.setTitle("Hello!");

        // show the stage
        stage.show();


    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
