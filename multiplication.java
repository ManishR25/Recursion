package Recursion;

import java.util.Scanner;

public class multiplication {
	
	public static int multiplication(int m, int n) {
		
		if(n==1) //base case prove for small small cases in pmi
		{
			return m;
		}
		return m+multiplication(m, n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(multiplication(m,n));

	}

}
