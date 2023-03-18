package Recursion;

import java.util.Scanner;

public class numberOfDigit {
	
	public static int nod(int n) {
		int count = 0;
		if(n/10 == 0) {
			return 1;
		}
		int smallValue = nod(n / 10);
		int output = 1 + smallValue;
		
		
		return output;
		
	}

	public static void main(String[] args) {

             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
            
             int result = nod(n);
             System.out.println(result);
//             while(n > 0) {
//            	 int rem = n % 10;
//            	 count++;
//            	 n = n/10;
//             }
//             System.out.println(count);

	}

}
