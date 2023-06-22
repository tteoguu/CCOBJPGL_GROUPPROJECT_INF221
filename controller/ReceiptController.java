package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ReceiptController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8;

    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount, 
           item5Amount, item6Amount, item7Amount, item8Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, 
          name1, name2, name3, name4, name5, name6, name7, name8, 
          lineAmount1, lineAmount2, lineAmount3, lineAmount4, 
          lineAmount5, lineAmount6, lineAmount7, lineAmount8, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (LoginController.cfairy.getProductStatus()) {
            name1.setText(LoginController.cfairy.getProductName());
            qty1.setText(Double.toString(LoginController.cfairy.getProductQuantity()));
            lineAmount1.setText(Double.toString(LoginController.cfairy.getProductPrice() * LoginController.cfairy.getProductQuantity()));

            name1.setVisible(true);
            qty1.setVisible(true);
            lineAmount1.setVisible(true);

            item1Amount = LoginController.cfairy.getProductPrice() * LoginController.cfairy.getProductQuantity();
             
            
        }

        if (LoginController.tpolo.getProductStatus()) {
            name2.setText(LoginController.tpolo.getProductName());
            qty2.setText(Double.toString(LoginController.tpolo.getProductQuantity()));
            lineAmount2.setText(Double.toString(LoginController.tpolo.getProductPrice() * LoginController.tpolo.getProductQuantity()));
            
            name2.setVisible(true);
            qty2.setVisible(true);
            lineAmount2.setVisible(true);
            
            item2Amount = LoginController.tpolo.getProductPrice() * LoginController.tpolo.getProductQuantity();
             

        }

        if (LoginController.Intothe90s.getProductStatus()) {
            name3.setText(LoginController.Intothe90s.getProductName());
            qty3.setText(Double.toString(LoginController.Intothe90s.getProductQuantity()));
            lineAmount3.setText(Double.toString(LoginController.Intothe90s.getProductPrice() * LoginController.Intothe90s.getProductQuantity()));

            name3.setVisible(true);
            qty3.setVisible(true);
            lineAmount3.setVisible(true);

            item3Amount = LoginController.Intothe90s.getProductPrice() * LoginController.Intothe90s.getProductQuantity();
             

        }

        if (LoginController.lv.getProductStatus()) {
            name4.setText(LoginController.lv.getProductName());
            qty4.setText(Double.toString(LoginController.lv.getProductQuantity()));
            lineAmount4.setText(Double.toString(LoginController.lv.getProductPrice() * LoginController.lv.getProductQuantity()));

            name4.setVisible(true);
            qty4.setVisible(true);
            lineAmount4.setVisible(true);

            item4Amount = LoginController.lv.getProductPrice() * LoginController.lv.getProductQuantity();
             

        }

         if (LoginController.chicRacer.getProductStatus()) {
            name5.setText(LoginController.chicRacer.getProductName());
            qty5.setText(Double.toString(LoginController.chicRacer.getProductQuantity()));
            lineAmount5.setText(Double.toString(LoginController.chicRacer.getProductPrice() * LoginController.chicRacer.getProductQuantity()));

            name5.setVisible(true);
            qty5.setVisible(true);
            lineAmount5.setVisible(true);

            item5Amount = LoginController.chicRacer.getProductPrice() * LoginController.chicRacer.getProductQuantity();
             

        }

        if (LoginController.vintageReverie.getProductStatus()) {
            name6.setText(LoginController.vintageReverie.getProductName());
            qty6.setText(Double.toString(LoginController.vintageReverie.getProductQuantity()));
            lineAmount6.setText(Double.toString(LoginController.vintageReverie.getProductPrice() * LoginController.vintageReverie.getProductQuantity()));

            name6.setVisible(true);
            qty6.setVisible(true);
            lineAmount6.setVisible(true);

            item6Amount = LoginController.vintageReverie.getProductPrice() * LoginController.vintageReverie.getProductQuantity();
             

        }

        if (LoginController.styleArt.getProductStatus()) {
            name7.setText(LoginController.styleArt.getProductName());
            qty7.setText(Double.toString(LoginController.styleArt.getProductQuantity()));
            lineAmount7.setText(Double.toString(LoginController.styleArt.getProductPrice() * LoginController.styleArt.getProductQuantity()));

            name7.setVisible(true);
            qty7.setVisible(true);
            lineAmount7.setVisible(true);

            item7Amount = LoginController.styleArt.getProductPrice() * LoginController.styleArt.getProductQuantity();
             
            
        }

        if (LoginController.pandaStar.getProductStatus()) {
            name8.setText(LoginController.pandaStar.getProductName());
            qty8.setText(Double.toString(LoginController.pandaStar.getProductQuantity()));
            lineAmount8.setText(Double.toString(LoginController.pandaStar.getProductPrice() * LoginController.pandaStar.getProductQuantity()));

            name8.setVisible(true);
            qty8.setVisible(true);
            lineAmount8.setVisible(true);

            item8Amount = LoginController.pandaStar.getProductPrice() * LoginController.pandaStar.getProductQuantity();
             
            
        }

        double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount 
        + item8Amount;

        System.out.println(total);
        if (total != null) {
            total.setText(Double.toString(final_amount));
        }
         
    }


    public void gotoLogin(ActionEvent event) throws IOException {

        // Alert when user presses Logout button
        LoginManager.setLoggedIn(false);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You have been logged out.");
        alert.showAndWait();

        // Redirects to Login.fxml
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
}
