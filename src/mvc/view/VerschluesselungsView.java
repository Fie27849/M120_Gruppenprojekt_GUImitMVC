package mvc.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import mvc.controller.VerschluesselungController;

public class VerschluesselungsView extends view {
	
	public VerschluesselungsView(String linktofxml, String Title) {
		super(linktofxml, Title);
	}

	public void setCode(String codeText, TextArea outputCode){
		outputCode.setText(codeText);
	}
	
	public void setDecode(String decodeText,TextArea outputDecode){
		outputDecode.setText(decodeText);
	}
	
}
