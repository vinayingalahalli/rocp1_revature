package regex;

public class ValidateDlRegExStyle {

	public static void main(String[] args) {
		/*
		 * First 2 uppercase letters
		 * and a - and
		 * Followed by 5 digits
		 * and a - and 1 uppercase letter
		 */
		String dL="AO-56783-Q";
		if(isValideDL(dL)) {
			System.out.println(dL+" VALIDATED");
		}else {
			System.out.println(dL+" is INVALID");
		}
	}
	
	public static boolean isValideDL(String dL) {
		if(dL.matches("[A-Z]{2}-[0-9]{5}-[A-Z]{1}")) {
			return true;
		}else {
			return false;
		}
	}

}
//+1-9123456780
//"\\+1-[0-9]{10}" when using meta characters make sure you use \\behind the meta character to avoid any error



/*
 * Validate all the IDs you have
 * -SSN
 * -DLNo
 * -Area pin code
 * -Car License plate
 */


