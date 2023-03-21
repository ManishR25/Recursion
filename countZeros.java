package Recursion;

public class countZeros {
	
	public static int countZero(int n) {
		if(n==0) //Just to handle the case when n=0 
		{
			return 1;
		}
		if(n<10)//this is the actual base case
		{
			return 0;			
		}
		else if(n%10==0)
		{
			return 1+countZero(n/10);
		}
		return countZero(n/10);
	}
	

	public static void main(String[] args) {
		int n = 123000;
		System.out.println(countZero(n));

	}

}
