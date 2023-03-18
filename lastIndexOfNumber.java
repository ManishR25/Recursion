package Recursion;

public class lastIndexOfNumber {
	
	//first approch
	public static int lastIndex(int [] input, int x) {
		
		int lastIndex = input.length - 1;
		while(lastIndex >= 0) {
			if(input[lastIndex] == x) {
				return lastIndex;
			}else if(lastIndex == 0){
				return -1;
			}
			else {
				lastIndex--;
			}
		}

		int remainArray = lastIndex(input, x);
		return remainArray;
	}
	
	//second approch
	public static int lastIndexBetter(int[] input, int num, int si) {
		if(si == 0) {
			return -1;
		}
		
		if(input[si] == num) {
			return si;
		}
		
		int remainIndex = lastIndexBetter(input,num,si - 1);
		return remainIndex;
	}

	public static void main(String[] args) {

        int [] arr = {1,1,1,2,2,3,4,5,6,6};
        int x=8;
        int si=arr.length - 1;
        System.out.println(lastIndex(arr,x));
        System.out.println(lastIndexBetter(arr,x,si));
		
	}

}
