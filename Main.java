import javafx.application.Application;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import java.awt.*;

public class Main extends Application //Class header
{
// A picture showing a swimming baby duck and a small fish.

    public void start(Stage primaryStage) {
        // method header

        //Rectangle ground = null;
        //Group duck = null;
        //Group root = new Group(ground, duck); // to reconcile different groups into group root, gave me issues.
       // Scene scene = new Scene(root, 600, 500, Color.SKYBLUE); I figured, you can't have group root up here. We learn everyday.

        //Because I'm a beginner, I wanted to make sure the scene looked exactly like I imagined, so I ran it first.
        Ellipse body = new Ellipse(100, 370, 60, 40);
        body.setFill(Color.WHITE);


        Ellipse neck = new Ellipse(155, 353, 10, 20);
        neck.setFill(Color.WHITE); //I would have used the cylinder shape for it but the setFill kept giving me errors sadly.


        Ellipse head = new Ellipse(168, 339, 20, 12);
        head.setFill(Color.WHITE);

        Rectangle mouth = new Rectangle(180,339,20, 10);
        mouth.setFill(Color.YELLOW);
        //I'm trying to get a dark yellow color, I will keep trying but let me move to something else.

        Circle eye = new Circle (170,337,2);
        eye.setFill(Color.BLACK);


        Ellipse upperhead = new Ellipse (160,339,20,22);
        upperhead.setFill(Color.WHITE);

        Ellipse tail = new Ellipse(50,350,20,12);
        tail.setFill(Color.WHITE);

        Group duck = new Group(tail, body, neck, head,upperhead,eye, mouth);

        Text quote =new Text(50,50,"Hello!!! I am an awesome baby duck!");
        quote.setFill(Color.BEIGE);
        quote.setFont(Font.font("Verdana",20));


        Rectangle ground = new Rectangle(0, 400, 1400, 2000);
        ground.setFill(Color.STEELBLUE);

        Ellipse base = new Ellipse (300,420, 15,11);
        base.setFill(Color.DARKORANGE);

        Circle eyes = new Circle (307, 418,1);
        eyes.setFill(Color.BLACK);

        //Line line = new Line (2,418,3,3); Trying to make a fish mouth, but let me let the fish be.

        //Ellipse fin = new Ellipse (230,390,10,20);
        //fin.setFill(Color.DARKORANGE);


        Group fish = new Group(base,eyes); //my cute little orange fish.

        Circle sun = new Circle (500, 100,25);
        sun.setFill(Color.GOLD);

        //Alright, lets light it up with a rainbow.

        Rectangle rainbow1 = new Rectangle(470,55,65,8);
        rainbow1.setFill(Color.RED);

        Rectangle rainbow2 = new Rectangle(470,60,65,8);
        rainbow2.setFill(Color.ORANGE);

        Rectangle rainbow3 = new Rectangle(470,65,65,8);
        rainbow3.setFill(Color.GREEN);

        Rectangle rainbow4 = new Rectangle(470,70,65,8);
        rainbow4.setFill(Color.PURPLE);

        Group rainbow = new Group(rainbow1,rainbow2,rainbow3,rainbow4);





        Group root = new Group(ground,duck,fish,quote,rainbow,sun);
        Scene scene = new Scene(root, 600,500, Color.SKYBLUE);


        primaryStage.setTitle("Class Project");
        primaryStage.setScene(scene);
        primaryStage.show();
        //Run program
    }



    }

