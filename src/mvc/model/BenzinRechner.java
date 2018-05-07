package mvc.model;
import java.util.Scanner;

public class BenzinRechner {
	
	// ---------------------- Variabeln ---------------------------------------------------
	private double tankGesamt;		// Gesamtvolumen des Tanks in Liter
	private double tankRest;		// aktueller Tankfüllstand in Liter
	private double tankBenoetigt;	// Benzin, welches für angegebene Strecke gebraucht wird in Liter
	private double literVerbraucht;	// Liter Benzin, die seit letztem tanken verbraucht wurden
	private double tankFuellen;		// Benzin, dass man für bestimmte km nachtanken muss in Liter
	
	private double kmRest;			// restliche km, die man fahren kann
	private double kmGefahren;		// gefahrene km seit tanken
	private double kmGeplant;		// geplante km, die man fahren möchte
	private double kmRestGeplant;	// geplante km, die man mit aktuellem Füllstand nicht mehr fahren kann
	
	private double verbrauchPro100;	// Menge Benzin, für 100km in Liter
	private double verbrauchKmRestGeplant;	//benötigtes Benzin für kmRestGeplant
	private int anzNachtanken;			// so oft muss nachgetankt werden
	private double tanken;				// hilft anzNachtanken
	
	// ---------------------------- Konstruktor -------------------------------------------------		
	public BenzinRechner(String string) {
		// TODO Auto-generated constructor stub
	}	
	
}
