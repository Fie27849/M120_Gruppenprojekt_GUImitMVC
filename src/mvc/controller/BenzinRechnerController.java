package mvc.controller;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mvc.model.BenzinRechner;
import mvc.view.BenzinRechnerView;


public class BenzinRechnerController extends MainController {

	// definieren der Eingabefelder und Buttons und des Ausgabefeldes
	@FXML
	private Button btn_kmMitTankVoll;
	@FXML
	private Button btn_kmMitLiterAktuell;
	@FXML
	private Button btn_literTankenFuerGeplant;
	@FXML
	private Button btn_anzTankenKmGeplant;
	@FXML
	private Button btn_leeren;
	@FXML
	private Button btn_literAktuell;
	@FXML
	private TextField input_verbrauch;
	@FXML
	private TextField input_tankTotal;
	@FXML
	private TextField input_kmSeitTanken;
	@FXML
	private TextField input_kmGeplant;
	@FXML
	private TextArea output_result;
	

	//dem Controller zeigen, wo er das Model findet
	private BenzinRechner BenzinRechnerModel = new BenzinRechner();
	//private BenzinRechnerView BenzinRechnerView = new BenzinRechnerView("benzinrechner.fxml", "Benzinrechner");

	
	// prüft, ob die Eingabe aus Zahlen besteht
	public boolean isNumeric(String str)
	{
		  try  
		  {  
		    double d = Double.parseDouble(str);  
		  }  
		  catch(NumberFormatException nfe)  
		  {  
		    return false;  
		  }  
		  return true;  
	}
	
	// Werte von input Feldern in Variabeln schreiben und Eingabefehler abfangen
	public void getValues(){
		if(!input_tankTotal.getText().isEmpty() && isNumeric(input_tankTotal.getText())){
			BenzinRechnerModel.tankGesamt = Double.parseDouble(input_tankTotal.getText());
		}else{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ACHTUNG !!!");
			alert.setHeaderText("Fehlerhafte Eingabe in Feld Tankvolumen:");
			alert.setContentText("Es dürfen nur Zahlen verwendet werden.\n\nFolgende Felder müssen ausgefüllt werden:\n– Tankvolumen\n– Verbrauch auf 100km");
			alert.showAndWait();
		}
		if(!input_verbrauch.getText().isEmpty() && isNumeric(input_verbrauch.getText())){
			BenzinRechnerModel.verbrauchPro100 = Double.parseDouble(input_verbrauch.getText());
		}else{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ACHTUNG !!!");
			alert.setHeaderText("Fehlerhafte Eingabe in Feld Verbrauch auf 100km:");
			alert.setContentText("Es dürfen nur Zahlen verwendet werden.\n\nFolgende Felder müssen ausgefüllt werden:\n– Tankvolumen\n– Verbrauch auf 100km");
			alert.showAndWait();
		}
		if(!input_kmSeitTanken.getText().isEmpty() && isNumeric(input_kmSeitTanken.getText())){
			BenzinRechnerModel.kmGefahren = Double.parseDouble(input_kmSeitTanken.getText());
		}else if(!input_kmSeitTanken.getText().isEmpty() && !isNumeric(input_kmSeitTanken.getText())){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ACHTUNG !!!");
			alert.setHeaderText("Fehlerhafte Eingabe in Feld km seit letztem Tanken:");
			alert.setContentText("Es dürfen nur Zahlen verwendet werden.\n\nFolgende Felder müssen ausgefüllt werden:\n– Tankvolumen\n– Verbrauch auf 100km");
			alert.showAndWait();
		}
		if(!input_kmGeplant.getText().isEmpty() && isNumeric(input_kmGeplant.getText())){
			BenzinRechnerModel.kmGeplant = Double.parseDouble(input_kmGeplant.getText());
		}else if(!input_kmGeplant.getText().isEmpty() && !isNumeric(input_kmGeplant.getText())){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ACHTUNG !!!");
			alert.setHeaderText("Fehlerhafte Eingabe in Feld geplante km:");
			alert.setContentText("Es dürfen nur Zahlen verwendet werden.\n\nFolgende Felder müssen ausgefüllt werden:\n– Tankvolumen\n– Verbrauch auf 100km");
			alert.showAndWait();
		}

	}
	
	// handelt das Auswählen und Wechseln zuwischen den Menupunkten
	@FXML
	public void handleMenuClick(ActionEvent event) throws IOException {
		super.handleMenuClick(event);
	}
	
	// handelt die Klicks auf die Buttons, ruft die entsprechenden Berechnungen auf
	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {
		getValues();
		switch (((Node) event.getSource()).getId()) {
		case "btn_kmMitTankVoll":
			BenzinRechnerView.ausgabe("Du kannst mit einem vollen Tank ", " km weit fahren.", BenzinRechnerModel.kmMitTankVoll(), output_result);
			break;
		case "btn_kmMitLiterAktuell":
			BenzinRechnerView.ausgabe("Du kannst mit dem aktuellen Füllstand ", " km weit fahren.",  BenzinRechnerModel.kmMitLiterAktuell(), output_result);
			break;
		case "btn_literAktuell":
			BenzinRechnerView.ausgabe("Es sind im Moment ", " Liter im Tank",  BenzinRechnerModel.literAktuell(), output_result);
			break;
		case "btn_literTankenFuerGeplant":
			BenzinRechnerView.ausgabe("Du musst für die geplante Strecke ", " Liter tanken.",  BenzinRechnerModel.literTankenFuerGeplant(), output_result);
			break;
		case "btn_anzTankenKmGeplant":
			BenzinRechnerView.ausgabe("Du musst für die geplante Strecke ", " Mal tanken.",  BenzinRechnerModel.anzTankenKmGeplant(), output_result);
			break;
		case "btn_leeren":
			output_result.setText("");
			break;
		default:
			break;
		}
	}
	
	
}
