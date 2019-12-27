package com.string;

import java.util.Arrays;

public class SumNearZero {

	static int closestSum(int[] a)
	{
		Arrays.sort(a);
		int lowerIndex=0;
		int higherIndex=a.length-1;
		
		int negative=Integer.MIN_VALUE;
		int positive=Integer.MAX_VALUE;
		
		while(lowerIndex<higherIndex)
		{
			int temp=a[lowerIndex]+a[higherIndex];
			
			if(temp>0) {
				if(positive>temp) {
					positive=temp;
				}
				higherIndex--;
			}else if(temp<0) {
				if(negative<temp) {
					negative=temp;
				}
				lowerIndex++;
			}else {
				return 0;
			}
				
		}
		
		return Math.min(Math.abs(positive),Math.abs(negative));
	}
	public static void main(String[] args) {
		int[] a= {-1,-2,3,5,8,-4};
         System.out.println("closest sum is "+SumNearZero.closestSum(a));
	}

}
