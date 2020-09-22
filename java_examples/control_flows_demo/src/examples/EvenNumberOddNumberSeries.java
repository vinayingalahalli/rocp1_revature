package examples;

public class EvenNumberOddNumberSeries {

	public static void main(String[] args) {

		System.out.println("Printing all even numbers between 1 & 50");

		for (int i = 1; i < 51; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\n\nPrinting all odd numbers between 1 & 50");

		for (int i = 1; i < 51; i++) {
			if(i==3) {
				continue;
			}
			
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
