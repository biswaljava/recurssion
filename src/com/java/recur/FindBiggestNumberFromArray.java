package com.java.recur;

public class FindBiggestNumberFromArray {
	
	static int highest = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,78,99};
		biggestNumber(arr,arr.length-1);
		System.out.println("Highest-->"+highest);
	}

	private static int biggestNumber(int[] arr, int length) {
		
		if(length == -1 ) {
			return highest;
		}
		
		if(arr[length] > highest) {
			highest = arr[length] ;
		}
		
		return biggestNumber(arr,  length-1);
				
	}

}
