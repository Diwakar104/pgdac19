package practiceProblems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UpperCollection {
	public static String CamelCase(String str) {
	    // code goes here  
	    int size=str.length();
	    int count=0;
	    char charArray[]=str.toCharArray();
	    int resIndex=0;
	    for(int i=0;i<size;i++){
	      if(charArray[i]==' ')
	      {
	        count++;
	        charArray[i+1]=Character.toUpperCase(charArray[i+1]);
	      }
	      else{
	        charArray[resIndex++]=charArray[i];
	      }
	    }
	    return String.valueOf(charArray,0,size-count);
	  }
	public static void main(String[] args) {
		String str="Argument goes here";
	    System.out.print(CamelCase(str)); 
    }
}
