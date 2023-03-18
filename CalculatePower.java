package Recursion;

import java.util.Scanner;

public class CalculatePower {
	
	public static int power(int n, int k) {
		if(k == 0) {
			return 1;
		}
		
		int smallValue = power(n,k - 1);
		int output = n * smallValue;
		return output;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int pow = power(n,k);
		System.out.println(pow);
//		int power = 1;
//		for(int i=0; i<k; i++) {
//			power = power * n;
//		}
//		System.out.println(power);

	}

}
