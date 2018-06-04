package mvc.template;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Template wird nicht gestartet
 * @author Denis
 *
 */
public class main extends Application {


	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(main.class.getResource("home.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Home");
        primaryStage.show();

	}

}

