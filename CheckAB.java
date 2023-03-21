package Recursion;

public class CheckAB {
	
	public static boolean checkab(String input) {
		
		if(input.length() == 0) {
			return true;
		}
		
		if(input.charAt(0) == 'a' ){
			 if(input.substring(1).length() >  1 && input.substring(1,3).equals("bb")){
				 return checkab(input.substring(3));
			 }
			 else{
				 return checkab(input.substring(1));
			 }
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		String input = "abb";
		System.out.println(checkab(input));

	}

}
