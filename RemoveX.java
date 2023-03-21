package Recursion;

public class RemoveX {
	
	public static String removeX(String str, char rm) {
		
		if(str.length() == 0) {
			return str;
		}
		
		String smallString = removeX(str.substring(1), rm);
		if(str.charAt(0) == rm) {
			return smallString;
		}else {
			return str.charAt(0) + smallString; 
		}
		
	}

	public static void main(String[] args) {

       String str = "BXXXXXXXXXXXXXXXXXXNSJHDSHZHXXXXXXXXXXXXGJHSGDHS";
       char rm = 'X';
       String newString = removeX(str,rm);
       System.out.println(newString);

	}

}
