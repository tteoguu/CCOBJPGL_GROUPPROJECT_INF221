package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OuterController implements Initializable{

    @FXML
    Button addtoBag1, addtoBag2;

    @FXML
    Label name1, name2, price1, price2;

    @FXML
    FXMLLoader loader;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent root = null;

    @FXML
    static MyBagController myBagController = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== Style Art ==================//
        name1.setText(LoginController.styleArt.getProductName());
        price1.setText(Double.toString(LoginController.styleArt.getProductPrice()));

        // ============== Panda Star ==================//

        name2.setText(LoginController.pandaStar.getProductName());
        price2.setText(Double.toString(LoginController.pandaStar.getProductPrice()));
    }

    public void addtoBag(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("Hiraya - Style with a Purpose", "Item added to cart!");

        Button sourceButton = (Button) event.getSource();

        // If addtoBag button is pressed, set product status to true
        if (sourceButton.equals(addtoBag1)) {
            LoginController.styleArt.setProductStatus(true);
            LoginController.styleArt.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myBagController.pane7);
        }

        else if (sourceButton == addtoBag2) {
            LoginController.pandaStar.setProductStatus(true);
            LoginController.pandaStar.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.myBagController.pane8);
        }

        LoginController.cart.showItems();
    }

    public void gotoMyBag1(ActionEvent event) throws IOException {

        // Load items to cart before switching to checkout page
        LoginController.myBagController.showItems(LoginController.cart.getItemList());

        // Set initial total amount in My Bag page
        LoginController.myBagController.getInitialAmount();

        Scene scene = new Scene(LoginController.cartroot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void gotoTops(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Tops.fxml"));
        Parent root = loader.load();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);
        scrollPane.setPrefSize(610, 768);
        scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        Scene scene = new Scene(scrollPane);        
        stage.setScene(scene);
        stage.show();
    }

    public void gotoBottoms(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Bottoms.fxml"));
        Parent root = loader.load();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);
        scrollPane.setPrefSize(610, 768);
        scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        Scene scene = new Scene(scrollPane);        
        stage.setScene(scene);
        stage.show();
    }

    public void gotoDresses(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Outer.fxml"));
        Parent root = loader.load();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);
        scrollPane.setPrefSize(610, 768);
        scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        Scene scene = new Scene(scrollPane);        
        stage.setScene(scene);
        stage.show();
    }

    public void gotoDonationBar(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Donation.fxml"));
        Parent root = loader.load();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);
        scrollPane.setPrefSize(610, 768);
        scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        Scene scene = new Scene(scrollPane);        
        stage.setScene(scene);
        stage.show();
    }

    public void gotoHome(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
        Parent root = loader.load();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(root);
        scrollPane.setPrefSize(610, 768);
        scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        Scene scene = new Scene(scrollPane);        
        stage.setScene(scene);
        stage.show();
    }
}
