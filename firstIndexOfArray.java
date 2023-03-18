package Recursion;

public class firstIndexOfArray {
	
	//first approch
	public static int firstIndex(int []input, int num) {
		//int startIndex = 0;
		
		
		int startIndex = 0;
		while(startIndex < input.length) {
			if(input[startIndex] == num) {
				return startIndex;
			}else if(startIndex == input.length - 1){
				return -1;
			}
			else {
				startIndex++;
			}
		}

		int remainArray = firstIndex(input, num);
		return remainArray;
		
	}
	
	
	//second approch
	public static int firstIndexBetter(int[] input, int num, int si) {
		if(si == input.length) {
			return -1;
		}
		
		if(input[si] == num) {
			return si;
		}
		
		int remainIndex = firstIndexBetter(input,num,si + 1);
		return remainIndex;
	}

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int num = 20;
		int si=0;
		
		//calling first function
		System.out.println(firstIndex(arr,num));
		
		//calling second function
		System.out.println(firstIndexBetter(arr, num, si));
		
	}

}
