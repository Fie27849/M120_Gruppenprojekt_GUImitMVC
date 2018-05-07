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
import mvc.view.view;


public class BenzinRechnerController {

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
	

	private BenzinRechner BenzinRechnerModel = new BenzinRechner("Benzinrechner");
	private BenzinRechnerView BenzinRechnerView = new BenzinRechnerView("benzinrechner.fxml", "Benzinrechner");

	
	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {
		switch (((Node) event.getSource()).getId()) {
		case "btn_kmMitTankVoll":
			this.BenzinRechnerView.kmMitTankVoll();
			break;
		case "btn_kmMitLiterAktuell":
			this.BenzinRechnerView.kmMitLiterAktuell();
			break;
		case "btn_literAktuell":
			this.BenzinRechnerView.literAktuell();
			break;
		case "btn_literTankenFuerGeplant":
			this.BenzinRechnerView.literTankenFuerGeplant();
			break;
		case "btn_anzTankenKmGeplant":
			this.BenzinRechnerView.anzTankenKmGeplant();
			break;
		default:
			break;
		}
	}
	
	
}
