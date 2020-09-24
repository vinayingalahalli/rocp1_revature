package example3;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n=Integer.parseInt(sc.nextLine());
		int ar[]=new int[n];
		System.out.println("Please enter "+n+" elements to sort them");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println("Arrays before sorting .....");
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		System.out.println("Arrays after sorting ascending .....");
		System.out.println(Arrays.toString(ar));
		
		System.out.println("Arrays after sorting descending");
		for (int i = ar.length-1; i >=0; i--) {
			System.out.print(ar[i]+" ");
		}
		
	}

}
