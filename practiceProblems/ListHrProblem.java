package practiceProblems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListHrProblem {
	public static void main(String[] args)throws IOException {
		System.out.println("enter the list");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) 
			list.add(sc.nextInt());
			
        int t=sc.nextInt();
       while(t-->0) {
    	   String s=sc.next();
    	   switch (s) {
		case "Insert":
			int i=sc.nextInt();
			int j=sc.nextInt();
			list.add(i,j);
			break;
		case "Delete":
			int d=sc.nextInt();
			list.remove(d);
		}
       }
		
		for (int i1=0; i1<list.size(); i1++) 
            System.out.print(list.get(i1)+" "); 
  
	}

}
