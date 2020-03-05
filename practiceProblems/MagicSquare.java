package practiceProblems;

public class MagicSquare {
	static void generateSquare(int n) {
		int magic[][]=new int[n][n];
		int i=n/2;
		int j=n-1;
		
		for (int num=1; num<=n*n;) {
			//3rd condition
			if (i==-1&&j==0) {
				i=n-1;
				j=0;
			}else {
				if(j==n) {
					j=0;
				}
				if (i<0) {
					i=n-1;
				}
			}
			//position is occupied
			if(magic[i][j]!=0) {
				j=-2;
				i=+1;
				continue;
			}
			 else
	                //set number 
	                magic[i][j] = num++;  
	                  
	            //1st condition 
	            j++;  i--;  
	        } 
	   
	        // print magic square 
	        System.out.println("The Magic Square for "+n+":"); 
	        System.out.println("Sum of each row or column "+n*(n*n+1)/2+":"); 
	        for(i=0; i<n; i++) 
	        { 
	            for(j=0; j<n; j++) 
	                System.out.print(magic[i][j]+" "); 
	            System.out.println(); 
	        } 
		}
	

	public static void main(String[] args) {
	int n=3;
	generateSquare(n);

	}

}
