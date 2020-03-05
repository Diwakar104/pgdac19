package practiceProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAnagram {
	public static boolean anagram( char s1[],char s2[]) {
		if (s1.length!=s2.length) {
			return false;
		}
		else {
			Arrays.sort(s1);
			Arrays.sort(s2);
			for (int i = 0; i < s2.length; i++) {
				if(s1[i]!=s2[i])
					return false;
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("enter the number");
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			//System.out.println("enter the string");
		String str=br.readLine();
		char s1[]=str.toCharArray();
		char s2[]=str.toCharArray();
		if (anagram(s1,s2)) {
			System.err.println("YES");
			
		}
		else {
			System.out.println("NO");
		}
		}

	}

}
