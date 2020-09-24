package char_wrapper_demo;

public class ValidateDLDemo {

	public static void main(String[] args) {
		/*
		 * First 2 uppercase letters
		 * and a - and
		 * Followed by 5 digits
		 * and a - and 1 uppercase letter
		 */
		String dL="AO-56783-D";
		boolean b=false;
		
		if(dL.length()==10 && Character.isUpperCase(dL.charAt(9)) && dL.charAt(8)=='-') {
			int upper=0;
			for (int i = 0; i < 2; i++) {
				if(Character.isUpperCase(dL.charAt(i))) {
					upper++;
				}
			}
			if(upper==2 && dL.charAt(2)=='-') {
				int digit=0;
				for (int i = 3; i < 8; i++) {
					if(Character.isDigit(dL.charAt(i))) {
						digit++;
					}
				}
				if(digit==5) {
					b=true;
				}
			}
		}
		
		if(b) {
			System.out.println(dL+" is a valid DL");
		}else {
			System.out.println(dL+" is a INVALID DL");
		}

	}

}
