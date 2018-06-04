package mvc.model;


public class TextVerschluesseln{
	
	private String text = "";
	private String verschluesselterText = "";
	private String decodierterText = "";
	private String pwd = "passwort";
	int zpwd;
	
	/**
	 * Programm zur Textverschlüsselung und entschlüsselung
	 */
	
	public TextVerschluesseln(){
		
	}
	
	/**
	 * Text und Code Wort wird übergeben, jeder Buchstabe wird mit dem Buchstabe vom Codewort addiert
	 * Wenn das Code Wort zu ende ist wird wieder mit dem ersten Buchstabe angefangen
	 * Verschlüsselter Text wird zurückgegeben
	 */
	
	public String verschluesseln(String text, String pwd){
		
		verschluesselterText = "";
		this.text = text;
		this.pwd = pwd;
		zpwd = 0;
		char[] charArray = {};
		char[] pwdArray = {};
		
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
	 * Verschlüsselter Text und Code Wort wird übergeben, jeder Buchstabe wird mit dem Buchstabe vom Codewort subtrahiert
	 * Wenn das Code Wort zu ende ist wird wieder mit dem ersten Buchstabe angefangen
	 * entschlüsselter Text wird zurückgegeben
	 */
	
	public String decoder(String text, String pwd){
		
		decodierterText = "";
		this.text = text;
		this.pwd = pwd;
		zpwd = 0;
		char[] charArray = {};
		char[] pwdArray = {};
		
		pwdArray = pwd.toCharArray();
		charArray = text.toCharArray();
		
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
		return decodierterText;
	}
}
