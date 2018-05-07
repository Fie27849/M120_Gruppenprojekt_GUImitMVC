package mvc.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mvc.controller.Controller;

public class BenzinRechnerView extends view{
	
	public BenzinRechnerView(String linktofxml, String Title) {
		super(linktofxml, Title);
		// TODO Auto-generated constructor stub
	}


	Controller controller = new Controller();
	
	
	public double kmMitTankVoll(){
		double kmMitTankVoll;
		
		kmMitTankVoll = 0.5;
		
		return kmMitTankVoll;
	}
	
	
	public void ausgabe(double result){
		System.out.println("Das Ergebnis ist: " + result);
	}

	
}
