package mvc.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mvc.controller.Controller;

public class BenzinRechnerView {
	
	Controller controller = new Controller();
		
	public BenzinRechnerView(Stage BenzinRechnerStage) {
		try {
			
			// prepare the scene
			Parent root = FXMLLoader.load(getClass().getResource("benzinrechner.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			BenzinRechnerStage.setScene(scene);
			BenzinRechnerStage.show();
		
			
			// TextFields
			TextField input_verbrauch = (TextField)root.lookup("#input_verbrauch");
			TextField input_tankTotal = (TextField)root.lookup("#input_tankTotal");
			TextField input_kmSeitTanken = (TextField)root.lookup("#input_kmSeitTanken");
			TextField input_kmGeplant = (TextField)root.lookup("#input_kmGeplant");
			// Buttons
			Button btn_kmMitTankVoll = (Button) root.lookup("#btn_kmMitTankVoll");
			Button btn_kmMitLiterAktuell = (Button) root.lookup("#btn_kmMitLiterAktuell");
			Button btn_literTankenFuerGeplant = (Button) root.lookup("#btn_literTankenFuerGeplant");
			Button btn_anzKmGeplant = (Button) root.lookup("#btn_anzKmGeplant");
			Button btn_literAktuell = (Button) root.lookup("#btn_literAktuell");
			// TextAreas
			TextArea output_result = (TextArea) root.lookup("#output_result");
			
			
			
			
			
			
				
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// set the text for the output
	
}
