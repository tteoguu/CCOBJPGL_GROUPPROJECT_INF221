import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage stage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(root);
            scrollPane.setPrefSize(610, 768);
            scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
            scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
            Scene scene = new Scene(scrollPane);
            // Disables resizing of window
            Image icon = new Image("Logomark-Black.png"); //application icon
			stage.getIcons().add(icon);
			stage.setTitle("HIRAYA CLOTHING LINE");
            stage.setResizable(true);
            stage.setScene(scene);

            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}