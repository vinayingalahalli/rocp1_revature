package ex3;

public class Validator {

	public boolean isValidMobileNumber(String mobileNumber) throws BusinessUncheckedException{
		if(!mobileNumber.matches("\\+1-[0-9]{10}")) {
			throw new BusinessUncheckedException("Entered Mobile number "+mobileNumber+" is Invalid");
		}
		
		return true;
	}
	
	
	public boolean isValidAge(int age) throws BusinessCheckedException {
		if(age<=0) {
			throw new BusinessCheckedException("age cannot be negative or zero");
		}
		if(age<18 || age >35) {
			throw new BusinessCheckedException("sorry we only take users between age 18 and 35");
		}
		return true;
	}
}
