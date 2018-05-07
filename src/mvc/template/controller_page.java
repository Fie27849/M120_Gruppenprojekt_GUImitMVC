package mvc.template;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controller_page {

	@FXML
	private Button output;
	@FXML
	private Button home;
	@FXML
	private TextField textfield;

	private model mymodel = new model("Page");
	private view myView = new view("home.fxml", "Home");

	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {
		switch (((Node) event.getSource()).getId()) {
		case "output":
			this.myView.changeText(textfield, this.mymodel.getName());
			break;
		case "home":
			this.myView.changeScene(event);
			break;

		default:
			break;
		}
	}
}