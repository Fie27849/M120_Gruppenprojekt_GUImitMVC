package mvc.template;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * Template wird nicht gestartet
 * @author Denis
 *
 */
public class view {

	private String linktofxml;
	private String Title;

	public view(String linktofxml, String Title) {
		this.linktofxml = linktofxml;
		this.Title = Title;
	}

	public void changeScene(ActionEvent event) throws IOException {
		Parent MyView = FXMLLoader.load(main.class.getResource(this.linktofxml));
		Scene MyScene = new Scene(MyView);
		Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());
		window.setScene(MyScene);
		window.setTitle(this.Title);
		window.show();
	}

	public void changeText(TextField field, String text) {
		field.setText(text);
	}
}
