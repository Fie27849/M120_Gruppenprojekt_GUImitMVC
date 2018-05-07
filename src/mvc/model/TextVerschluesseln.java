package mvc.model;


public class TextVerschluesseln{
	
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
}
