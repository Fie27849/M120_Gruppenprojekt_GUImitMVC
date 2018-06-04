package mvc.view;

import javafx.scene.control.TextArea;

public class VerschluesselungsView extends view {
	
	public VerschluesselungsView(String linktofxml, String Title) {
		super(linktofxml, Title);
	}

	public void setCode(String codeText, TextArea outputCode){
		outputCode.setText("");
		outputCode.setText(codeText);
	}
	
	public void setDecode(String decodeText,TextArea outputDecode){
		outputDecode.setText("");
		outputDecode.setText(decodeText);
	}
	
	public void setClear(TextArea textInput, TextArea outputCode, TextArea outputDecode, TextArea textDecodeInput, TextArea codeword){
		textInput.setText("");
		outputCode.setText("");
		outputDecode.setText("");
		textDecodeInput.setText("");
		codeword.setText("");
	}
	
}
