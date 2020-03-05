package practiceProblems;

public class MinimumUniqueNo {

	static void findMiniUnique(int start,int end){

		for (int i = start; i<end; i++) {
	     int num=i;
	     int rem=1;
	     if(num%10!=rem&&num%10!=2) {
	    	 num++;
	    	 System.out.println("minimun unique no is"+num);
	     }else {
	    	 
	     }
	     
		
	}
		}
	public static void main(String[] args) {
	 int start=100,end=200;
     findMiniUnique(start,end);
	}

}
