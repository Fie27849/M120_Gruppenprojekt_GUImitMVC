package mvc.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import mvc.model.TicTacToe;

public class TicTacToeController extends MainController {
	
	private TicTacToe game = new TicTacToe();

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
		this.game.debug();
		this.TicTacToeView.draw_field(a1, a2, a3, b1, b2, b3, c1, c2, c3, this.game.getField());
	}
	
	
	@FXML
	public void handleMenuClick(ActionEvent event) throws IOException {
		super.handleMenuClick(event);
	}
}
