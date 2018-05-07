package mvc.view;

import javafx.scene.control.TextArea;

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
