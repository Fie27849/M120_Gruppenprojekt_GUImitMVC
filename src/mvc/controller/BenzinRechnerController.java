package mvc.controller;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mvc.model.BenzinRechner;
import mvc.view.BenzinRechnerView;


public class BenzinRechnerController extends MainController {

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
	


	private BenzinRechner BenzinRechnerModel = new BenzinRechner();
	//private BenzinRechnerView BenzinRechnerView = new BenzinRechnerView("benzinrechner.fxml", "Benzinrechner");


	
	// Werte von input Feldern in Variabeln schreiben
	public void getValues(){
		if(!input_tankTotal.getText().isEmpty() && input_tankTotal.getText().matches("[0-9]+")){
			BenzinRechnerModel.tankGesamt = Double.parseDouble(input_tankTotal.getText());
		}
		if(!input_verbrauch.getText().isEmpty()){
			BenzinRechnerModel.verbrauchPro100 = Double.parseDouble(input_verbrauch.getText());
		}
		if(!input_kmGeplant.getText().isEmpty()){
			BenzinRechnerModel.kmGeplant = Double.parseDouble(input_kmGeplant.getText());
		}
		if(!input_kmSeitTanken.getText().isEmpty()){
			BenzinRechnerModel.kmGefahren = Double.parseDouble(input_kmSeitTanken.getText());
		}

	}
	
	@FXML
	public void handleMenuClick(ActionEvent event) throws IOException {
		super.handleMenuClick(event);
	}
	
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
			input_verbrauch.setText("");
			input_tankTotal.setText("");
			input_kmSeitTanken.setText("");
			input_kmGeplant.setText("");
			break;
		default:
			break;
		}
	}
	
	
}
