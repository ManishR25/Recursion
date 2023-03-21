package Recursion;

public class replacePi {

	public static String replacePI(String str) {
		
		if(str.length() <= 1) {
			return str;
		}
		
		if(str.charAt(0) == 'p' && str.charAt(1)  == 'i') {
			String smallString = replacePI(str.substring(2));
			return "3.14" + smallString;
		}
		else {
			String smallString = replacePI(str.substring(1));
			return str.charAt(0) + smallString;
		}
	}
	
	public static void main(String[] args) {
		
		String str = "apiapibpi";
		String replaceString = replacePI(str);
		System.out.println(replaceString);

	}

}
