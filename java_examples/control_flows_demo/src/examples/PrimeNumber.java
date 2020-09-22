package examples;

public class PrimeNumber {

	public static void main(String[] args) {
	
		PrimeNumber pm=new PrimeNumber();
		if(pm.isValidPrime(2)) {
			System.out.println("Yes Prime");
		}else {
			System.out.println("No Prime");
		}

	}
	
	public boolean isValidPrime(int value) {
		boolean b=false;
		int c=0;
		for (int i = 1; i <=value; i++) {
			if(value%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		
		return b;
	}

}
