package Recursion;

import java.util.Scanner;

public class stairCase {
	
	public static int stairCases(int n) {
		if(n < 0) {
			return 0;
		}
		
		if(n == 0) {
			return 1;
		}
		
		int ans = stairCases(n - 1) + stairCases(n - 2) + stairCases(n - 3);
		return ans;
	}

	public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println(stairCases(n));
	}

}
