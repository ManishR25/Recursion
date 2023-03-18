package Recursion;

public class checkNumber {
	
	public static boolean numberCheck(int []input, int x) {
		if(input.length == 0) {
			return false;
		}
		
		if(input[0] == x ) {
			return true;
		}
		
		int [] remainArray = new int[input.length - 1];
		for(int i=1; i<input.length; i++) {
			remainArray[i - 1] = input[i];
		}
		 boolean isPresent = numberCheck(remainArray, x);
		 return isPresent;
	}

	

	public static void main(String[] args) {
		int [] arr = {2,3,1,7,5};
		int x=1;
		boolean cn=numberCheck(arr,x);
		System.out.println(cn);
	}

}
