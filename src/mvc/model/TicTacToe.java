package mvc.model;
import java.util.Scanner;

public class TicTacToe {

	/**
	 * Klassen Variablen
	 * 
	 * Variablen welche eine Erklaerung brauchen
	 * private boolean turn = Bei True ist player 1 dran & false player 2
	 * private boolean gameon = Bei True ist das Spiel noch am laufen, Bei False ist das Spiel vorbei.
	 * */
	private String[][] field = new String[3][3];
	private String player1 = "o";
	private String player2 = "x";
	private boolean turn;
	private boolean gameon;
	
	/**
	 * Konstruktor welcher aufgerufen wird um das Spiel aufzusetzen
	 * */
	public TicTacToe() {
		this.turn = true;
		this.gameon = true;
		initGame();	
	}
	/**
	 * Das Spielfeld wird mit lauter Leerzeichen aufgefuellt
	 * */
	private void initGame() {
		for (int i = 0; i < getField().length; i++) {
			for (int j = 0; j < getField().length; j++) {
				this.getField()[i][j] = " ";
			}
		}
		
	}
	
	/**
	 * Methode fragt nach User Input (Entweder Player 1 oder Player 2).
	 * Falls die Methode setfield ein False zurueck gibt, wird ausgegeben
	 * das ein ungueltiger Spielzug stattgefunden hat & der Spieler kann aber immernoch
	 * setzen.
	 * */
	public void user_input(int row, int column) {
		if(setfield(row, column)) {
			draw_field();
			check_win();
		} else {
			System.out.println("Ungültiger Spielzug!");
		}
		if(full_field()) {
			this.gameon = false;
		}
	}
	/**
	 * Setzt den "Stein", x oder o, auf das leere Feld.
	 * Falls das Feld schon besetzt ist oder eine ungültige Eingabe folgt
	 * gibt die Methode ein false
	 * */
	private boolean setfield(int column, int row) {
		if(row > 2 || column > 2)
			return false;

		if(this.getField()[row][column] == " "){
			if(turn) {
				this.getField()[row][column] = player1;
				this.turn = false;
			} else {
				this.getField()[row][column] = player2;
				this.turn = true;
			}
				
			return true;
		}
		
		return false;
	}
	
	public boolean isTurn() {
		return turn;
	}
	public void switchTurn() {
		if(this.turn) {
			this.turn = false;
		} else {
			this.turn = true;
		}
	}
	public boolean isGameon() {
		return gameon;
	}
	/**
	 * Das Spielfeld wird auf Konsolenlevel ausgegeben
	 * */
	private void draw_field(){
		for (int i = 0; i < getField().length; i++) {
			for (int j = 0; j < getField().length; j++) {
				System.out.print(this.getField()[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
			System.out.print("- - - - - -");
			System.out.println();
		}
	}
	
	/**
	 * Prueft ob ein Spieler gewonnen hat.
	 * Da es nur 9 Moeglichkeiten gibt um zu gewinnen (was eher wenig sind)
	 * sind diese im switch case.
	 * Es wird ein String mit den Felder gebildet und der Methode check_line weitergegeben
	 * */
	private void check_win(){
		String line = "";
		for (int i = 0; i < 9; i++) {
			switch (i) {
			case 0:
				line = this.getField()[0][0] + this.getField()[1][0] + this.getField()[2][0];
				break;
			case 1:
				line = this.getField()[1][0] + this.getField()[1][1] + this.getField()[1][2];
				break;
			case 2:
				line = this.getField()[2][0] + this.getField()[2][1] + this.getField()[2][2];
				break;
			case 3:
				line = this.getField()[0][0] + this.getField()[0][1] + this.getField()[0][2];
				break;
			case 4:
				line = this.getField()[0][0] + this.getField()[1][0] + this.getField()[2][0];
				break;
			case 5:
				line = this.getField()[1][0] + this.getField()[1][1] + this.getField()[1][2];
				break;
			case 6:
				line = this.getField()[2][0] + this.getField()[2][1] + this.getField()[2][2];
				break;
			case 7:
				line = this.getField()[0][0] + this.getField()[1][1] + this.getField()[2][2];
				break;
			case 8:
				line = this.getField()[2][2] + this.getField()[2][1] + this.getField()[2][0];
				System.out.println(line);

				break;

			default:
				break;
			}
			if(check_line(line)) {
				System.out.println("We have a Winner");
				this.gameon = false;
				break;
			}
				
		}
		
	}
	/**
	 * Prueft den String line ob dieser "xxx" oder "ooo" ist und 
	 * gibt true als Rueckgabewert
	 * */
	private boolean check_line(String line) {
		if (line.equals("xxx")) {
			return true;
		} else if(line.equals("ooo")){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Prüft ob das Spielfeld voll ist
	 * @return
	 */
	private boolean full_field() {
		boolean gameover = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(this.getField()[i][j].equals(" ")) {
					gameover = false;
				}
			}
		}
		return gameover;
	}
	
	/**
	 * Kleine Debug Methode um das Spielfeld zu prüfen.
	 * */
	public void debug() {
		debug_field();
		draw_field();
		check_win();
		System.out.println(this.gameon ? "Nothing" : "Win");;
	}
	/**
	 * Diese Methode fuellt das Spielfeld aus.
	 * */
	private void debug_field(){
		this.getField()[2][0] = "x";
		this.getField()[1][0] = "o";
		this.getField()[0][2] = "x";
		this.getField()[1][2] = "o";
		this.getField()[1][1] = "x";

	}
	public String[][] getField() {
		return field;
	}
	
}
