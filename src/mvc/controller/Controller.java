package mvc.controller;

import mvc.view.MainView;
import mvc.view.TicTacToeView;
import mvc.view.VerschluesselungsView;

public class Controller {
	private MainView mainView;
	private TicTacToeView ticTacToeView;
	private VerschluesselungsView verschluesselungsView;
	
	
	public Controller(){
		this.mainView = new MainView();
		this.ticTacToeView = new TicTacToeView();
		this.verschluesselungsView = new VerschluesselungsView();
	}
}
