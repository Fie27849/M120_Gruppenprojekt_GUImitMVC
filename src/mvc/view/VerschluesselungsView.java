package mvc.view;

import javafx.scene.control.TextArea;

public class VerschluesselungsView extends view {
	
	/**
	 * Ruft Konstrucktor von Superklase auf (Ist dafür zuständig das die Window geöffnet wird)
	 */
	
	public VerschluesselungsView(String linktofxml, String Title) {
		super(linktofxml, Title);
	}
	
	//Der codierte Text, welcher vom model an den Controller übergeben wurde, wird nun an der View übergeben und abgezeigt
	public void setCode(String codeText, TextArea outputCode){
		outputCode.setText("");
		outputCode.setText(codeText);
	}
	
	//Der decodierte Text, welcher vom model an den Controller übergeben wurde, wird nun an der View übergeben und abgezeigt
	public void setDecode(String decodeText,TextArea outputDecode){
		outputDecode.setText("");
		outputDecode.setText(decodeText);
	}
	
	//Wenn der löschen Button gedrückt wird, werden alle Textfelder geleehrt
	public void setClear(TextArea textInput, TextArea outputCode, TextArea outputDecode, TextArea textDecodeInput, TextArea codeword){
		textInput.setText("");
		outputCode.setText("");
		outputDecode.setText("");
		textDecodeInput.setText("");
		codeword.setText("");
	}
	
}
