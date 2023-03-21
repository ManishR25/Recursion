package Recursion;

public class towerOfHanoi {
	
	public static void towerHanoi(int n, char src, char h, char dst) {
		
		if(n == 1) {
			System.out.println(src + " " + dst);
			return;
		}
		towerHanoi(n-1, src, dst, h);
		System.out.println(src + " " + dst);
		towerHanoi(n-1, h, src, dst);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		towerHanoi(3, 'a', 'h','b');

	}

}
