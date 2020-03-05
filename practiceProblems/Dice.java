package practiceProblems;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		System.out.println("enter the given input");
		int T;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		while(T-- >0) {

		int n=sc.nextInt();
		int res=0;
		switch (n) {
		case 1:
			res=6;
			break;
		case 2:
			res=5;
			break;
		case 3:
			res=4;
			break;
		case 4:
			res=3;
			break;
		case 5:
			res=2;
			break;
		case 6:
			res=1;
            break;
		default:
			break;
		}
       System.out.print(res);
       System.out.println();
	}
}
}
