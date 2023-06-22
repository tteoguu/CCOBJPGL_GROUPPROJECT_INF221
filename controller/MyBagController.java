package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyBagController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8;

    @FXML
    VBox vbox1;

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, price1, price2, price3, price4, price5, price6, price7, price8, total;

    @FXML
    ImageView pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8;

    @FXML
    private ChoiceBox<String> quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, quantity7, quantity8;

    private String[] quantity = { "1", "2", "3" };

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(LoginController.cfairy.getProductName());
        price1.setText(Double.toString(LoginController.cfairy.getProductPrice()));
        Image cottonFairy = new Image(LoginController.cfairy.getProductImage());
        pic1.setImage(cottonFairy);

        name2.setText(LoginController.tpolo.getProductName());
        price2.setText(Double.toString(LoginController.tpolo.getProductPrice()));
        Image thePolo = new Image(LoginController.tpolo.getProductImage());
        pic2.setImage(thePolo);

        name3.setText(LoginController.Intothe90s.getProductName());
        price3.setText(Double.toString(LoginController.Intothe90s.getProductPrice()));
        Image intothe90s = new Image(LoginController.Intothe90s.getProductImage());
        pic3.setImage(intothe90s);

        name4.setText(LoginController.lv.getProductName());
        price4.setText(Double.toString(LoginController.lv.getProductPrice()));
        Image Lv = new Image(LoginController.lv.getProductImage());
        pic4.setImage(Lv);

        name5.setText(LoginController.chicRacer.getProductName());
        price5.setText(Double.toString(LoginController.chicRacer.getProductPrice()));
        Image Chicracer = new Image(LoginController.chicRacer.getProductImage());
        pic5.setImage(Chicracer);

        name6.setText(LoginController.vintageReverie.getProductName());
        price6.setText(Double.toString(LoginController.vintageReverie.getProductPrice()));
        Image Vintagereverie = new Image(LoginController.vintageReverie.getProductImage());
        pic6.setImage(Vintagereverie);

        name7.setText(LoginController.styleArt.getProductName());
        price7.setText(Double.toString(LoginController.styleArt.getProductPrice()));
        Image Styleart = new Image(LoginController.styleArt.getProductImage());
        pic7.setImage(Styleart);

        name8.setText(LoginController.pandaStar.getProductName());
        price8.setText(Double.toString(LoginController.pandaStar.getProductPrice()));
        Image Pandastar = new Image(LoginController.pandaStar.getProductImage());
        pic8.setImage(Pandastar);

        // Set default quantities in choicebox to 1
        quantity1.setValue("1");
        quantity2.setValue("1");
        quantity3.setValue("1");
        quantity4.setValue("1");
        quantity5.setValue("1");
        quantity6.setValue("1");
        quantity7.setValue("1");
        quantity8.setValue("1");

        // Insert quantity array to choicebox
        quantity1.getItems().addAll(quantity);
        quantity2.getItems().addAll(quantity);
        quantity3.getItems().addAll(quantity);
        quantity4.getItems().addAll(quantity);
        quantity5.getItems().addAll(quantity);
        quantity6.getItems().addAll(quantity);
        quantity7.getItems().addAll(quantity);
        quantity8.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        quantity1.setOnAction(this::computeTotal);
        quantity2.setOnAction(this::computeTotal);
        quantity3.setOnAction(this::computeTotal);
        quantity4.setOnAction(this::computeTotal);
        quantity5.setOnAction(this::computeTotal);
        quantity6.setOnAction(this::computeTotal);
        quantity7.setOnAction(this::computeTotal);
        quantity8.setOnAction(this::computeTotal);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (LoginController.cfairy.getProductStatus()) {

            double qty = Double.parseDouble(quantity1.getValue());
            LoginController.cfairy.setProductQuantity(qty);
            item1Amount = LoginController.cfairy.getProductPrice() * qty;

            if (source == quantity1) {
                item1Amount = LoginController.cfairy.getProductPrice() * qty;
            }
        }

        if (LoginController.tpolo.getProductStatus()) {

            double qty = Double.parseDouble(quantity2.getValue());
            LoginController.tpolo.setProductQuantity(qty);
            item2Amount = LoginController.tpolo.getProductPrice() * qty;

            if (source == quantity2) {
                item2Amount = LoginController.tpolo.getProductPrice() * qty;
            }
        }

        if (LoginController.Intothe90s.getProductStatus()) {

            double qty = Double.parseDouble(quantity3.getValue());
            LoginController.Intothe90s.setProductQuantity(qty);
            item3Amount = LoginController.Intothe90s.getProductPrice() * qty;

            if (source == quantity3) {
                item3Amount = LoginController.Intothe90s.getProductPrice() * qty;
            }
        }

        if (LoginController.lv.getProductStatus()) {

            double qty = Double.parseDouble(quantity4.getValue());
            LoginController.lv.setProductQuantity(qty);
            item4Amount = LoginController.lv.getProductPrice() * qty;

            if (source == quantity4) {
                item4Amount = LoginController.lv.getProductPrice() * qty;
            }
        }

        if (LoginController.chicRacer.getProductStatus()) {

            double qty = Double.parseDouble(quantity5.getValue());
            LoginController.chicRacer.setProductQuantity(qty);
            item5Amount = LoginController.chicRacer.getProductPrice() * qty;

            if (source == quantity5) {
                item5Amount = LoginController.chicRacer.getProductPrice() * qty;
            }
        }

        if (LoginController.vintageReverie.getProductStatus()) {

            double qty = Double.parseDouble(quantity6.getValue());
            LoginController.vintageReverie.setProductQuantity(qty);
            item6Amount = LoginController.vintageReverie.getProductPrice() * qty;

            if (source == quantity6) {
                item6Amount = LoginController.vintageReverie.getProductPrice() * qty;
            }
        }

        if (LoginController.styleArt.getProductStatus()) {

            double qty = Double.parseDouble(quantity7.getValue());
            LoginController.styleArt.setProductQuantity(qty);
            item7Amount = LoginController.styleArt.getProductPrice() * qty;

            if (source == quantity7) {
                item7Amount = LoginController.styleArt.getProductPrice() * qty;
            }
        }

        if (LoginController.pandaStar.getProductStatus()) {

            double qty = Double.parseDouble(quantity8.getValue());
            LoginController.pandaStar.setProductQuantity(qty);
            item8Amount = LoginController.pandaStar.getProductPrice() * qty;

            if (source == quantity8) {
                item8Amount = LoginController.pandaStar.getProductPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    public void getInitialAmount() {

        double totalAmount = 0.00;

        if (LoginController.cfairy.getProductStatus()) {
            totalAmount += LoginController.cfairy.getProductPrice();
        }

        if (LoginController.tpolo.getProductStatus()) {
            totalAmount += LoginController.tpolo.getProductPrice();
        }

        if (LoginController.Intothe90s.getProductStatus()) {
            totalAmount += LoginController.Intothe90s.getProductPrice();
        }

        if (LoginController.lv.getProductStatus()) {
            totalAmount += LoginController.lv.getProductPrice();
        }

        if (LoginController.chicRacer.getProductStatus()) {
            totalAmount += LoginController.chicRacer.getProductPrice();
        }

        if (LoginController.vintageReverie.getProductStatus()) {
            totalAmount += LoginController.vintageReverie.getProductPrice();
        }

        if (LoginController.styleArt.getProductStatus()) {
            totalAmount += LoginController.styleArt.getProductPrice();
        }

        if (LoginController.pandaStar.getProductStatus()) {
            totalAmount += LoginController.pandaStar.getProductPrice();
        }


        System.out.println(total);

        if (total != null) {
            total.setText(Double.toString(totalAmount));
        }

        
    }

    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            vbox1.getChildren().add(p);
        }
    }

   public void gotoReceipt(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        Parent root = loader.load();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);
        scrollPane.setPrefSize(428, 705);
        scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        Scene scene = new Scene(scrollPane);        
        stage.setScene(scene);
        stage.show();
   }

}
