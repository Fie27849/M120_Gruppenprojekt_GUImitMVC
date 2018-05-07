package mvc.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import mvc.model.TextVerschluesseln;
import mvc.template.model;
import mvc.template.view;
import mvc.view.BenzinRechnerView;
import mvc.view.TicTacToeView;
import mvc.view.VerschluesselungsView;
import mvc.view.dreiDPunkteView;

public class MainController {
	
	@FXML
	private MenuItem punkte3d;
	@FXML
	private MenuItem home;
	@FXML
	private MenuItem tictactoe;
	@FXML
	private MenuItem textverschluesselung;
	@FXML
	private MenuItem benzinrechner;

	private model mymodel = new model("Home");
	private BenzinRechnerView BenzinRechnerView = new BenzinRechnerView("../view/benzinrechner.fxml", "Benzin Rechner");
	private TicTacToeView TicTacToeView = new TicTacToeView("../view/tictactoe.fxml", "Tic Tac Toe");
	private dreiDPunkteView dreiDPunkteView = new dreiDPunkteView("../view/3dpunkte.fxml", "3D Punkte");
	private VerschluesselungsView verschluesselungsView = new VerschluesselungsView("../view/textverschuesselung.fxml", "Text Verschl�sseln");
	
	@FXML
	public void handleMenuClick(ActionEvent event) throws IOException {
		MenuItem MenuItem = ((MenuItem) event.getSource());
		switch (MenuItem.getId()) {
		case "punkte3d":
			this.dreiDPunkteView.changeScene(event);
			break;
		case "home":
			break;
		case "tictactoe":
			break;
		case "textverschluesselung":
			this.verschluesselungsView.changeScene(event);
			break;
		case "benzinrechner":
			this.BenzinRechnerView.changeScene(event);
			break;
		default:
			break;
		}
		
	}
}
