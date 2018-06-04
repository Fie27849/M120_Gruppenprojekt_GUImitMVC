package mvc.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import mvc.view.home;

/**
 * wird nur gebraucht um die Applikation zu starten
 * @author Denis
 *
 */
public class main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		home homeview = new home("../view/home.fxml", "Home");
		homeview.changeScene(primaryStage);		
	}

}
