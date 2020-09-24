package code_examples;

public class TitleCaseDemo {

	public static void main(String[] args) {
		String s="hello hi how are you doing today";
		
		String ar[]=s.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		
		System.out.println(sb.toString().trim());

	}

}

//Tasks
//Same example as above but try to covert every word's last letter to uppercase
