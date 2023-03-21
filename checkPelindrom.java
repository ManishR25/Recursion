package Recursion;

public class checkPelindrom {
	
	public static boolean isPelindrom(String str) {
		
		if(str.length() <= 1) {
			return true;
		}
		else if(str.charAt(0) != str.charAt(str.length() - 1)) {
			return false;
		}
		else {
			return isPelindrom(str.substring(1, str.length() - 1));
		}
	}

	public static void main(String[] args) {

             String str = "abccb";
             boolean plndrm = isPelindrom(str);
             System.out.println(plndrm);

	}

}
