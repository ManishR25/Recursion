package Recursion;

public class isArraySorted {

	public static boolean isArraySorted(int [] arr) {
		
		if(arr.length == 1) {
			return true;
		}
		
		if(arr[0] > arr[1]) {
			return false;
		}
		
		int []smallArray = new int[arr.length - 1];
		for(int i=1; i<arr.length; i++) {
			smallArray[i - 1] = arr[i];
		}
		
		boolean isSmallArraySorted = isArraySorted(smallArray);
		return isSmallArraySorted;
	}
	
	public static boolean isArraySortedBetter(int [] arr, int startIndex) {
		
		if(startIndex == arr.length - 1) {
			return true;
		}
		
		if(arr[startIndex] > arr[startIndex + 1]) {
			return false;
		}
		
		boolean isSmallArraySorted = isArraySortedBetter(arr, startIndex + 1);
		return isSmallArraySorted;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int si=0;
		boolean isSort = isArraySorted(arr);
		System.out.println(isSort);
		boolean isSortBetter = isArraySortedBetter(arr, si);
		System.out.println(isSortBetter);

	}

}
