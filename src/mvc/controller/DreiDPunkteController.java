package mvc.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import mvc.model.dreieck3d;
import mvc.template.model;
import mvc.template.view;
import mvc.view.dreiDPunkteView;

public class DreiDPunkteController 
{
	@FXML
	private Button btnberechnen;
	@FXML
	private TextField ax;
	@FXML
	private TextField ay;
	@FXML
	private TextField az;
	@FXML
	private TextField bx;
	@FXML
	private TextField by;
	@FXML
	private TextField bz;
	@FXML
	private TextField cx;
	@FXML
	private TextField cy;
	@FXML
	private TextField cz;
	@FXML
	private Label output;

	private dreieck3d dreiDPunkteModel = new dreieck3d();
	private dreiDPunkteView myView = new dreiDPunkteView("3dpunkte.fxml", "3D Punkte");
	
	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {
		switch (((Node) event.getSource()).getId()) {
		case "btnberechnen":
			double flaeche = berechnen(ax, ay, az, bx, by, bz, cx, cy, cz, output);
			myView.setflaeche(flaeche, output);
			break;
		
		default:
			break;
		}
	}
	
	public double berechnen(TextField ax, TextField ay, TextField az, TextField bx, TextField by, TextField bz, TextField cx, TextField cy, TextField cz, Label ausgabe) 
	{
		int xa = Integer.parseInt(ax.getText());
		int xb = Integer.parseInt(bx.getText());
		int xc = Integer.parseInt(cx.getText());
		
		int ya = Integer.parseInt(ay.getText());
		int yb = Integer.parseInt(by.getText());
		int yc = Integer.parseInt(cy.getText());
		
		int za = Integer.parseInt(az.getText());
		int zb = Integer.parseInt(bz.getText());
		int zc = Integer.parseInt(cz.getText());
		
		double[] seiten = dreiDPunkteModel.seitenberechnen(xa,xb,xc,ya,yb,yc,za,zb,zc);
		double gamma = dreiDPunkteModel.gammabestimmen(seiten[0],seiten[1],seiten[2]);
		double flaeche = dreiDPunkteModel.flaechebestimmen(seiten[0],seiten[1], gamma);
		return flaeche;
	}
	
}
