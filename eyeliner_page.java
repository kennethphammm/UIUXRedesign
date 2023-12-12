package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class eyeliner_page extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label homeEyesEyeliner = new Label("Home | Eyes | Eyeliner");
        homeEyesEyeliner.setStyle("-fx-font-size: 22.4px");
        homeEyesEyeliner.setPadding(new Insets(15, 20, 20, 20));

        Image eyelinerHeaderImage = new Image(getClass().getResource("/Headers/eyelinerheader.jpg").toExternalForm());
        ImageView eyelinerHeader = new ImageView(eyelinerHeaderImage);

        // Set the width of the ImageView to the screen width and customize the height
        eyelinerHeader.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth());
        eyelinerHeader.setFitHeight(150);

        Label showFilter = new Label("Show Filter");
        showFilter.setStyle("-fx-font-size: 22.4px;-fx-underline: true;");

        Label showBestSellers = new Label("Best Sellers");
        showBestSellers.setStyle("-fx-font-size: 22.4px;-fx-underline: true;");

        // Creating a ContextMenu for best sellers options
        ContextMenu bestSellersMenu = new ContextMenu();
        bestSellersMenu.getItems().addAll(
                new MenuItem("Best Sellers"),
                new MenuItem("Top Rated"),
                new MenuItem("New Arrivals")
        );

        // Set action for each menu item
        bestSellersMenu.getItems().forEach(menuItem -> menuItem.setOnAction(event -> {
            // Handle the selected option here
            System.out.println("Selected: " + menuItem.getText());
        }));

        // Set the ContextMenu to the label
        showBestSellers.setOnMouseClicked(event -> bestSellersMenu.show(showBestSellers, event.getScreenX(), event.getScreenY()));

        // Create a spacer region to push "Best Sellers" to the far right
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        // Adding a gap between showFilter and showBestSellers
        HBox filterSortBox = new HBox(showFilter, spacer, showBestSellers);
        filterSortBox.setSpacing(9); // Customize the gap as needed
        filterSortBox.setPadding(new Insets(10)); // Set padding

        // Insert images with adjusted sizes
        Image eyeliner1 = new Image(getClass().getResource("/Headers/1.png").toExternalForm(), 300, 300, true, true);
        Image eyeliner2 = new Image(getClass().getResource("/Headers/2.png").toExternalForm(), 300, 300, true, true);
        Image eyeliner3 = new Image(getClass().getResource("/Headers/3.png").toExternalForm(), 300, 300, true, true);
        Image eyeliner4 = new Image(getClass().getResource("/Headers/4.png").toExternalForm(), 300, 300, true, true);

        ImageView eyeliner1_imageView1 = new ImageView(eyeliner1);
        ImageView eyeliner2_imageView2 = new ImageView(eyeliner2);
        ImageView eyeliner3_imageView3 = new ImageView(eyeliner3);
        ImageView eyeliner4_imageView4 = new ImageView(eyeliner4);

        Image e1_review = new Image(getClass().getResource("/Headers/e1_review.png").toExternalForm(), 200, 200, true, true);
        Image e2_review = new Image(getClass().getResource("/Headers/e2_review.png").toExternalForm(), 200, 200, true, true);
        Image e3_review = new Image(getClass().getResource("/Headers/e3_review.png").toExternalForm(), 200, 200, true, true);
        Image e4_review = new Image(getClass().getResource("/Headers/e4_review.png").toExternalForm(), 200, 200, true, true);

        ImageView e1_review_imageView1 = new ImageView(e1_review);
        ImageView e2_review_imageView2 = new ImageView(e2_review);
        ImageView e3_review_imageView3 = new ImageView(e3_review);
        ImageView e4_review_imageView4 = new ImageView(e4_review);

        // Red heart
        Image heart = new Image(getClass().getResource("/category/heart.png").toExternalForm(), 20, 20, true, true);
        Image red_heart = new Image(getClass().getResource("/category/redheart.png").toExternalForm(), 20, 20, true, true);

        ImageView heart_imageView1 = new ImageView(heart);
        ImageView heart_imageView2 = new ImageView(heart);
        ImageView heart_imageView3 = new ImageView(heart);
        ImageView heart_imageView4 = new ImageView(heart);

        // Color options for eyeliner
        Image e1_color_options = new Image(getClass().getResource("/category/e1_options.png").toExternalForm(), 100, 100, true, true);
        Image e2_color_options = new Image(getClass().getResource("/category/e2_options.png").toExternalForm(), 100, 100, true, true);

        ImageView e1_color_options_imageView1 = new ImageView(e1_color_options);
        ImageView e2_color_options_imageView2 = new ImageView(e2_color_options);

        // VBox for hearting the choices
        VBox eyeliner1_VBox = new VBox();
        eyeliner1_VBox.getChildren().addAll(heart_imageView1, e1_color_options_imageView1);
        eyeliner1_VBox.setPadding(new Insets(7));

        HBox eyeliner1_Hbox = new HBox();
        eyeliner1_Hbox.getChildren().addAll(e1_review_imageView1, eyeliner1_VBox);

        VBox eyeliner2_VBox = new VBox();
        eyeliner2_VBox.getChildren().addAll(heart_imageView2, e2_color_options_imageView2);
        eyeliner2_VBox.setPadding(new Insets(7));

        HBox eyeliner2_Hbox = new HBox();
        eyeliner2_Hbox.getChildren().addAll(e2_review_imageView2, eyeliner2_VBox);

        HBox eyeliner3_Hbox = new HBox();
        eyeliner3_Hbox.getChildren().addAll(e3_review_imageView3, heart_imageView3);
        eyeliner3_Hbox.setPadding(new Insets(7));

        HBox eyeliner4_Hbox = new HBox();
        eyeliner4_Hbox.getChildren().addAll(e4_review_imageView4, heart_imageView4);
        eyeliner3_Hbox.setPadding(new Insets(7));

        VBox eyeliner1_vBox1 = new VBox();
        VBox eyeliner2_vBox2 = new VBox();
        VBox eyeliner3_vBox3 = new VBox();
        VBox eyeliner4_vBox4 = new VBox();
        eyeliner1_vBox1.getChildren().addAll(eyeliner1_imageView1, eyeliner1_Hbox);
        eyeliner2_vBox2.getChildren().addAll(eyeliner2_imageView2, eyeliner2_Hbox);
        eyeliner3_vBox3.getChildren().addAll(eyeliner3_imageView3, eyeliner3_Hbox);
        eyeliner4_vBox4.getChildren().addAll(eyeliner4_imageView4, eyeliner4_Hbox);

        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(eyeliner1_vBox1, eyeliner2_vBox2, eyeliner3_vBox3, eyeliner4_vBox4);
        hBox2.setSpacing(40);
        hBox2.setAlignment(Pos.CENTER);

        // Combine all elements
        VBox eyelinerPageVBox = new VBox();
        eyelinerPageVBox.getChildren().addAll(homeEyesEyeliner, eyelinerHeader, filterSortBox, hBox2);
        eyelinerPageVBox.setAlignment(Pos.CENTER);

        // Set the background color of the root node
        eyelinerPageVBox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        Scene scene = new Scene(eyelinerPageVBox, Screen.getPrimary().getVisualBounds().getWidth(), Screen.getPrimary().getVisualBounds().getHeight());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


