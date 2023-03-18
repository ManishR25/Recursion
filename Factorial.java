package Recursion;

import java.util.Scanner;

public class Factorial {
	 public static int factorial(int n) {
    	 if(n == 0) {
    		 return 1;
    	 }
    	 int smallValue = factorial(n-1);
    	 int output = n * smallValue;
    	 
    	 return output;
     } 
	 
	 public static int sumn(int n) {
		 if(n == 0) {
			 return 0;
		 }
		 int smallValue = sumn(n - 1);
		 int output = n + smallValue;
		 return output;
	 }

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int fact = factorial(n);
		 int sum = sumn(n);
		 System.out.println(fact);
		 System.out.println(sum);
		 
		 

	}

}
