package ex3;

public class ValidatorMain {

	public static void main(String[] args) {
		
		Validator v=new Validator();
		try {
			if(v.isValidAge(36)) {
				System.out.println("Age Validated");
			}
		} catch (BusinessCheckedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			if(v.isValidMobileNumber("+1-1234567890")) {
				System.out.println("Mobile Number validated");
			}
		}catch(BusinessUncheckedException e) {
			System.out.println(e.getMessage());
		}

	}

}
