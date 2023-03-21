package Recursion;

public class quickSort {
	
	public static int partition(int []input, int si, int ei) {
		int pivotElement = input[si];
		int smallerCount = 0;
		
		for(int i=si + 1; i <= ei; i++) {
			if(input[i] < pivotElement) {
				smallerCount++;
			}
		}
		int temp = input[si + smallerCount];
		input[si + smallerCount] = pivotElement;
		input[si] = temp;
		
		int i = si;
		int j = ei;
		
		while(i < j) {
			if(input[i] < pivotElement) {
				i++;
			}
			else if(input[j] >= pivotElement) {
				j--;
			}else {
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		return si + smallerCount;
		
	}
	
	public static void quickSort(int []input, int si, int ei) {
		if(si >= ei) {
			return;
		}
		
		int pivotIndex = partition(input, si, ei);
		quickSort(input, si, pivotIndex - 1);
		quickSort(input, pivotIndex + 1, ei);
		
	}

	public static void main(String[] args) {
		 int []arr = {10,4,5,9,8,6,12,11,7};
         quickSort(arr,0,arr.length - 1);
         for(int i = 0; i < arr.length; i++) {
       	  System.out.print(arr[i] + " ");
         }
        
	}

}
