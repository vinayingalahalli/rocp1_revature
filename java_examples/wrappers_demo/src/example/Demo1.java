package example;

public class Demo1 {

	public static void main(String[] args) {
		Integer i1=10;//common pool
		Integer i2=10;//common pool
		Integer i3=new Integer(10); //heap
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		//i1++;
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		
		System.out.println("i1.equals(i2) : "+i1.equals(i2));
		System.out.println("i1.equals(i3) : "+i1.equals(i3));
		
		/*
		 * public int obj1.compareTo(obj2) - used for sorting, it is available in all the wrapper classes & String class
		 * if value of obj1 is equals to the value of obj2 it will return 0 
		 * if value of obj1 is greater than value of obj2 it will return positive value
		 * if value of obj1 is smaller than value of obj2 it will return -ve value
		 */
		Integer i4=99;
		System.out.println("i4.compareTo(99) : "+i4.compareTo(99));
		System.out.println("i4.compareTo(9) : "+i4.compareTo(9));
		System.out.println("i4.compareTo(999) : "+i4.compareTo(999));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int x=i4; //Autoboxing
		System.out.println("x : "+x);
		
		x=10000;
		i4=x; //Autoboxing
		System.out.println("i4 : "+i4);
		
		String s="12443";
		
		int a=Integer.parseInt(s);  //Common across all the wrappers except Character
		System.out.println("a = "+a);
		
		a=1919191;
		s=a+"";//anything in java can be converted to the String by just doing this
		System.out.println("s : "+s);
		
		Integer i5=77;
		Float f=i5.floatValue(); //doubleValue() //shortValue() //longValue()
		System.out.println("f = "+f);
		int r=f.intValue();
		System.out.println("r : "+r);

	}
	
	//Task here : Immitate the above with Float, Long and Double classes respectively

}
