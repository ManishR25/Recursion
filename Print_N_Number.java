package Recursion;

import java.util.Scanner;

public class Print_N_Number {
	
	public static void Nnumber(int n) {
		if(n == 0) {
			return;
		}
		
		Nnumber(n-1);
		System.out.print(n + " ");
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Nnumber(n);

	}

}
