package mvc.view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dreiDPunkteView extends view
{	
	/**
	 * Ruft Konstrucktor von Superklase auf (Ist dafür zuständig das die Window geöffnet wird)
	 * @param linktofxml
	 * @param Title
	 */
	public dreiDPunkteView(String linktofxml, String Title) {
		super(linktofxml, Title);
	}

	/**
	 * Befüllt die Ausgabe Textfelder anhand der übergebenen parameter
	 * @param flaeche
	 * @param gamma
	 * @param a
	 * @param b
	 * @param c
	 * @param output
	 * @param gammaout
	 * @param aout
	 * @param bout
	 * @param cout
	 */
	public void setflaeche(Double flaeche, Double gamma, Double a, Double b, Double c, TextField output, TextField gammaout, TextField aout, TextField bout, TextField cout)
	{
		gamma = gamma * 180 / Math.PI;
		output.setText(flaeche.toString());
		gammaout.setText(gamma.toString());
		aout.setText(a.toString());
		bout.setText(b.toString());
		cout.setText(c.toString());
	}
	
}
