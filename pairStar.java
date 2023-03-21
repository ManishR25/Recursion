package Recursion;

public class pairStar {
	
	public static String starPair(String str) {
		
		
		if(str.length() <= 1) {
			return str;
		}
		
		
		if(str.charAt(0) == str.charAt(1)) {
			String smallString = starPair(str.substring(1));
			return str.charAt(0) + "*" +  smallString;
		}else {
			String smallString = starPair(str.substring(1));
			return str.charAt(0) + smallString;
		}
		
	}

	public static void main(String[] args) {
		
		String str = "aaa";
		System.out.println(starPair(str));

	}

}
