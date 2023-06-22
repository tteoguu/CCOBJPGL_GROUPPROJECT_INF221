package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;

public class LoginController implements Initializable {

    @FXML
    TextField user1;

    @FXML
    PasswordField pass1;

    @FXML
    Button loginButton, aboutUsButton;

    @FXML
    Label warning1;

    FXMLLoader cartloader;

    @FXML
    static Parent cartroot = null;

    @FXML
    static HomeController homeController = null;

    @FXML
    static AboutController aboutController = null;

    @FXML
    static MyBagController myBagController = null;

    static Cart cart = new Cart();

    //Tops
    static CottonFairy cfairy = new CottonFairy();
    static ThePolo tpolo = new ThePolo();
    //Bottoms
    static IntoTheNineties Intothe90s = new IntoTheNineties();
    static LV lv = new LV();
    //Dresses
    static ChicRacer chicRacer = new ChicRacer();
    static VintageReverie vintageReverie = new VintageReverie();
    //Outer
    static StyleArt styleArt = new StyleArt();
    static PandaStar pandaStar = new PandaStar();

    public void initialize(URL location, ResourceBundle resources){

        // ============== Cotton Fairy ==================//
        cfairy.setProductName("Cotton Fairy");
        cfairy.setProductPrice(599.00);
        cfairy.setProductImage("images/MyBag-Images/MyBag-CottonFairy.png");

        // ============== The Polo ==================//
        tpolo.setProductName("The Polo");
        tpolo.setProductPrice(850.00);
        tpolo.setProductImage("images/MyBag-Images/MyBag-ThePolo.png");

        // ============== Into The 90's ==================//
        Intothe90s.setProductName("Into The 90's");
        Intothe90s.setProductPrice(1899.00);
        Intothe90s.setProductImage("images/MyBag-Images/MyBag-IntoThe90s.png");

        // ============== LV ==================//
        lv.setProductName("LV");
        lv.setProductPrice(1600.00);
        lv.setProductImage("images/MyBag-Images/MyBag-LV.png");

        // ============== Chic Racer ==================//
        chicRacer.setProductName("Chic Racer");
        chicRacer.setProductPrice(1200.00);
        chicRacer.setProductImage("images/MyBag-Images/MyBag-ChicRacer.png");

        // ============== Vintage Reverie ==================//
        vintageReverie.setProductName("Vintage Reverie");
        vintageReverie.setProductPrice(1500.00);
        vintageReverie.setProductImage("images/MyBag-Images/MyBag-VintageReverie.png");

        // ============== Style Art ==================//
        styleArt.setProductName("Style Art");
        styleArt.setProductPrice(1799.00);
        styleArt.setProductImage("images/MyBag-Images/MyBag-StyleArt.png");

        // ============== Panda Star ==================//
        pandaStar.setProductName("Panda Star");
        pandaStar.setProductPrice(1499.00);
        pandaStar.setProductImage("images/MyBag-Images/MyBag-PandaStar.png");

        try {
            cartloader = new FXMLLoader(getClass().getResource("/view/MyBag.fxml"));
            cartroot = cartloader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
        myBagController = cartloader.getController();
        myBagController.vbox1.getChildren().removeAll(myBagController.vbox1.getChildren());

    }

    public void gotoAboutUs(ActionEvent event) throws IOException {

        //Goes to About.fxml
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/About.fxml"));
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

        String username = user1.getText();
        String password = pass1.getText();
        

        if (username.equals("a") && password.equals("a")) {

            // Checks if the user is logged in, if true, proceeds to Home.fxml
            LoginManager.setLoggedIn(true);
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
            warning1.setVisible(true);
        }
    }

    

}
    


