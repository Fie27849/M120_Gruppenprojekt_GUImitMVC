package mvc.view;

import javafx.scene.control.Button;

public class TicTacToeView extends view {

	public TicTacToeView (String linktofxml, String Title) {
		super(linktofxml, Title);
	}
	
	public void draw_field(Button a1, Button a2, Button a3, Button b1, Button b2, Button b3, Button c1, Button c2, Button c3, String[][] field) {
		
	}
	
	public void setButtonText(Button btn, String text) {
		btn.setText(text);
	}

}
