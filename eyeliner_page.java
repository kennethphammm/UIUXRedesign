package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
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

        Image eyelinerHeaderImage = new Image(getClass().getResource("/Headers/eyelinerheader.jpg").toExternalForm(), 1920, 1080, true, true);
        ImageView eyelinerHeader = new ImageView(eyelinerHeaderImage);

        // Directly get the Screen width
        double screenWidth = Screen.getPrimary().getVisualBounds().getWidth();

        // Set the width of the ImageView to the screen width and preserve the aspect ratio
        eyelinerHeader.setFitWidth(screenWidth);
        eyelinerHeader.setPreserveRatio(true);

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
        double imageWidth = 350;
        double imageHeight = 350;

        Image eyeliner1 = new Image(getClass().getResource("/Headers/1.png").toExternalForm(), imageWidth, imageHeight, true, true);
        Image eyeliner2 = new Image(getClass().getResource("/Headers/2.png").toExternalForm(), imageWidth, imageHeight, true, true);
        Image eyeliner3 = new Image(getClass().getResource("/Headers/3.png").toExternalForm(), imageWidth, imageHeight, true, true);
        Image eyeliner4 = new Image(getClass().getResource("/Headers/4.png").toExternalForm(), imageWidth, imageHeight, true, true);

        ImageView eyeliner1_imageView1 = new ImageView(eyeliner1);
        ImageView eyeliner2_imageView2 = new ImageView(eyeliner2);
        ImageView eyeliner3_imageView3 = new ImageView(eyeliner3);
        ImageView eyeliner4_imageView4 = new ImageView(eyeliner4);

        Image eyeliner_bottom_page = new Image(getClass().getResource("/category/Bottom_liner_page.png").toExternalForm(), 1920, 1080, true, true);
        ImageView eyeliner_bottom_page_imageView = new ImageView(eyeliner_bottom_page);

        HBox eyeliner_images_hbox = new HBox();
        eyeliner_images_hbox.getChildren().addAll(eyeliner1_imageView1, eyeliner2_imageView2, eyeliner3_imageView3, eyeliner4_imageView4);
        eyeliner_images_hbox.setSpacing(20); // Customize the gap between images
        eyeliner_images_hbox.setPadding(new Insets(10));

        // Combine all elements
        VBox eyelinerPageVBox = new VBox();
        eyelinerPageVBox.getChildren().addAll(homeEyesEyeliner, eyelinerHeader, filterSortBox, eyeliner_images_hbox, eyeliner_bottom_page_imageView);
        eyelinerPageVBox.setAlignment(Pos.CENTER);

        // Set the background color of the root node
        eyelinerPageVBox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        // Wrap the VBox in a ScrollPane
        ScrollPane scrollPane = new ScrollPane(eyelinerPageVBox);
        scrollPane.setFitToWidth(true);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        Scene scene = new Scene(scrollPane, screenWidth, Screen.getPrimary().getVisualBounds().getHeight());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
