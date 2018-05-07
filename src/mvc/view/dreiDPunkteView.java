package mvc.view;

import javafx.scene.control.Label;

public class dreiDPunkteView extends view
{
	public dreiDPunkteView(String linktofxml, String Title) {
		super(linktofxml, Title);
	}

	public void setflaeche(Double flaeche, Label output)
	{
		output.setText(flaeche.toString());
	}
	
}
