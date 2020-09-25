package eg1;

public class MobileMain {

	public static void main(String[] args) {
		MobileV2 v2=new MobileV2();
		v2.browsing();
		v2.calling();
		v2.displayMenu();
		v2.messaging();
		v2.socialApps();
		System.out.println(v2.hashCode());
		System.out.println(v2.getClass());
		
		
		MobileV1 v1=new MobileV2();
		v1.displayMenu();

	}

}
