package com.example.cs2450project;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Image i = new Image("file:////Users/yintinglo/IdeaProjects/CS2450Project/target/classes/com/example/cs2450project/CS2450pic5.png");
        ImageView iv = new ImageView(i);

        ScrollPane sp = new ScrollPane();
        sp.setFitToWidth(true);
        sp.setFitToHeight(true);
        sp.setContent(iv);

        GridPane gp = new GridPane();
        gp.getChildren().add(sp);
        gp.setAlignment(Pos.TOP_CENTER);

        BorderPane bp = new BorderPane(gp);

        // gridpane inside borderplane inside scrollpane

        Scene scene = new Scene(bp,1920, 1300);
        scene.setFill(Color.WHITE); // need to adjust to brighter white
        stage.setTitle("CS2450 Project:");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}