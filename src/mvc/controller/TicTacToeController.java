package mvc.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import mvc.model.TicTacToe;

public class TicTacToeController extends MainController {

	private TicTacToe game;

	@FXML
	private Button a1;
	@FXML
	private Button a2;
	@FXML
	private Button a3;
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private Button c1;
	@FXML
	private Button c2;
	@FXML
	private Button c3;
	@FXML
	private Label info;

	@FXML
	public void handleButtonClick(ActionEvent event) {
		switch (((Node) event.getSource()).getId()) {
		case "a1":
			break;
		case "a2":
			break;
		case "a3":
			break;
		case "b1":
			break;
		case "b2":
			break;
		case "b3":
			break;
		case "c1":
			break;
		case "c2":
			break;
		case "c3":
			break;
		default:
			break;
		}
	}

	@FXML
	public void handleMenuClick(ActionEvent event) throws IOException {
		super.handleMenuClick(event);
	}
}
