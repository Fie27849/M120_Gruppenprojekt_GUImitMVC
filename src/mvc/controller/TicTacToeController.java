package mvc.controller;

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
		System.out.println(((Node) event.getSource()).getId());
	}

	@FXML
	public void handleMenuClick() {
		
	}
}
