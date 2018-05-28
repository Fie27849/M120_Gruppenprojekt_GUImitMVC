package mvc.view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dreiDPunkteView extends view
{
	public dreiDPunkteView(String linktofxml, String Title) {
		super(linktofxml, Title);
	}

	public void setflaeche(Double flaeche, TextField output)
	{
		output.setText(flaeche.toString());
	}
	
}
