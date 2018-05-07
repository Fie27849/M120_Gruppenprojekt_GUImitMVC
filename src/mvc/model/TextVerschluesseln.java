package mvc.model;


public class TextVerschluesseln implements StdFilesLoc{
	
	private String text = "";
	private String verschluesselterText = "";
	private String decodierterText = "";
	private String pwd = "passwort";
	private char[] charArray = {};
	private char[] pwdArray = {};
	int zpwd;
	
	
	public TextVerschluesseln(){
		
	}
	
	
	public String verschluesseln(String text, String pwd){
		
		this.text = text;
		this.pwd = pwd;
		
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
	
	
	public String decoder(String text, String pwd){
		
		this.text = text;
		this.pwd = pwd;
		zpwd = 0;
		
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
	
	/**
	 * Methode test
	 */
//	private void test(){
//		if(testMethod == 0){
//			if(decodierterText.equals(text)){
//				System.out.println("\nVer- und entschlüsselung mit File erfolgreich!\n");
//				testergebnis++;
//			}else{
//				System.out.println("\nVer- und entschlüsselung mit File fehlerhaft!\n");
//			}
//		}else{
//			if(decodierterText.equals(text)){
//				System.out.println("\nVer- und entschlüsselung mit Eingabe erfolgreich!\n");
//				testergebnis++;
//				if(testergebnis == 2){
//					System.out.println("\nDer Test konnte erfolgreich abgeschlossen werden!");
//				}
//				else{
//					System.out.println("\nBitte Fehler überprüfen!");
//				}
//			}else{
//				System.out.println("Ver- und entschlüsselung mit Eingabe fehlerhaft!");
//				System.out.println("\nBitte Fehler überprüfen!");
//			}
//		}
//	}


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
