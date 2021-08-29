package com.java.recur;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,78,99};
		System.out.println(search(3,arr,0,arr.length-1));
	}

	private static int search(int number, int[] arr, int start, int end) {
		
		if(start == end) {
			if(number == arr[start]) {
				return start;
			}else {
				return -1;
			}
			
		}
		
		int mid = (start + end) /2;
		
		if(arr[mid]<number) {
			return search(number, arr, mid, end);
		}else if(arr[mid]>number) {
			return search(number, arr, start, mid);
		}else if(arr[mid] == number){
			return mid;
		}
		return 0;
	}

}
