package practiceProblems;

public class CheckMagicSquare {
     
	static int N=3;
	
	static boolean isMagicSquare(int mat[][]) {
		int pri=0,sec=0;
		for (int i = 0; i <N; i++) {
			pri=pri+mat[i][i];
		}
		for (int i = 0; i <N; i++) {
			sec=sec+mat[i][N-1-i];
		}
		if(pri!=sec)
			return false;
		
		for (int i = 0; i <N; i++) {
			int rowsum=0;
			for (int j = 0; j <N; j++) {
				rowsum=rowsum+mat[i][j];
			}
			if (rowsum !=pri) 
                return false; 
		}
		 // For sums of Columns 
        for (int i = 0; i < N; i++) { 
  
            int colSum = 0; 
            for (int j = 0; j < N; j++) 
                colSum += mat[j][i]; 
  
            // check if every column sum is 
            // equal to prime diagonal sum 
            if (pri != colSum) 
                return false; 
        } 
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int mat[][] = {{ 2, 7, 6 }, 
                 { 9, 5, 1 }, 
                 { 4, 3, 8 }}; 

      if (isMagicSquare(mat)) 
         System.out.println("Magic Square"); 
      else
          System.out.println("Not a magic" + 
                              " Square"); 
} 

	}

