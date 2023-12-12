package com.example.cs2450projectshoppingcart;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    private Button add;
    private Button subtract;
    private Label subtotalL;
    private Label quantity;
    private Label total;
    private int quantityCounter;
    private double subtotalEyelinerD;
    private double totalTOTAL;

    private TextField couponTF;
    @Override
    public void start(Stage stage) throws IOException {

        // shopping cart: would need some sort of set on mouse action to lead to this page
        // clicking the add to bag button for a product should lead to it being added to this page

        // top cart
        Image i = new Image("file:////Users/yintinglo/IdeaProjects/CS2450ProjectShoppingCart/src/main/java/com/example/cs2450projectshoppingcart/CS2450pic7.png");
        ImageView iv = new ImageView(i);
        //iv.setPreserveRatio(false);
        HBox topHBOX = new HBox(iv);
        topHBOX.setAlignment(Pos.CENTER);
        HBox.setHgrow(iv, javafx.scene.layout.Priority.ALWAYS);
        topHBOX.setPrefHeight(300);
        topHBOX.setPrefWidth(1300);

        // product picture vbox
        Image productImage = new Image("file:////Users/yintinglo/IdeaProjects/CS2450ProjectShoppingCart/src/main/java/com/example/cs2450projectshoppingcart/CS2450pic8.png");
        ImageView pv = new ImageView(productImage);
        pv.setFitHeight(200);
        pv.setFitWidth(200);
        VBox productVBOX = new VBox(50, pv);

        // product text
        Label productL = new Label("COLOUR PLAY GEL EYELINER");
        Label descriptionL = new Label("IN STOCK");
        Label wishlistL = new Label("SAVE TO WISHLIST");

        // label vbox
        VBox descriptionVBOX = new VBox(50, productL, descriptionL, wishlistL);

        // price & price vbox
        Label priceL = new Label("$3.50");
        VBox priceVBOX = new VBox(50, priceL);

        // subtotal & vbox
        subtotalL = new Label("3.50");
        subtotalEyelinerD = 3.50;
        VBox subtotalVBOX = new VBox(50, subtotalL);

        // buttons: add & subtract, label: quantity
        quantity = new Label("1");
        quantityCounter = 1;

        add = new Button("+");
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                subtotalEyelinerD = subtotalEyelinerD + 3.50;
                quantityCounter++;
                updateSubtotalAndQuantity();
            }
        });

        subtract = new Button("-");
        subtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (subtotalEyelinerD > 0) {
                    subtotalEyelinerD = subtotalEyelinerD - 3.50;
                    quantityCounter--;
                    updateSubtotalAndQuantity();
                } else {
                    subtotalL.setText("$0.00");
                    quantityCounter = 0;
                }

            }
        });

        // button hbox
        HBox buttonHBOX = new HBox(20, add, quantity, subtract);

        // gridpane: product, label, price, quantity
        GridPane productGP = new GridPane();
        productGP.setHgap(50);
        productGP.add(productVBOX, 0, 0);
        productGP.add(descriptionVBOX, 1, 0);
        productGP.add(priceVBOX, 6, 0);
        productGP.add(buttonHBOX, 9, 0);
        productGP.add(subtotalVBOX, 12, 0);

        // product hbox: gridpane
        HBox productHBOX = new HBox(50, productGP);
        productHBOX.setPadding(new Insets(60));

        // cart total
        Label points = new Label("COMPLETE YOUR ORDER TO EARN POINTS");
        Label cartTOTAL = new Label("CART SUBTOTAL");
        total = new Label();
        totalTOTAL = subtotalEyelinerD; // can add any other products later?
        total.setText("$" + totalTOTAL);

        // coupon textfield & hbox
        couponTF = new TextField();
        couponTF.setPromptText("COUPON CODE");
        Button couponB = new Button("APPLY");
        couponB.setOnAction(actionEvent -> {
            String couponCODE = couponTF.getText();
            if (couponCODE.equals("BEYONCE")) {
                totalTOTAL = totalTOTAL / 2;
                total.setText("$" + totalTOTAL);
                couponTF.setPromptText("COUPON APPLIED");
            }
        });

        // continue & checkout
        Button continueB = new Button("CONTINUE SHOPPING");
        Button checkoutB = new Button("SECURELY CHECKOUT NOW");
        checkoutB.setOnAction(e -> checkoutStage());


        // hbox & vbox containers: cart total & coupon
        HBox totalHBOX = new HBox(50, points, cartTOTAL, total);
        HBox couponHBOX = new HBox(50, couponTF, couponB);
        HBox contcheckHBOX = new HBox(50, continueB, checkoutB);
        VBox totalCouponVBOX = new VBox(50, totalHBOX, couponHBOX, contcheckHBOX);


        BorderPane bp = new BorderPane();
        bp.setTop(topHBOX);
        bp.setCenter(productHBOX); // this holds the gridpane
        bp.setBottom(totalCouponVBOX);

        // container work
        ScrollPane sp = new ScrollPane();
        sp.setFitToWidth(true);
        sp.setFitToHeight(true);
        sp.setContent(bp);

        Scene scene = new Scene(sp, 1300, 500);
        stage.setTitle("CS2450 Project: Shopping Cart");
        stage.setScene(scene);
        stage.show();
    }

    private void checkoutStage() {
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.setTitle("SECURE CHECKOUT");

        // Content for the popup stage
        Button closeButton = new Button("Close Popup");
        closeButton.setOnAction(e -> popupStage.close());

        VBox popupLayout = new VBox(10);
        popupLayout.getChildren().addAll(closeButton);

        // popup scene & stage
        Scene popupScene = new Scene(popupLayout, 200, 100);
        popupStage.setScene(popupScene);
        popupStage.showAndWait();
    }

    private void updateSubtotalAndQuantity() {
        String subtotalEyelinerS = String.format("%.2f", subtotalEyelinerD);
        String quantityS = String.valueOf(quantityCounter);
        subtotalL.setText("$" + subtotalEyelinerS);
        quantity.setText(quantityS);
        total.setText("$" + subtotalEyelinerS);
        totalTOTAL = subtotalEyelinerD;
    }

    public static void main (String[] args) {
        launch();
    }
}