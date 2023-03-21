package Recursion;

public class removeDuplicateRecursively {
	
	public static String removeDuplicate(String s) {
		
		 if (s.length() == 1)
	            return s;
	        if (s.charAt(0) == s.charAt(1))
	            return removeDuplicate(s.substring(1));
	        else
	            return s.charAt(0)+ removeDuplicate(s.substring(1));
	}

	public static void main(String[] args) {
	
		String str = "aaaaabbbbccc";
		String updatedString = removeDuplicate(str);
		System.out.println(updatedString);

	}

}
