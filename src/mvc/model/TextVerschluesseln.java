package mvc.model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextVerschluesseln implements StdFilesLoc{
	
	private String text = "";
	private String verschluesselterText = "";
	private String pwd = "passwort";
	private char[] charArray = {};
	private char[] pwdArray = {};
	int zpwd;
	
	public TextVerschluesseln(){
		
	}
	
	public TextVerschluesseln(String text){
		this.text = text;
		verschluesseln(text);
	}
	
	public String verschluesseln(String Text){
		
		pwdArray = pwd.toCharArray();
		charArray = text.toCharArray();
		
		for(int i = 0; i < charArray.length; i++){
			charArray[i] = (char) (charArray[i] + pwdArray[zpwd]);
			zpwd++;
			
			if(zpwd == pwd.length()){
				zpwd = 0;
			}
		}
		
		for(int i = 0; i < charArray.length; i++){
			verschluesselterText += charArray[i];
		}
		return verschluesselterText;
	}
	
	
	
	
	/**
	 * Klassenvariablen
	 */
	private String filename;

	private String decodierterText = "";


	boolean testing = true;
	int testMethod = 0;
	int testergebnis = 0;
	Scanner scan = new Scanner(System.in);

	/**
	 * Konstruktor mit @param testing Parameter
	 */


	/**
	 * Menuefuehrung mit Usereingabe und File lesen
	 */

	/**
	 * Methode verschluesseln mit @param Text
	 */
	
	/**
	 * Methode decoder mit @param charArray
	 */
	private void decoder(char[] charArray){
		zpwd = 0;
		for(int i = 0; i < charArray.length; i++){
			charArray[i] = (char) (charArray[i] - pwdArray[zpwd]);
			zpwd++;
			
			if(zpwd == pwd.length()){
				zpwd = 0;
			}
		}
		for(int i = 0; i < charArray.length; i++){
			decodierterText += charArray[i];
		}
		ausgabe(decodierterText, 2);
	}
	/**
	 * Methode ausgabe mit:
	 * @param ausgabe
	 * @param check
	 */
	private void ausgabe(String ausgabe, int check) {
		if(check == 1){
			System.out.println("Verschlüsselter Text: " + ausgabe);
		}
		else{
			System.out.println("decodierter Text: " + ausgabe);
			if(testing){
				test();
			}
		}	
	}
	/**
	 * Methode test
	 */
	private void test(){
		if(testMethod == 0){
			if(decodierterText.equals(text)){
				System.out.println("\nVer- und entschlüsselung mit File erfolgreich!\n");
				testergebnis++;
			}else{
				System.out.println("\nVer- und entschlüsselung mit File fehlerhaft!\n");
			}
		}else{
			if(decodierterText.equals(text)){
				System.out.println("\nVer- und entschlüsselung mit Eingabe erfolgreich!\n");
				testergebnis++;
				if(testergebnis == 2){
					System.out.println("\nDer Test konnte erfolgreich abgeschlossen werden!");
				}
				else{
					System.out.println("\nBitte Fehler überprüfen!");
				}
			}else{
				System.out.println("Ver- und entschlüsselung mit Eingabe fehlerhaft!");
				System.out.println("\nBitte Fehler überprüfen!");
			}
		}
	}


	/**
	 * Methoden welche vom Interface StdFilesLoc uebernommen werden.
	 */
	@Override
	public boolean check_folder() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create_folder() {
		// TODO Auto-generated method stub
		return false;
	}

}
