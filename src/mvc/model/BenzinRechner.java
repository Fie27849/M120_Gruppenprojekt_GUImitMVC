package mvc.model;
import java.util.Scanner;

import mvc.controller.BenzinRechnerController;
import mvc.view.BenzinRechnerView;


public class BenzinRechner {
	
	// ---------------------- Variabeln ---------------------------------------------------
	public double tankGesamt;		// Gesamtvolumen des Tanks in Liter
	public double tankRest;		// aktueller Tankfüllstand in Liter
	public double tankBenoetigt;	// Benzin, welches für angegebene Strecke gebraucht wird in Liter
	public double literVerbraucht;	// Liter Benzin, die seit letztem tanken verbraucht wurden
	public double tankFuellen;		// Benzin, dass man für bestimmte km nachtanken muss in Liter
	
	public double kmRest;			// restliche km, die man fahren kann
	public double kmGefahren;		// gefahrene km seit tanken
	public double kmGeplant;		// geplante km, die man fahren möchte
	public double kmRestGeplant;	// geplante km, die man mit aktuellem Füllstand nicht mehr fahren kann
	
	public double verbrauchPro100;	// Menge Benzin, für 100km in Liter
	public double verbrauchKmRestGeplant;	//benötigtes Benzin für kmRestGeplant
	public double anzNachtanken;			// so oft muss nachgetankt werden
	public double tanken;				// hilft anzNachtanken
	
	// ---------------------------- Konstruktor -------------------------------------------------		
	public BenzinRechner() {}	
	
	
	// ------------------------------ Methoden ---------------------------------------------------
	


		
		// Strecke mit vollem Tank berechnen
		public double kmMitTankVoll(){
			
			kmRest = tankGesamt/verbrauchPro100*100;
			
			return kmRest;
		}
		
		// Strecke mit aktuellem Fällstand berechnen
		public double kmMitLiterAktuell(){
			
			literVerbraucht = kmGefahren*verbrauchPro100/100;
			tankRest = tankGesamt-literVerbraucht;
			kmRest = tankRest/verbrauchPro100*100;
			
			return kmRest;
		}
		
		// aktuellen Füllstand berechnen
		public double literAktuell(){
			
			literVerbraucht = kmGefahren*verbrauchPro100/100;
			tankRest = tankGesamt-literVerbraucht;
			
			return tankRest;
		}
		
		// Nötige Liter für geplante Strecke berechnen
		public double literTankenFuerGeplant(){
			
			kmRest = tankRest/verbrauchPro100*100;
			kmRestGeplant = kmGeplant-kmRest;
			verbrauchKmRestGeplant = kmRestGeplant*verbrauchPro100/100;
			
			return verbrauchKmRestGeplant;
		}
		
		// Anzahl Tankungen für benötigte Liter berechnen
		private double anzNachtanken(double restLiterBenoetigt, double tankRest){
			
			anzNachtanken = 1;
			while(restLiterBenoetigt > tankGesamt){
				anzNachtanken ++;
				restLiterBenoetigt = restLiterBenoetigt - tankGesamt;
			}
			return anzNachtanken;
		}
		
		public double anzTankenKmGeplant(){
			
			kmRest = tankRest/verbrauchPro100*100;
			kmRestGeplant = kmGeplant-kmRest;
			verbrauchKmRestGeplant = kmRestGeplant*verbrauchPro100/100;
			
			if(verbrauchKmRestGeplant > tankGesamt){
				anzNachtanken = anzNachtanken(verbrauchKmRestGeplant, tankRest);
			}
			
			return anzNachtanken;
		}
	
}

