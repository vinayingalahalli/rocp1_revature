package switch_case_demo;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		int ch = 1;

		switch (ch) {
		case 1:
			System.out.println("Its Monday");

			break;
		case 2:
			System.out.println("Its Tuesday");
			break;
		case 3:
			System.out.println("Its Wednesday");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}
