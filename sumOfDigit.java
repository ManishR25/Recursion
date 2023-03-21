package Recursion;

public class sumOfDigit {
	
	public static int sumOfDigit(int n) {
		
		if(n == 0) {
			return 0;
		}
	
		int rem = n % 10;
        int smallValue = sumOfDigit(n / 10) + rem;
        
        return smallValue;
	}

	public static void main(String[] args) {

          int n = 1234;
          System.out.println(sumOfDigit(n));

	}

}
