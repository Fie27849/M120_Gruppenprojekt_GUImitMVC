package mvc.template;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controller_home {

	@FXML
	private Button output;
	@FXML
	private Button page;
	@FXML
	private TextField textfield;

	private model mymodel = new model("Home");
	private view myView = new view("page.fxml", "Page");

	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {
		switch (((Node) event.getSource()).getId()) {
		case "output":
			this.myView.changeText(textfield, this.mymodel.getName());
			break;
		case "page":
			this.myView.changeScene(event);
			break;

		default:
			break;
		}
	}
}