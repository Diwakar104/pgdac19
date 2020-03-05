package practiceProblems;

public class RemoveGivenWord {
 
	public static String removeWord(String str, String word) {
		
		if (str.contains(word)) {
			String tempword=word + " ";
			str=str.replaceAll(tempword,"");
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="geeks for geeks";
		String word1="for";
		
		String str2="geeks for geeks";
		String word2="for";

		String str3="geeks geeks for";
		String word3="for";

		 // Test case 1 
        System.out.println("String: " + str1 
                           + "\nWord: " + word1 
                           + "\nResult String: "
                           + removeWord(str1, word1)); 
  
        // Test case 2 
        System.out.println("\nString: " + str2 
                           + "\nWord: " + word2 
                           + "\nResult String: "
                           + removeWord(str2, word2)); 
  
        // Test case 3 
        System.out.println("\nString: " + str3 
                           + "\nWord: " + word3 
                           + "\nResult String: "
                           + removeWord(str3, word3)); 
  

	}

	
}
