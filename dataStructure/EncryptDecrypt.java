package dataStructure;

public class EncryptDecrypt {

	public static void main(String[] args) {
		String text="hello";
		int s =4;
		System.out.println("Text " + text);
		System.out.println("shift" + s);
		System.out.println("Cipher "+ encrypt(text,s));

	}

	public static StringBuffer encrypt(String text, int s) {
		StringBuffer result=new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			
			if (Character.isUpperCase(text.charAt(i))) {
                char ch=(char)(((int)text.charAt(i)+s-65)%26+65);				
			    result.append(ch);
			}
			else {
				char ch=(char)(((int)text.charAt(i)+s-97)%26+97);
			    result.append(ch);
			    
			}
		}
		return result;
	}

}
