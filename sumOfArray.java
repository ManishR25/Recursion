package Recursion;

public class sumOfArray {
	
	public static int arraySum(int[]arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		
		int [] smallSum = new int[arr.length - 1];
		for(int i=1; i<arr.length; i++) {
			smallSum[i - 1] = arr[i]; 
		}
		int sum=0;
	    sum = arr[0] + arraySum(smallSum);
	    return sum;
	}

	public static void main(String[] args) {

          int [] arr= {1,2,3,4,5};
          int sum = arraySum(arr);
          System.out.println(sum);

	}

}
