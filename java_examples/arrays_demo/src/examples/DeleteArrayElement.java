package examples;

public class DeleteArrayElement {

	public static void main(String[] args) {
		int ar[] = new int[100];
		ar[0] = 99;
		ar[1] = 22;
		ar[2] = 11;
		ar[3] = 23;
		int n = 4; // element count
		System.out.println("Elements in array before deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		int pos = 4;
		
		for (int i = pos-1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		System.out.println("\nElements in array after deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		//System.out.println("\n"+ar.length);
		
	}

}
