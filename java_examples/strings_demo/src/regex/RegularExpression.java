package regex;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * Reg-Ex(Regular Expression)
		 * PMA- Pattern Matching Algorithm
		 * -uses wild cards to check the pattern of your string and can validate with it
		 * 
		 * [] - represents expression
		 * {} - represents length
		 * ^ - represents not
		 * a-z - represents all the lowercase letters 
		 * 0-9 - specifies digits
		 * 
		 * [A-Z]{5} - any Uppercase word of length 5 is validated with this expression
		 * [A-Za-z]{5} - any word of length 5 is validated with this expression
		 * [^A-Za-z] - it can be anything but not letters
		 * [A-Z]{1,} - atleast 1 uppercase letter
		 */
		
		String s="Qkaj 199f8F -- 0G)( hFS +@ ";
		
		System.out.println(s.replaceAll("[^A-Za-z]", ""));
		System.out.println(s.replaceAll("[^A-Za-z]", "").length());
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(s.replaceAll("[ A-Za-z0-9]", ""));

	}

}
