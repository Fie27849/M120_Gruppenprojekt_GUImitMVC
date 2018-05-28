package mvc.view;

import javafx.scene.control.Button;

public class TicTacToeView extends view {

	public TicTacToeView(String linktofxml, String Title) {
		super(linktofxml, Title);

	}

	public void draw_field(
			Button a1, Button a2, Button a3, 
			Button b1, Button b2, Button b3, 
			Button c1, Button c2, Button c3, 
			String[][] field) {
		setButtonText(a1, field[0][0]);
		setButtonText(a2, field[0][1]);
		setButtonText(a3, field[0][2]);
		setButtonText(b1, field[1][0]);
		setButtonText(b2, field[1][1]);
		setButtonText(b3, field[1][2]);
		setButtonText(c1, field[2][0]);
		setButtonText(c2, field[2][1]);
		setButtonText(c3, field[2][2]);

		System.out.println();
		System.out.print("- - - - - -");
		System.out.println();
	}

	public void setButtonText(Button btn, String text) {
		btn.setText(text);
	}

}
