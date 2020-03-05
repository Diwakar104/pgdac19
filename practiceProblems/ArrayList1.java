package practiceProblems;

import java.util.*;

public class ArrayList1 {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
       int n= sc.nextInt();
       ArrayList< ArrayList<Integer>> ar= new ArrayList<>(n);
       for(int i=0; i<n; i++){
           int d= sc.nextInt();
           ArrayList<Integer> line= new ArrayList<>(d);
           ar.add(line);
           for(int j=0; j<d;j++){
               line.add(sc.nextInt());
           }
       }
       /*for(ArrayList<Integer> l : ar){
           System.out.println(l.size());
           for(Integer num: l){
               System.out.print(num + " ");
           }
           System.out.print("\n");}
       */
       
       
       int q = sc.nextInt();
       for(int i=0; i<q; i++){
           int x=sc.nextInt();
           int y=sc.nextInt();
           if(ar.get(x-1).size() <y )
               System.out.println("ERROR!");
           else
               System.out.println(ar.get(x-1).get(y-1));
       }}
}
