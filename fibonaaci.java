package Recursion;

import java.util.Scanner;

public class fibonaaci {
	
	public static int fibonaci(int n){
		if(n == 1 || n==2) {
			return 1;
		}
		
		int fib_n_1 = fibonaci(n-1);
		int fib_n_2 = fibonaci(n-2);
		
		int output = fib_n_1 + fib_n_2;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fib = fibonaci(n);
		System.out.println(fib);

	}

}
