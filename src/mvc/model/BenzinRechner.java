package mvc.model;
import java.util.Scanner;

import mvc.controller.BenzinRechnerController;


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
	public int anzNachtanken;			// so oft muss nachgetankt werden
	public double tanken;				// hilft anzNachtanken
	
	// ---------------------------- Konstruktor -------------------------------------------------		
	public BenzinRechner(String string) {
		// TODO Auto-generated constructor stub
	}	
	
	
	// ------------------------------ Methoden ---------------------------------------------------
	


		
		// Strecke mit vollem Tank berechnen
		public double kmMitTankVoll(){
			
			
			return kmRest;
		}
		
		// Strecke mit aktuellem Fällstand berechnen
		public double kmMitLiterAktuell(){
			
			
			return kmRest;
		}
		
		// aktuellen Füllstand berechnen
		public double literAktuell(){
			
			
			return tankRest;
		}
		
		// Nötige Liter für geplante Strecke berechnen
		public double literTankenFuerGeplant(){
			
			
			return verbrauchKmRestGeplant;
		}
			
		// Anzahl Tankungen für benötigte Liter berechnen
		public double anzTankenKmGeplant(){
			
			
			return anzNachtanken;
		}
	
}



//METHODEN


//private void case1(){
//	//System.out.println("Du kannst nun berechnen, wie viele km du mit vollem Tank fahren kannst."
//	//		+ "\nDazu musst du noch ein paar Angaben machen:");
//	
//	//System.out.println("\nWie viele Liter Benzin fasst dein Tank?");
//	tankGesamt = scanner.nextDouble();
//	//System.out.println("Wie viele Liter verbraucht das Auto auf 100 km?");
//	verbrauchPro100 = scanner.nextDouble();
//	
//	kmRest = tankGesamt/verbrauchPro100*100;
//	System.out.println("Du kannst mit " + tankGesamt + " Litern " + kmRest + " km weit fahren.");
//	
//	fortfahren();
//			
//}


//private void case2(){
//
//System.out.println("Du kannst nun berechnen, wieviel Benzin noch im Tank ist."
//		+ "\nDazu musst du aber noch ein paar Angaben machen:");
//
//System.out.println("\nWie viele Liter Benzin fasst dein Tank?");
//tankGesamt = scanner.nextDouble();
//System.out.println("Wie viele Liter verbraucht das Auto auf 100 km?");
//verbrauchPro100 = scanner.nextDouble();
//System.out.println("Wie weit bist du seit dem letzten Mal tanken gefahren?");
//kmGefahren = scanner.nextDouble();
//
//literVerbraucht = kmGefahren*verbrauchPro100/100;
//tankRest = tankGesamt-literVerbraucht;
////System.out.println(literVerbraucht);
////System.out.println(tankRest);
//
//System.out.println("Du hast noch " + tankRest + " Liter Benzin im Tank");
//
//fortfahren();
//}


//private void case3(){
//
//System.out.println("Du kannst nun berechnen, wie weit du noch fahren kannst, mit dem Benzin, dass noch im Tank ist."
//		+ "\nDazu musst du aber noch ein paar Angaben machen:");
//
//System.out.println("Weisst du, wie viel Benzin noch im Tank ist?");
//
//System.out.println("21 für Ja\n22 für Nein");
//eingabe = scanner.nextInt();
//if(eingabe == 21){
//	System.out.println("Bitte gib die Menge Benzin ein:");
//	tankRest = scanner.nextDouble();
//	System.out.println("Wie viele Liter verbraucht das Auto auf 100 km?");
//	verbrauchPro100 = scanner.nextDouble();
//	kmRest = tankRest/verbrauchPro100*100;
//}else if(eingabe == 22){
//	
//	System.out.println("\nWie viele Liter Benzin fasst dein Tank?");
//	tankGesamt = scanner.nextDouble();
//	System.out.println("Wie viele Liter verbraucht das Auto auf 100 km?");
//	verbrauchPro100 = scanner.nextDouble();
//	System.out.println("Wie weit bist du seit dem letzten Mal tanken gefahren?");
//	kmGefahren = scanner.nextDouble();
//	
//	literVerbraucht = kmGefahren*verbrauchPro100/100;
//	tankRest = tankGesamt-literVerbraucht;
//	kmRest = tankRest/verbrauchPro100*100;
////	System.out.println(literVerbraucht);
////	System.out.println(tankRest);
////	System.out.println(kmRest);
//}
//		
//System.out.println("Du kanns noch " + kmRest + " km weit fahren.");
//
//fortfahren();
//}



//private void case4(){
//
//System.out.println("Du kannst nun berechnen, wie viele Liter Benzin du für eine bekannte Strecke brauchst."
//		+ "\nDazu musst du aber noch ein paar Angaben machen:");
//
//System.out.println("Wie weit möchtest du fahren?");
//kmGeplant = scanner.nextDouble();
//System.out.println("Wie viele Liter verbraucht das Auto auf 100 km?");
//verbrauchPro100 = scanner.nextDouble();
//
//tankBenoetigt = kmGeplant*verbrauchPro100/100;
//System.out.println("Du brauchst für " + kmGeplant + " km " + tankBenoetigt + " Liter Benzin.");
//
//fortfahren();
//}



//private void case5(){
//
//System.out.println("Du kannst nun berechnen, wie viele Liter Benzin du für eine bekannte Strecke nachtankten musst."
//		+ "\nDazu musst du aber noch ein paar Angaben machen:");
//
//System.out.println("\nWie viele Liter Benzin fasst dein Tank?");
//tankGesamt = scanner.nextDouble();
//System.out.println("Wie viele Liter verbraucht das Auto auf 100 km?");
//verbrauchPro100 = scanner.nextDouble();
//System.out.println("Wie weit bist du seit dem letzten Mal tanken gefahren?");
//kmGefahren = scanner.nextDouble();
//
//literVerbraucht = kmGefahren*verbrauchPro100/100; 	// verbraucht seit letztem Tanken
//tankRest = tankGesamt-literVerbraucht;				// Restliche Liter im Tank
//
//if(testMaxKm(tankRest)){
//	
//	System.out.println("Wie weit möchtest du fahren?");
//	kmGeplant = scanner.nextDouble();
//					
//	kmRest = tankRest/verbrauchPro100*100;				// Restliche km mit aktuellem Füllstand
//	kmRestGeplant = kmGeplant-kmRest;					// für so viele km muss man nachtanken
//	verbrauchKmRestGeplant = kmRestGeplant*verbrauchPro100/100;	// Liter die man nachtanken muss
//		
////	System.out.println(literVerbraucht);
////	System.out.println(tankRest);
////	System.out.println(kmRest);
////	System.out.println(kmRestGeplant);
////	System.out.println(verbrauchKmRestGeplant);
//	
//	System.out.println("Du musst " + verbrauchKmRestGeplant + " Liter nachtanken.");
//	if(verbrauchKmRestGeplant > tankGesamt){
//		anzNachtanken = anzNachtanken(verbrauchKmRestGeplant, tankRest);
//		
//		System.out.println("Das passt aber nicht auf einmal in deinen Tank.\nDu musst " + anzNachtanken + " mal tanken.");
//	}
//	
//}else{
//	System.out.println("Das kann nicht sein, so weit kannst du mit einem vollen Tank nicht fahren.");
//}		
//
//fortfahren();
//}
