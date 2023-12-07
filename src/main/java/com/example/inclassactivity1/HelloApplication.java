package com.example.inclassactivity1;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloApplication extends Application {

        @Override
        public void start(Stage primaryStage) throws IOException {

                primaryStage.setTitle("BH Cosmetics");
                BorderPane TopBorderPane = new BorderPane();
                Rectangle PinkRectangle = new Rectangle(1300, 50, Color.web("#fde4e6"));
                Label pinkText = new Label("CYBER SAVINGS! UP TO 50% OFF EVERYTHING + FREE GIFT WHEN YOU SPEND $60+");
                StackPane PinkBanner = new StackPane(PinkRectangle, pinkText);

                MenuBar menuBar = new MenuBar();

                ImageView logo = new ImageView("file:./res/Logo.png");
                logo.setPreserveRatio(true);
                logo.setFitHeight(45);

                ImageView search = new ImageView("file:./res/search.png");
                search.setPreserveRatio(true);
                search.setFitHeight(25);

                Label amountOfItems = new Label("0");
                Label cost = new Label("$0.00");

                Menu NewIn = new Menu("New In");

                Menu Eyes = new Menu("Eyes");
                MenuItem Eyeshadow = new MenuItem("Eyeshadow");
                MenuItem FalseLashes = new MenuItem("False Lashes");
                MenuItem Eyeliner = new MenuItem("Eyeliner");
                MenuItem EyeGlitter = new MenuItem("Eye Glitter");
                MenuItem Brows = new MenuItem("Brows");
                Eyes.getItems().addAll(Eyeshadow, Eyeliner, EyeGlitter, Brows, FalseLashes);

                Menu BrushesandTools = new Menu("Brushes & Tools");
                MenuItem BrushSets = new MenuItem("Brush Sets");
                MenuItem SingleBrushes = new MenuItem("Single Brushes");
                MenuItem MakeupBags = new MenuItem("Makeup Bags");
                BrushesandTools.getItems().addAll(BrushSets, SingleBrushes, MakeupBags);

                Menu Face = new Menu("Face");
                MenuItem Foundation = new MenuItem("Foundation");
                MenuItem Concealer = new MenuItem("Concealer");
                Face.getItems().addAll(Foundation, Concealer);

                Menu Lips = new Menu("Lips");
                MenuItem LipGloss = new MenuItem("Lip Gloss");
                MenuItem LiquidLipstick = new MenuItem("Liquid Lipstick");
                Lips.getItems().addAll(LipGloss, LiquidLipstick);

                Menu Cheeks = new Menu("Cheeks");
                MenuItem Blush = new MenuItem("Blush");
                MenuItem Highlight = new MenuItem("Highlight");
                MenuItem Bronzer = new MenuItem("Bronzer");
                MenuItem Contour = new MenuItem("Contour");
                Cheeks.getItems().addAll(Blush, Highlight, Bronzer, Contour);

                menuBar.getMenus().addAll(NewIn, Face, Lips, Cheeks, Eyes,
                                BrushesandTools);

                Rectangle grayRectangle = new Rectangle(1300, 50, Color.web("#f2f2f1"));
                ImageView banner = new ImageView("file:./res/banner.png");
                banner.setPreserveRatio(true);
                banner.setFitHeight(40);
                StackPane GrayBanner = new StackPane(grayRectangle, banner);

                Label CYBERMONDAYISHERE = new Label("CYBER MONDAY IS HERE");
                Label UPTO = new Label("UP TO");
                Label OFF = new Label("50% OFF");
                Label EVERYTHING = new Label("EVERYTHING");
                Label PLUS = new Label("PLUS FREE GIFT WHEN YOU SPEND $60+");
                VBox TextVBox = new VBox(-5, CYBERMONDAYISHERE, UPTO, OFF, EVERYTHING, PLUS);
                TextVBox.setAlignment(Pos.CENTER);
                Rectangle PinkOrnamentRectangle = new Rectangle(650, 210, Color.web("#fde4e6"));
                Rectangle DarkPinkOrnamentRectangle = new Rectangle(660, 220, Color.web("#b84c65"));
                ImageView ornament = new ImageView("file:./res/ornaments.png");
                ornament.setFitHeight(270);
                ornament.setFitWidth(1300);
                StackPane OrnamentBanner = new StackPane(ornament, DarkPinkOrnamentRectangle, PinkOrnamentRectangle,
                                TextVBox);

                HBox menuHBox = new HBox(20, logo, menuBar, search, amountOfItems, cost);
                menuHBox.setAlignment(Pos.CENTER);

                Label directory = new Label("Home | Eyes | Eyeliner");

                Image image1Image = new Image("file:./res/item1.png");
                ImageView image1Large = new ImageView(image1Image);
                image1Large.setPreserveRatio(true);
                image1Large.setFitHeight(500);
                HBox image1LargeHbox = new HBox(image1Large);
                image1LargeHbox.setAlignment(Pos.CENTER);

                ImageView image1 = new ImageView(image1Image);
                image1.setPreserveRatio(true);
                image1.setFitHeight(70);
                HBox image1HBox = new HBox(image1);
                Button image1Button = new Button();
                image1Button.setGraphic(image1HBox);
                image1Button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image1Image);
                        }
                });

                Image image2Image = new Image("file:./res/item2.png");
                ImageView image2 = new ImageView(image2Image);
                image2.setPreserveRatio(true);
                image2.setFitHeight(70);
                HBox image2HBox = new HBox(image2);
                Button image2Button = new Button();
                image2Button.setGraphic(image2HBox);
                image2Button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image2Image);
                        }
                });

                Image image3Image = new Image("file:./res/item3.png");
                ImageView image3 = new ImageView(image3Image);
                image3.setPreserveRatio(true);
                image3.setFitHeight(70);
                HBox image3HBox = new HBox(image3);
                Button image3Button = new Button();
                image3Button.setGraphic(image3HBox);
                image3Button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image3Image);
                        }
                });

                Image image4Image = new Image("file:./res/item4.png");
                ImageView image4 = new ImageView(image4Image);
                image4.setPreserveRatio(true);
                image4.setFitHeight(70);
                HBox image4HBox = new HBox(image4);
                Button image4Button = new Button();
                image4Button.setGraphic(image4HBox);
                image4Button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image4Image);
                        }
                });

                HBox seletionImageHBox = new HBox(10, image1Button, image2Button, image3Button, image4Button);
                seletionImageHBox.setAlignment(Pos.CENTER);

                String expandedPRODUCTOVERVIEW = new String(
                                "Pick and play! Get ready to serve power-packed looks in " +
                                                "\npowerful pigment in our Colour Play – Gel Eyeliner! " +
                                                "\nCreated with jojoba oil and vitamin E, this thin-tipped" +
                                                "\nliner is both hydrating and soft, making it the go-to for" +
                                                "\neffortless, no-limit eye looks that last. The high-impact," +
                                                "\nno budge, smudge-resistant formula glides on smoothly for" +
                                                "\nseamless application in the waterline.\n"
                                                + //
                                                "Available in 4 versatile shades:​\n" + //
                                                "   • Black​\n" + //
                                                "   • White​\n" + //
                                                "   • Navy Blue\n" + //
                                                "   • Brown​\n" + //
                                                "Vegan. Cruelty-Free. Clean Ingredients\n" + //
                                                "");

                TreeItem<String> PRODUCTOVERVIEW = new TreeItem<String>("PRODUCT OVERVIEW");
                PRODUCTOVERVIEW.setExpanded(false);
                PRODUCTOVERVIEW.getChildren().addAll(
                                new TreeItem<String>(expandedPRODUCTOVERVIEW));

                String expandedDIRECTIONS = new String(
                                "Application: Sweep onto the waterline or onto the lids as\n desired.");

                TreeItem<String> DIRECTIONS = new TreeItem<String>("DIRECTIONS");
                DIRECTIONS.setExpanded(false);
                DIRECTIONS.getChildren().addAll(
                                new TreeItem<String>(expandedDIRECTIONS));

                String expandedINGREDIENTS = new String(
                                "Dimethicone, Candelilla Cera (Euphorbia Cerifera (Candelilla)" +
                                                "\nWax/Cire De Candelilla), Cera Microcristallina" +
                                                "\n(Microcrystalline Wax/Cire Microcristalline), C13-15 Alkane," +
                                                "\nTrimethylsiloxysilicate, Synthetic Beeswax, Silica, Helianthus" +
                                                "\n Annuus (Sunflower) Seed Oil, Disteardimonium Hectorite," +
                                                "\nHydroxide, Phenoxyethanol, Alcohol, Simmondsia Chinensis " +
                                                "\nOil, Tocopheryl Acetate, Anthemis Nobilis Flower Extract," +
                                                "\nBht, Ci 77891 (Titanium Dioxide). ");

                TreeItem<String> INGREDIENTS = new TreeItem<String>("INGREDIENTS");
                INGREDIENTS.setExpanded(false);
                INGREDIENTS.getChildren().addAll(
                                new TreeItem<String>(expandedINGREDIENTS));

                String expandedPRODUCTDETAILS = new String("Range:   Bh Los Angeles Colour Play Gel Eyeliner\n" +
                                "Brand:   BH Cosmetics");

                TreeItem<String> PRODUCTDETAILS = new TreeItem<String>("PRODUCT DETAILS");
                PRODUCTDETAILS.setExpanded(false);
                PRODUCTDETAILS.getChildren().addAll(
                                new TreeItem<String>(expandedPRODUCTDETAILS));

                TreeItem<String> DESCRIPTION = new TreeItem<String>("DESCRIPTION");
                DESCRIPTION.setExpanded(false);
                DESCRIPTION.getChildren().addAll(PRODUCTOVERVIEW, DIRECTIONS, INGREDIENTS, PRODUCTDETAILS);

                TreeView<String> treeView = new TreeView<String>(DESCRIPTION);
                ImageView reviews = new ImageView("file:./res/reviews.png");
                reviews.setPreserveRatio(true);
                reviews.setFitWidth(520);

                VBox directoryVBox = new VBox(directory);
                directoryVBox.setAlignment(Pos.CENTER_LEFT);
                VBox itemLeft = new VBox(26.5, directoryVBox, image1LargeHbox, seletionImageHBox, reviews);
                itemLeft.setAlignment(Pos.CENTER);

                Label ItemName = new Label("COLOUR PLAY GEL EYELINER");
                Label Reward = new Label("EARN 4 REWARD POINTS WHEN PURCHASING THIS PRODUCT");
                ImageView rating = new ImageView("file:./res/rating.png");
                rating.setPreserveRatio(true);
                rating.setFitHeight(30);
                Label price = new Label("$3.50");
                Label savings = new Label("YOU SAVE: $1.50");
                Label rrp = new Label("RRP $5.00");
                Label colortext = new Label("BLACK");

                ImageView black = new ImageView("file:./res/black.png");
                black.setPreserveRatio(true);
                black.setFitHeight(50);
                Button blackButton = new Button();
                blackButton.setGraphic(black);
                blackButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image1Image);
                                image1.setImage(image1Image);
                                image2.setImage(image2Image);
                                image3.setImage(image3Image);
                                image4.setImage(image4Image);
                                colortext.setText("BLACK");
                        }
                });

                Image brownImage1 = new Image("file:./res/brownimage1.png");
                Image brownImage2 = new Image("file:./res/brownimage2.png");
                Image brownImage3 = new Image("file:./res/brownimage3.png");
                Image brownImage4 = new Image("file:./res/brownimage4.png");
                ImageView brown = new ImageView("file:./res/brown.png");
                brown.setPreserveRatio(true);
                brown.setFitHeight(50);
                Button brownButton = new Button();
                brownButton.setGraphic(brown);
                brownButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(brownImage1);
                                image1.setImage(brownImage1);
                                image2.setImage(brownImage2);
                                image3.setImage(brownImage3);
                                image4.setImage(brownImage4);
                                colortext.setText("BROWN");
                        }
                });

                Image blueImage1 = new Image("file:./res/blueimage1.png");
                Image blueImage2 = new Image("file:./res/blueimage2.png");
                Image blueImage3 = new Image("file:./res/blueimage3.png");
                Image blueImage4 = new Image("file:./res/blueimage4.png");
                ImageView blue = new ImageView("file:./res/blue.png");
                blue.setPreserveRatio(true);
                blue.setFitHeight(50);
                Button blueButton = new Button();
                blueButton.setGraphic(blue);
                blueButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(blueImage1);
                                image1.setImage(blueImage1);
                                image2.setImage(blueImage2);
                                image3.setImage(blueImage3);
                                image4.setImage(blueImage4);
                                colortext.setText("BLUE");
                        }
                });

                Image whiteImage1 = new Image("file:./res/whiteimage1.png");
                Image whiteImage2 = new Image("file:./res/whiteimage2.png");
                Image whiteImage3 = new Image("file:./res/whiteimage3.png");
                Image whiteImage4 = new Image("file:./res/whiteimage4.png");
                ImageView white = new ImageView("file:./res/white.png");
                white.setPreserveRatio(true);
                white.setFitHeight(50);
                Button whiteButton = new Button();
                whiteButton.setGraphic(white);
                whiteButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(whiteImage1);
                                image1.setImage(whiteImage1);
                                image2.setImage(whiteImage2);
                                image3.setImage(whiteImage3);
                                image4.setImage(whiteImage4);
                                colortext.setText("WHITE");
                        }
                });

                HBox colorsHBox = new HBox(10, blackButton, brownButton, blueButton, whiteButton);
                GridPane quantityinstockGridPane = new GridPane();
                Label instockLabel = new Label("IN STOCK");

                ImageView subtract = new ImageView("file:./res/subtract.png");
                subtract.setPreserveRatio(true);
                subtract.setFitHeight(50);
                Label quantity = new Label("0");
                ImageView plus = new ImageView("file:./res/plus.png");
                plus.setPreserveRatio(true);
                plus.setFitHeight(50);
                Button subtractbutton = new Button();
                subtractbutton.setGraphic(subtract);
                subtractbutton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                int quantityValue = Math.round(Integer.parseInt(quantity.getText()));
                                if (quantityValue > 0) {
                                        quantityValue--;
                                        quantity.setText(quantityValue + "");
                                }
                        }
                });
                Button plusbutton = new Button();
                plusbutton.setGraphic(plus);
                plusbutton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                int quantityValue = Math.round(Integer.parseInt(quantity.getText()));
                                quantityValue++;
                                quantity.setText(quantityValue + "");
                        }
                });
                ImageView addtobag = new ImageView("file:./res/addtobag.png");
                addtobag.setPreserveRatio(true);
                addtobag.setFitHeight(50);
                Button addtobagbutton = new Button();
                addtobagbutton.setGraphic(addtobag);
                addtobagbutton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                double total = Integer.parseInt(quantity.getText()) * 3.50;
                                cost.setText("$" + total + "0");
                                amountOfItems.setText(Integer.parseInt(quantity.getText()) + "");
                        }
                });

                HBox addsubtract = new HBox(10, subtractbutton, quantity, plusbutton);
                addsubtract.setAlignment(Pos.CENTER_LEFT);
                Label Wishlist = new Label("SAVE TO WISHLIST");
                ImageView heart = new ImageView("file:./res/heart.png");
                ImageView redheart = new ImageView("file:./res/redheart.png");
                heart.setPreserveRatio(true);
                heart.setFitHeight(30);
                redheart.setPreserveRatio(true);
                redheart.setFitHeight(30);
                Button heartbutton = new Button();
                heartbutton.setGraphic(heart);
                heartbutton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                heartbutton.setGraphic(redheart);
                        }
                });

                HBox saveto = new HBox(5, heartbutton, Wishlist);
                saveto.setAlignment(Pos.CENTER_LEFT);

                quantityinstockGridPane.add(rating, 0, 0);
                quantityinstockGridPane.add(price, 0, 1);
                quantityinstockGridPane.add(savings, 0, 2);
                quantityinstockGridPane.add(rrp, 0, 3);
                quantityinstockGridPane.add(colorsHBox, 0, 4);
                quantityinstockGridPane.add(colortext, 0, 5);
                quantityinstockGridPane.add(instockLabel, 1, 5);
                quantityinstockGridPane.add(addsubtract, 0, 6);
                quantityinstockGridPane.add(addtobagbutton, 1, 6);
                quantityinstockGridPane.add(saveto, 0, 7);
                quantityinstockGridPane.setHgap(50);
                quantityinstockGridPane.setVgap(15);

                VBox itemRight = new VBox(ItemName, Reward, quantityinstockGridPane, treeView);
                itemRight.setPadding(new Insets(42, 1, 1, 1));

                HBox itemPage = new HBox(60, itemLeft, itemRight);

                itemPage.setPadding(new Insets(15, 10, 10, 10));
                itemPage.setAlignment(Pos.CENTER);

                VBox itemPageParent = new VBox(itemPage);
                itemPageParent.setAlignment(Pos.CENTER);

                VBox TopVBox = new VBox(PinkBanner, menuHBox, GrayBanner, OrnamentBanner);
                TopBorderPane.setTop(TopVBox);
                TopBorderPane.setCenter(itemPageParent);
                ScrollPane scrollPane = new ScrollPane();
                scrollPane.setContent(TopBorderPane);

                Scene myScene = new Scene(scrollPane, 1300, 500);
                myScene.getStylesheets().add(getClass().getResource("mystyles.css").toExternalForm());
                amountOfItems.setId("costtext");
                cost.setId("costtext");
                pinkText.setId("cybertext");
                CYBERMONDAYISHERE.setId("cyberMondaytext");
                UPTO.setId("uptext");
                OFF.setId("Everythingtext");
                EVERYTHING.setId("Everythingtext");
                PLUS.setId("plustext");
                image1LargeHbox.setId("imageborder");
                image1HBox.setId("smallerimageborder");
                image2HBox.setId("smallerimageborder");
                image3HBox.setId("smallerimageborder");
                image4HBox.setId("smallerimageborder");
                ItemName.setId("Itemtext");
                Reward.setId("Rewardstext");
                price.setId("priceText");
                savings.setId("savingstext");
                rrp.setId("rrptext");
                quantity.setId("rrptext");
                instockLabel.setId("rrptext");
                colortext.setId("rrptext");
                Wishlist.setId("rrptext");
                directory.setId("rrptext");
                heartbutton.setId("heartbutton");
                subtractbutton.setId("whitebutton");
                plusbutton.setId("whitebutton");
                addtobagbutton.setId("whitebutton");
                blackButton.setId("circlebutton");
                brownButton.setId("circlebutton");
                blueButton.setId("circlebutton");
                whiteButton.setId("circlebutton");

                primaryStage.setScene(myScene);
                primaryStage.show();
        }

        public static void main(String[] args) {
                launch();
        }
}
