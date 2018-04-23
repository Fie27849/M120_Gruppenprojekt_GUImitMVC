package mvc.controller;

import mvc.model.TextVerschluesseln;
import mvc.view.MainView;
import mvc.view.TicTacToeView;
import mvc.view.VerschluesselungsView;

public class Controller {
	// Views
	private MainView mainView;
	private TicTacToeView ticTacToeView;
	private VerschluesselungsView verschluesselungsView;
	
	//Models
	private TextVerschluesseln verschluesselungsModel;
	
	public Controller(){
		this.mainView = new MainView();
		this.ticTacToeView = new TicTacToeView();
		this.verschluesselungsView = new VerschluesselungsView();
		this.verschluesselungsModel = new TextVerschluesseln(false);
	}
}
