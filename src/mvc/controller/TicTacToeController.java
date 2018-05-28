package mvc.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TicTacToeController extends MainController {
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
	public void handleMenuClick(ActionEvent event) throws IOException {
		super.handleMenuClick(event);
	}
}
