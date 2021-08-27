package com.java.recur;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println(fibo(9));

	}

	private static int fibo(int n) {
		if(n<1) {
			System.out.println("Fibonaci series shoudn't contain negetive number!");
			return 0;
		}
		if(n == 1|| n== 2) {
			return (n-1);
		}
		return fibo(n-1) + fibo(n-2);
	}

}
