package mvc.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mvc.model.TextVerschluesseln;
import mvc.template.main;
import mvc.template.model;
import mvc.template.view;
import mvc.view.BenzinRechnerView;
import mvc.view.TicTacToeView;
import mvc.view.VerschluesselungsView;
import mvc.view.dreiDPunkteView;

public class MainController {
	
	@FXML
	private MenuButton myMenuButton;
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
	private BenzinRechnerView BenzinRechnerView;
	private TicTacToeView TicTacToeView;
	private dreiDPunkteView dreiDPunkteView;
	private VerschluesselungsView verschluesselungsView;
	
	@FXML
	public void handleMenuClick(ActionEvent event) throws IOException {
		MenuItem MenuItem = ((MenuItem) event.getSource());
		Stage stage = (Stage) myMenuButton.getScene().getWindow();
		switch (MenuItem.getId()) {
		case "punkte3d":
			this.dreiDPunkteView = new dreiDPunkteView("../view/3dpunkte.fxml", "3D Punkte");
			this.dreiDPunkteView.changeScene(stage);
			break;
		case "home":
			//TODO Homeview
			break;
		case "tictactoe":
			this.TicTacToeView = new TicTacToeView("../view/tictactoe.fxml", "Tic Tac Toe");
			this.TicTacToeView.changeScene(stage);
			break;
		case "textverschluesselung":
			this.verschluesselungsView = new VerschluesselungsView("../view/textverschluesselung.fxml", "Text Verschlüsseln");
			this.verschluesselungsView.changeScene(stage);
			break;
		case "benzinrechner":
			this.BenzinRechnerView = new BenzinRechnerView("../view/benzinrechner.fxml", "Benzin Rechner");
			this.BenzinRechnerView.changeScene(stage);
			break;
		default:
			break;
		}
		
	}
}
