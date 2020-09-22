package examples;

public class PrimeSeries {

	public static void main(String[] args) {
		PrimeSeries s=new PrimeSeries();
		s.generatePrimeNumbers(50, 100);
		s.generatePrimeNumbers(5000, 5500);
	}
	
	public void generatePrimeNumbers(int m,int n) {
		System.out.println("Prime numbers between "+m+" and "+n);
		for (int i = m; i <n; i++) {
			//int val=i;
			int c=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(i);
			}
		}
	}

}
