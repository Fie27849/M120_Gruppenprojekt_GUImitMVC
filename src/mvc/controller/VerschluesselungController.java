package mvc.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import mvc.model.TextVerschluesseln;
import mvc.view.VerschluesselungsView;

public class VerschluesselungController extends MainController {
	
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
	//private VerschluesselungsView view = new VerschluesselungsView("textverschluesselung.fxml","Textverschlüsselung");

	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {
		switch (((Node) event.getSource()).getId()) {
		case "codieren":
			String code = codeword.getText();
			if(code.length() == 0){
				this.verschluesselungsView.setCode(this.model.verschluesseln(textInput.getText(), "code"), outputCode);
			}else{
				this.verschluesselungsView.setCode(this.model.verschluesseln(textInput.getText(), codeword.getText()), outputCode);
			}
			break;
		case "decodieren":
			String decode = codeword.getText();
			if(decode.length() == 0){
				this.verschluesselungsView.setDecode(this.model.decoder(textDecodeInput.getText(), "code"), outputDecode);
			}else{
				this.verschluesselungsView.setDecode(this.model.decoder(textDecodeInput.getText(), codeword.getText()), outputDecode);
			}
			break;
		case "clear":
			this.verschluesselungsView.setClear(textInput, outputCode, outputDecode, textDecodeInput, codeword);
			break;
		default:
			break;
		}
	}
	@FXML
	public void handleMenuClick(ActionEvent event) throws IOException {
		super.handleMenuClick(event);
	}
}
