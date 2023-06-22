package controller;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.stage.Stage;

import java.net.URL;

public class DonationController implements Initializable {

    @FXML 
    private ProgressBar progressBar;
    static double totalQuantityPurchased = 0;
    static final double MAX_QUANTITY = 10; // Maximum quantity

    @Override
    public void initialize(URL location, ResourceBundle resources) { 

        totalQuantityPurchased = LoginController.cfairy.getProductQuantity()
        + LoginController.tpolo.getProductQuantity()
        + LoginController.Intothe90s.getProductQuantity()
        + LoginController.lv.getProductQuantity()
        + LoginController.chicRacer.getProductQuantity()
        + LoginController.vintageReverie.getProductQuantity()
        + LoginController.styleArt.getProductQuantity()
        + LoginController.pandaStar.getProductQuantity();

        double progress = totalQuantityPurchased / MAX_QUANTITY;
        progressBar.setProgress(progress);

        // Calculate the remaining quantity to reach the maximum
        int remainingQuantity = (int) (MAX_QUANTITY - totalQuantityPurchased);


        // Shows an alert which will remind the user how many purchases he/she is away from making a donation
        if (remainingQuantity > 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Donation Reminder");
            alert.setHeaderText("You are " + remainingQuantity + " purchases away from making a donation!");
            alert.showAndWait();

        // Shows an alert when a user have successfully purchased more than 10 products
        } else if (totalQuantityPurchased >= MAX_QUANTITY) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Donation Success");
            alert.setHeaderText("Thank you for purchasing 10 products! You have successfully made a donation!");
            alert.showAndWait();
        }

    }

    public void gotoLogin(ActionEvent event) throws IOException {

        // Checks if the user is logged in, if true, then redirects to Home.fxml
        if (LoginManager.isLoggedIn()){
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
        } else {
        // If not logged in, redirects to Login.fxml
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
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
    
    public void gotoHome(ActionEvent event) throws IOException {

        // Checks if the user is logged in, if true, then redirects to Home.fxml
        if (LoginManager.isLoggedIn()) {
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
        } else {
        // If not logged in, redirects to Login.fxml
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
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
}
