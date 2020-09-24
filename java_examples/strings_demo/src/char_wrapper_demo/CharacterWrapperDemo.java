package char_wrapper_demo;

public class CharacterWrapperDemo {

	public static void main(String[] args) {
	
		String s="Qkaj 199f8F -- 0G)( hFS +@ ";
		int alpha=0,upper=0,lower=0,digits=0,alphaNum=0,spaces=0,special=0;
		for (int i = 0; i < s.length(); i++) {
			
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alpha++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digits++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphaNum++;
			}
			if(Character.isWhitespace(c)) {
				spaces++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		}
		System.out.println("Total Alphabets Count : "+alpha);
		System.out.println("Total Upper Alphabets Count : "+upper);
		System.out.println("Total Lower Alphabets Count : "+lower);
		System.out.println("Total Digits Count : "+digits);
		System.out.println("Total Alpha-Numeric Count : "+alphaNum);
		System.out.println("Total Spaces Count : "+spaces);
		System.out.println("Total Special Characters Count : "+special);

	}

}
