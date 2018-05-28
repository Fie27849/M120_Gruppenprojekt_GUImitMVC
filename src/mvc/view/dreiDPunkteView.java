package mvc.view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dreiDPunkteView extends view
{
	public dreiDPunkteView(String linktofxml, String Title) {
		super(linktofxml, Title);
	}

	public void setflaeche(Double flaeche, Double gamma, Double a, Double b, Double c, TextField output, TextField gammaout, TextField aout, TextField bout, TextField cout)
	{
		output.setText(flaeche.toString());
		gammaout.setText(gamma.toString());
		aout.setText(a.toString());
		bout.setText(b.toString());
		cout.setText(c.toString());
	}
	
}
