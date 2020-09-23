package examples;

public class Demo1 {
	//C(Create)R(Read)U(Update)D(Delete)

	public static void main(String[] args) {
		int ar[]= {10,22,33,11,10,10,11,22,44,22};
		System.out.println("Accessing array using for-each");
		for(int x:ar) {
			System.out.print(x+" ");
		}
		
		System.out.println("\n\nAccessing array using for looop");
		for (int i = 0; i < ar.length; i++) {
			System.out.print("ar["+i+"] = "+ar[i] +" ");
		}
		
		int ar1[]=new int[10];
		System.out.println("\n\nAccessing array ar1 using for looop");
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("ar1["+i+"] = "+ar1[i] +" ");
		}
		
		String ar2[]=new String[10];
		System.out.println("\n\nAccessing array ar2 using for looop");
		for (int i = 0; i < ar2.length; i++) {
			System.out.print("ar2["+i+"] = "+ar2[i] +" ");
		}
		ar2[0]="garey";
		ar2[1]="christen";
		ar2[3]="younus";
		System.out.println("\n\nAccessing array ar2 using for looop");
		for (int i = 0; i < ar2.length; i++) {
			System.out.print("ar2["+i+"] = "+ar2[i] +" ");
		}
		
		for (int i = 0; i < ar2.length; i++) {
			ar2[i]="myName-"+i;
		}
		System.out.println("\n\nAccessing array ar2 using for looop");
		for (int i = 0; i < ar2.length; i++) {
			System.out.print("ar2["+i+"]="+ar2[i] +" ");
		}

		System.out.println("\n\nExample");
		String[] emp_id = new String[100];
		for (int i = 0; i<100; i++){
			//int idnum = i+100;
			emp_id[i] = "ID#"+(i+100);
			System.out.println(emp_id[i]);
		}

	}

}
