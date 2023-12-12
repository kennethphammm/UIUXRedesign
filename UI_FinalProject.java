package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UI_FinalProject extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label bestseller = new Label("BESTSELLERS");
        bestseller.setStyle("-fx-font-family: 'Canva Sans'; -fx-font-size: 38.3; -fx-font-weight: bold;");
        Label shop_all = new Label("Shop All");
        shop_all.setStyle("-fx-font-size: 20.4");
        shop_all.setPadding(new Insets(15, 20, 20, 20));
        HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(bestseller, shop_all);
        hBox1.setSpacing(10);
        hBox1.setPadding(new Insets(20));

        Image image1 = new Image(getClass().getResource("/Products/1.jpg").toExternalForm());
        Image image2 = new Image(getClass().getResource("/Products/2.jpg").toExternalForm());
        Image image3 = new Image(getClass().getResource("/Products/3.jpg").toExternalForm());
        Image image4 = new Image(getClass().getResource("/Products/4.jpg").toExternalForm());

        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        Label description_image1 = new Label("Dior\nColour Play Gel Eyeliner\n$140.00");
        Label description_image2 = new Label("Dior\nColour Play Gel Eyeliner\n$140.00");
        Label description_image3 = new Label("Dior\nColour Play Gel Eyeliner\n$140.00");
        Label description_image4 = new Label("Dior\nColour Play Gel Eyeliner\n$140.00");

        VBox vBox2 = new VBox();
        VBox vBox3 = new VBox();
        VBox vBox4 = new VBox();
        VBox vBox5 = new VBox();
        double fixedVBoxHeight = 350; // Set a fixed height for each VBox
        vBox2.setMinHeight(fixedVBoxHeight);
        vBox3.setMinHeight(fixedVBoxHeight);
        vBox4.setMinHeight(fixedVBoxHeight);
        vBox5.setMinHeight(fixedVBoxHeight);
        vBox2.getChildren().addAll(imageView1, description_image1);
        vBox3.getChildren().addAll(imageView2, description_image2);
        vBox4.getChildren().addAll(imageView3, description_image3);
        vBox5.getChildren().addAll(imageView4, description_image4);

        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(vBox2, vBox3, vBox4, vBox5);
        hBox2.setSpacing(40);
        hBox2.setAlignment(Pos.CENTER);

        // Shop category section
        Label category = new Label("SHOP BY CATEGORY");
        category.setStyle("-fx-font-family: 'Canva Sans'; -fx-font-size: 38.3; -fx-font-weight: bold;");
        Label shop_all2 = new Label("Shop All");
        shop_all2.setStyle("-fx-font-size: 20.4");
        shop_all2.setPadding(new Insets(15, 20, 20, 20));
        HBox hBox_category1 = new HBox();
        hBox_category1.getChildren().addAll(category, shop_all2);
        hBox_category1.setSpacing(10);
        hBox_category1.setPadding(new Insets(20));

        Image face = new Image(getClass().getResource("/category/1.jpeg").toExternalForm());
        Image lips = new Image(getClass().getResource("/category/2.jpeg").toExternalForm());
        Image cheeks = new Image(getClass().getResource("/category/3.jpeg").toExternalForm());
        Image eyes = new Image(getClass().getResource("/category/4.jpeg").toExternalForm());
        Image brushes = new Image(getClass().getResource("/category/5.jpeg").toExternalForm());

        ImageView imageView_face = new ImageView(face);
        ImageView imageView_lips = new ImageView(lips);
        ImageView imageView_cheeks = new ImageView(cheeks);
        ImageView imageView_eyes = new ImageView(eyes);
        ImageView imageView_brushes = new ImageView(brushes);

        Label label_face = new Label("Face");
        Label label_lips = new Label("Lips");
        Label label_cheeks = new Label("Cheeks");
        Label label_eyes = new Label("Eyes");
        Label label_brushes = new Label("Brushes");

        label_face.setStyle("-fx-font-size: 17; -fx-font-weight: bold;");
        label_lips.setStyle("-fx-font-size: 17; -fx-font-weight: bold");
        label_cheeks.setStyle("-fx-font-size: 17; -fx-font-weight: bold");
        label_eyes.setStyle("-fx-font-size: 17; -fx-font-weight: bold");
        label_brushes.setStyle("-fx-font-size: 17; -fx-font-weight: bold");

        double maxWidth = 250;
        double maxHeight = 250;
        imageView_face.setFitWidth(maxWidth);
        imageView_face.setFitHeight(maxHeight);
        imageView_lips.setFitWidth(maxWidth);
        imageView_lips.setFitHeight(maxHeight);
        imageView_cheeks.setFitWidth(maxWidth);
        imageView_cheeks.setFitHeight(maxHeight);
        imageView_eyes.setFitWidth(maxWidth);
        imageView_eyes.setFitHeight(maxHeight);
        imageView_brushes.setFitWidth(maxWidth);
        imageView_brushes.setFitHeight(maxHeight);

        VBox vBox_face = new VBox();
        VBox vBox_lips = new VBox();
        VBox vBox_cheeks = new VBox();
        VBox vBox_eyes = new VBox();
        VBox vBox_brushes = new VBox();

        vBox_face.getChildren().addAll(imageView_face, label_face);
        vBox_lips.getChildren().addAll(imageView_lips, label_lips);
        vBox_cheeks.getChildren().addAll(imageView_cheeks, label_cheeks);
        vBox_eyes.getChildren().addAll(imageView_eyes, label_eyes);
        vBox_brushes.getChildren().addAll(imageView_brushes, label_brushes);

        vBox_face.setAlignment(Pos.CENTER);
        vBox_lips.setAlignment(Pos.CENTER);
        vBox_cheeks.setAlignment(Pos.CENTER);
        vBox_eyes.setAlignment(Pos.CENTER);
        vBox_brushes.setAlignment(Pos.CENTER);

        HBox hBox_category = new HBox();
        hBox_category.getChildren().addAll(vBox_face, vBox_lips, vBox_cheeks, vBox_eyes, vBox_brushes);
        hBox_category.setSpacing(40);
        hBox_category.setAlignment(Pos.CENTER);

        VBox shop_category_vBox = new VBox();
        shop_category_vBox.getChildren().addAll(hBox_category1, hBox_category);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(new VBox(hBox1, hBox2, shop_category_vBox));
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(scrollPane);
        
        // Set background color to white
        vBox.setStyle("-fx-background-color: white;");
        
        Scene scene = new Scene(vBox, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}





