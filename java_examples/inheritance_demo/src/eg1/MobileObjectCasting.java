package eg1;

public class MobileObjectCasting {

	public static void main(String[] args) {
		
		/*
		 * Object Casting:
		 * 1)Its possible only and only between the parent & child relationship only
		 * 2)If there is no relationship of if the child object is not created and you try to convert your parent
		 *   object to Child class it will throw unchecked ClassCastException
		 * 3)Conversion between siblings is not possible
		 * 
		 * Types of Casting
		 * 1)Implicit  Casting(Done by compiler) -   where child class object can be assigned to any parent class 
		 * 							implicitly, but remember this doesnt mean that the parent will be able to access any 
		 * 							child methods until if any method is overridden from the parent.
		 * 2)Explicit Casting(Done by developer) - explicitly converting the reference of a parent to the child.
		 *
		 */

		//MobileV3 v3=new MobileV1(); //calling() & all the methods of Object Class -> ClassCastException
		//MobileV1 v1=new MobileV3(); //MobileV3,MobileV2,MobileV1,Object -> ImplicitCasting
		
		MobileV1 v1=new MobileV3(); //here v1 is not called as object it is called as reference variable
		System.out.println(v1.getClass());
		v1.calling();
		
		MobileV2 v2=(MobileV2)v1; //v2 is also still a reference variable
		v2.calling();
		v2.gaming();
		v2.messaging();
		
		MobileV3 v3=(MobileV3)v2; //v3 is an object
		v3.calling();
		v3.camera();
		v3.videoCalling();
		v3.messaging();
		v3.gaming();
		
		//float f=99.999f;
		//int x=(int)f;
		
	}

}
