package mvc.controller;

import mvc.model.TextVerschluesseln;
import mvc.model.BenzinRechner;
import mvc.model.dreieck3d;
import mvc.model.TicTacToe;

import mvc.view.MainView;
import mvc.view.TicTacToeView;
import mvc.view.VerschluesselungsView;
import mvc.view.dreiDPunkteView;
import mvc.view.BenzinRechnerView;

public class Controller {
	// Views
	private MainView mainView;
	private TicTacToeView ticTacToeView;
	private VerschluesselungsView verschluesselungsView;
	private dreiDPunkteView dreiDPunkteView;
	private BenzinRechnerView benzinRechnerView;
	
	//Models
	private TextVerschluesseln verschluesselungsModel;
	private BenzinRechner benzinRechnerModel;
	private dreieck3d dreiDPunkteModel;
	private TicTacToe ticTacToeModel;
	
	public Controller(){
		this.mainView = new MainView();
		this.ticTacToeView = new TicTacToeView();
		this.verschluesselungsView = new VerschluesselungsView();
		this.dreiDPunkteView = new dreiDPunkteView();
		this.benzinRechnerView = new BenzinRechnerView();
		
		this.verschluesselungsModel = new TextVerschluesseln(false);
		this.benzinRechnerModel = new BenzinRechner();
		this.dreiDPunkteModel = new dreieck3d();
		this.ticTacToeModel = new TicTacToe();
	}
	
	public void dreieck3d() 
	{
		
	}
}
