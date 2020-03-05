package practiceProblems;

public class MaxHeap {

	 static boolean isHeap(int arr[]) { 
		// If a leaf node  
		 int n = arr.length-1;
		 int i=arr[0];
		        if (i > (n - 2) / 2) { 
		            return true; 
		        } 
		  
		// If an internal node and is greater than its children, and  
		// same is recursively true for the children  
		        if (arr[i] >= arr[2 * i + 1] && arr[i] >= arr[2 * i + 2] 
		                && isHeap(arr, 2 * i + 1, n) && isHeap(arr, 2 * i + 2, n)) { 
		            return true; 
		        } 
		  
		        return false; 
		    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {90, 15, 10, 7, 12, 2, 7, 3}; 
	         
	        if (isHeap(arr)) { 
	            System.out.println("Yes"); 
	        } else { 
	            System.out.println("No"); 
	        } 
	    } 

	}

