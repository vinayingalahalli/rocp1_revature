package eg1;

public class MobileV2 extends MobileV1 {

	public void socialApps() {
		System.out.println("Social N/wng apps from V2");
	}
	
	public void videoCalling() {
		System.out.println("Video calling from V2");
	}
	
	public void browsing() {
		System.out.println("Browsing from V2");
	}
	
	@Override
	public void displayMenu() {
		System.out.println("Menu in V2 updated to GRID view");
	}
}
/* When overriding
 *1)There should be parent and child relationship
 *2)Signature should be same in parent & child classes
 *3)We can upgrade the visibility/access modifiers levels or keep it same but cannot downgrade
 *4)private, static and final stuff of a parent cannot be overridden
 */
