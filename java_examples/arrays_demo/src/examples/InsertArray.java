package examples;

public class InsertArray {

	public static void main(String[] args) {
		int ar[]=new int[10];
		ar[0]=99;
		ar[1]=22;
		ar[2]=11;
		ar[3]=23;
		int n=4; //element count
		System.out.println("Elements in array before insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		int newElement=100;
		int pos=5; //for user if it 1 then for dev it is 0
		
		for (int i = n; i >=pos; i--) {
			ar[i]=ar[i-1];
		}
		ar[pos-1]=newElement;
		n++;
		System.out.println("\nElements in array after insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
