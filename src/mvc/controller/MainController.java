package mvc.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import mvc.template.model;
import mvc.template.view;

public class MainController {
	
	@FXML
	private Menu punkte3d;
	@FXML
	private Menu home;
	@FXML
	private Menu tictactoe;
	@FXML
	private Menu textverschluesselung;
	@FXML
	private Menu benzinrechner;
	@FXML
	private Button button;

	private model mymodel = new model("Home");
	private view myView = new view("page.fxml", "Page");

	@FXML
	public void handleMenuClick(Event event) throws IOException {
		System.out.println(event);
		switch (((Node) event.getSource()).getId()) {
		case "button":
			System.out.println("test");
			break;
		case "page":
			break;

		default:
			break;
		}
	}
}
