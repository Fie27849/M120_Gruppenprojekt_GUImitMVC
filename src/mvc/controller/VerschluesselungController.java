package mvc.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import mvc.model.TextVerschluesseln;
import mvc.view.VerschluesselungsView;

public class VerschluesselungController {
	
	@FXML
	private Button codieren;
	@FXML
	private Button decodieren;
	@FXML
	private TextArea textInput;
	@FXML
	private TextArea outputCode;
	@FXML
	private TextArea outputDecode;
	@FXML
	private TextArea textDecodeInput;
	@FXML
	private TextArea codeword;

	private TextVerschluesseln model = new TextVerschluesseln();
	private VerschluesselungsView view = new VerschluesselungsView("textverschluesselung.fxml","Textverschlüsselung");

	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {
		switch (((Node) event.getSource()).getId()) {
		case "codieren":
			this.view.setCode(this.model.verschluesseln(textInput.getText(), codeword.getText()), outputCode);
			break;
		case "decodieren":
			this.view.setDecode(this.model.decoder(textDecodeInput.getText(), codeword.getText()), outputDecode);
			break;

		default:
			break;
		}
	}
	@FXML
	public void handleMenuClick() {
		
	}
}
