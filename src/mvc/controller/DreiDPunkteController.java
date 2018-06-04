package mvc.controller;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import mvc.model.dreieck3d;

public class DreiDPunkteController extends MainController
{
	
	// Die Referenzen zu den Textfeldern und Buttons im FXML
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
	private TextField output;
	@FXML
	private TextField gammaout;
	@FXML
	private TextField aout;
	@FXML
	private TextField bout;
	@FXML 
	private TextField cout;

	private dreieck3d dreiDPunkteModel = new dreieck3d();
	//private dreiDPunkteView myView = new dreiDPunkteView("3dpunkte.fxml", "3D Punkte");
	
	
	/**
	 * Das Wird ausgeführt, wenn der Button Berechnen geklickt wird
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void handleButtonClick(ActionEvent event) throws IOException {
		switch (((Node) event.getSource()).getId()) {
		case "btnberechnen":
			if(checkparameter())
			{
				//Array für Rückgabewerte
				Double[] ret = new Double[5];
				ret = berechnen(ax, ay, az, bx, by, bz, cx, cy, cz, output);
				//Die Methode setflaeche in der View wird aufgerufen
				dreiDPunkteView.setflaeche(ret[0],ret[1],ret[2],ret[3],ret[4], output, gammaout, aout,bout,cout);
				break;
			}
			else
			{
				playSound();
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Falsche Eingabe");
				alert.setHeaderText("Überprüfen Sie die eingegebenen Werte");
				alert.setContentText("Die Koordinaten dürfen nur numerische Werte enthalten. Ändern Sie bitte die falschen Werte und berechnen sie erneut. Achten Sie darauf dass kein Feld leer ist.");

				alert.showAndWait();
			}
		default:
			break;
		}
	}
	
	/**
	 * Wechsel zwischen Tabs mit Menü wird im Maincontroller behandelt
	 */
	@FXML
	public void handleMenuClick(ActionEvent event) throws IOException {
		super.handleMenuClick(event);
	}
	
	/**
	 * Überprüft ob die Alle Werte korrekt sind und nicht leer sind
	 * @return
	 */
	public boolean checkparameter()
	{
		if(isNumeric(ax.getText())){
			if(isNumeric(ay.getText())){
				if(isNumeric(az.getText())){
					if(isNumeric(bx.getText())){
						if(isNumeric(by.getText())){
							if(isNumeric(bz.getText())){
								if(isNumeric(cx.getText())){
									if(isNumeric(cy.getText())){
										if(isNumeric(cz.getText())){
											return true;
										}
										else
											return false;
									}
									else
										return false;
								}
								else
									return false;
							}
							else
								return false;
						}
						else
							return false;
					}
					else
						return false;
				}
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
		
	}
	
	/**
	 * Überprüft ob der übergebene String eine Zahl ist
	 * @param str
	 * @return
	 */
	public boolean isNumeric(String str)
	{
		 
		  try  
		  {  
		    int d = Integer.parseInt(str);  
		  }  
		  catch(NumberFormatException nfe)  
		  {  
		    return false;  
		  }  
		  return true;  
		
	}
	
	
	/**
	 * Diese Methode berechnet die gewünschten Werte in dem sie Die Textwerte aus den Textfeldern in Integer umwandelt 
	 * und die Werte dem Model zum berechnen übergibt.
	 * @param ax
	 * @param ay
	 * @param az
	 * @param bx
	 * @param by
	 * @param bz
	 * @param cx
	 * @param cy
	 * @param cz
	 * @param ausgabe
	 * @return
	 */
	public Double[] berechnen(TextField ax, TextField ay, TextField az, TextField bx, TextField by, TextField bz, TextField cx, TextField cy, TextField cz, TextField ausgabe) 
	{
		//Werte aus Textfeldern in Integer umwandeln
		int xa = Integer.parseInt(ax.getText());
		int xb = Integer.parseInt(bx.getText());
		int xc = Integer.parseInt(cx.getText());
		
		int ya = Integer.parseInt(ay.getText());
		int yb = Integer.parseInt(by.getText());
		int yc = Integer.parseInt(cy.getText());
		
		int za = Integer.parseInt(az.getText());
		int zb = Integer.parseInt(bz.getText());
		int zc = Integer.parseInt(cz.getText());
		
		//Werte berechnen mit Methoden aus Model
		double[] seiten = dreiDPunkteModel.seitenberechnen(xa,xb,xc,ya,yb,yc,za,zb,zc);
		double gamma = dreiDPunkteModel.gammabestimmen(seiten[0],seiten[1],seiten[2]);
		double flaeche = dreiDPunkteModel.flaechebestimmen(seiten[0],seiten[1], gamma);
		
		//Return Array befüllen
		Double[] ret = new Double[5];
		ret[0] = flaeche;
		ret[1] = gamma;
		ret[2] = seiten[0];
		ret[3] = seiten[1];
		ret[4] = seiten[2];
		//Array zurüchgeben
		return ret;
	}
	
	/**
	 * Spielt Error Sound ab
	 */
	public void playSound() {
		File f = new File("src/images/error.mp3");
		Media hit = new Media(f.toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
	}
	
}
