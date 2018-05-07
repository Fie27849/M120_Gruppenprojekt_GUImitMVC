package mvc.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import mvc.controller.Controller;

public class VerschluesselungsView {
	
	Controller controller = new Controller();

	public VerschluesselungsView() {
		
try {
			
			Parent root = FXMLLoader.load(getClass().getResource("textverschlüsselung.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			
			TextArea textInput = (TextArea) root.lookup("#textInput");
			TextArea textOutput = (TextArea) root.lookup("#textOutput");
			Button translateButton = (Button) root.lookup("#translateButton");
			Button translateButton2 = (Button) root.lookup("#translateButton2");
			
			
			translateButton.setOnAction((event) -> this.translateInput(textInput, textOutput));
				
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void translateInput(TextArea textInput, TextArea textOutput) {
		String output = controller.translateText(textInput.getText());
		textOutput.setText(output);
	}
}
