package examples;

import java.util.Arrays;

public class ArraysUtilityClassDemo {

	public static void main(String[] args) {
		int ar[]= {10,22,33,11,10,10,11,22,44,22,77};
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));//to print the contents of Array
		
		Arrays.sort(ar);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(ar));

		int ar2[]=Arrays.copyOf(ar, ar.length+5);
		System.out.println("ar2 = "+Arrays.toString(ar2));
		
		//For searching binarySearch() ->prerequisite for binarySearch is your array elements should and must be arranged in
		//ascending order only
		System.out.println(Arrays.binarySearch(ar, 1000));
		System.out.println(Arrays.binarySearch(ar, 22));
	}

}
