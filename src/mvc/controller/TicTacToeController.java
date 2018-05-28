package mvc.controller;

import javafx.fxml.FXML;

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

public class TicTacToeController {
	@FXML
	public void handleMenuClick() {
		
	}
}
