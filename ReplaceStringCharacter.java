package Recursion;

public class ReplaceStringCharacter {
	
	public static String replaceCharacter(String str, char a, char b) {
		
		if(str.length() == 0) {
			return str;
		}
		
		String smallOutput = replaceCharacter(str.substring(1), a, b);
		if(str.charAt(0) == a) {
			return b + smallOutput;
		}else {
			return str.charAt(0) + smallOutput;
		}
		
	}

	public static void main(String[] args) {
		
		String str = "ABCD";
		char a='C';
		char b='E';
		String replaceString = replaceCharacter(str,a,b);
		System.out.println(replaceString);
		//System.out.println(str.substring(1));
		

	}

}
