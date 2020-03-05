
package practiceProblems;

import java.util.Arrays;

public class ArrayRotation {
     public static int[] arrayRotation(int arr[]) {
    	 
    	 int rotate_index=arr[0];
    	 int size=arr.length;
    	 int []rotate_arr=new int[size];
    	 int i=0;
    	 while(rotate_index<size)
    	 {
    		 rotate_arr[i]=arr[rotate_index];
    		 i++;
    		 rotate_index++;
    	 }
    	 rotate_index=0;
    	 while(rotate_index<arr[0]) {
    		 rotate_arr[i]=arr[rotate_index];
    		 i++;
    		 rotate_index++;
    	 }
		return rotate_arr;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {2,1,4,5,3,6};
      int[]result=arrayRotation(arr);
      System.out.println(Arrays.toString(result));

      }

}
