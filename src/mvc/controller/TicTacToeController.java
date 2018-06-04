package mvc.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import mvc.model.TicTacToe;

/**
 * Erbt vov MainController
 * @author Denis
 *
 */
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
	private Button newGame;
	@FXML
	private Label info;
	@FXML
	private Label currentPlayer;
	
	
	@FXML
	public void handleButtonClick(ActionEvent event) {
		int row = 3;
		int column = 3;
		switch (((Node) event.getSource()).getId()) {
		case "a1":
			row = 0;
			column = 0;
			break;
		case "a2":
			row = 1;
			column = 0;
			break;
		case "a3":
			row = 2;
			column = 0;
			break;
		case "b1":
			row = 0;
			column = 1;
			break;
		case "b2":
			row = 1;
			column = 1;
			break;
		case "b3":
			row = 2;
			column = 1;
			break;
		case "c1":
			row = 0;
			column = 2;
			break;
		case "c2":
			row = 1;
			column = 2;
			break;
		case "c3":
			row = 2;
			column = 2;
			break;
		case "newGame":
			this.game = new TicTacToe();
			this.TicTacToeView.setLabelText(info, "");
			this.TicTacToeView.setLabelText(currentPlayer, "O");
		default:
			break;
		}
		System.out.println(row + " " + column);
		if(this.game.isGameon()) {
			this.game.user_input(row, column);
		} else {
			this.TicTacToeView.setLabelText(info, "The game is over");
		}
		if(this.game.isTurn()) {
			this.TicTacToeView.setLabelText(currentPlayer, "O");
		} else {
			this.TicTacToeView.setLabelText(currentPlayer, "X");
		}
		
		this.TicTacToeView.draw_field(a1, a2, a3, b1, b2, b3, c1, c2, c3, this.game.getField());
	}
	
	
	@FXML
	public void handleMenuClick(ActionEvent event) throws IOException {
		super.handleMenuClick(event);
	}
}
