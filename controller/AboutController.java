package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.stage.Stage;

public class AboutController{

     public void gotoDonationBar(ActionEvent event) throws IOException {
     
          // Checks if the user is logged in
          if (LoginManager.isLoggedIn()){
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
          } else {
          // Redirect back to the Login.fxml screen
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

          // Checks if the user is logged in
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
          // Redirect back to the Login.fxml screen
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

     public void gotoLogin(ActionEvent event) throws IOException {

          //Goes to Login.fxml screen
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
