package eg1;

public class MobileMain {

	public static void main(String[] args) {
		
		MobileV3 v3=new MobileV3();
		System.out.println("Accessing props using V3");
		v3.calling();
		v3.camera();
		v3.gaming();
		v3.messaging();
		System.out.println(v3.getClass());
		System.out.println(v3.hashCode());
		
		MobileV1 v1=new MobileV1();
		System.out.println("\nAccessing props using V1");
		v1.calling();
		System.out.println(v1.getClass());
		System.out.println(v1.hashCode());
		

	}

}
