package mvc.view;

import java.util.Scanner;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mvc.controller.BenzinRechnerController;

public class BenzinRechnerView extends view{
	
	public BenzinRechnerView(String linktofxml, String Title) {
		super(linktofxml, Title);
	}
	
	// Ausgabe des Resultats im Textfeld
	public void ausgabe(String Text, String Text2, Double result, TextArea output_result){
		
		output_result.appendText(Text);
		output_result.appendText(result.toString());
		output_result.appendText(Text2);
		output_result.appendText("\n");
		
	}

	
}