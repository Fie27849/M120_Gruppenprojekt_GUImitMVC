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
	private BenzinRechnerView BenzinRechnerView = new BenzinRechnerView("benzinrechner.fxml", "Benzinrechner");


	
	// Werte von input Feldern in Variabeln schreiben
	public void getValues(){
		BenzinRechnerModel.tankGesamt = Double.parseDouble(input_tankTotal.getText());
		BenzinRechnerModel.verbrauchPro100 = Double.parseDouble(input_verbrauch.getText());
		BenzinRechnerModel.kmGeplant = Double.parseDouble(input_kmGeplant.getText());
		BenzinRechnerModel.kmGefahren = Double.parseDouble(input_kmSeitTanken.getText());
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
			BenzinRechnerModel.kmRest = BenzinRechnerModel.kmMitTankVoll();
			BenzinRechnerView.ausgabe(BenzinRechnerModel.kmRest, output_result);
			break;
		case "btn_kmMitLiterAktuell":
			BenzinRechnerModel.kmRest = BenzinRechnerModel.kmMitLiterAktuell();
			break;
		case "btn_literAktuell":
			BenzinRechnerModel.kmRest = BenzinRechnerModel.literAktuell();
			break;
		case "btn_literTankenFuerGeplant":
			BenzinRechnerModel.verbrauchKmRestGeplant = BenzinRechnerModel.literTankenFuerGeplant();
			break;
		case "btn_anzTankenKmGeplant":
			BenzinRechnerModel.anzNachtanken = BenzinRechnerModel.anzTankenKmGeplant();
			break;
		default:
			break;
		}
	}
	
	
}
