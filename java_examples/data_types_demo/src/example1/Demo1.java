package example1;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * Data type - where you are asking java to allocate some memory for you to hold some values within it
		 * 
		 * Java provides 8 primitive data types with default values to it....
		 * 
		 * dataType			size			defaultValue
		 * -------------------------------------------------
		 * byte				1byte				0
		 * short			2bytes				0
		 * int				4bytes				0
		 * long				8bytes				0
		 * 
		 * float			4bytes				0.0000f
		 * double			8bytes				0.0000d   in java any decimal values will by default be considered as double
		 * 
		 * char				2bytes				'\u00000' (uni-code charset) supports 17 country languages
		 * boolean 			1bit				false
		 */

		
		int x=100;
		System.out.println("value of x = "+x);
		
		float f1=12.344f; //32 bit
		System.out.println("value of f1 = "+f1);
		
		double d1=889.99d; // 64 bit
		System.out.println("value of d1 = "+d1);
		
		String s="Vinay";
		System.out.println("Helloooo "+s);
		
		char c='H';
		System.out.println("value of c is "+c);
		
		long l=1234567890L;
		System.out.println("Value of l is "+l);
		
		boolean b=true;
		System.out.println("value of b is "+b);
		
		
	}

}
