package code_examples;

public class Palindrome {

	public static void main(String[] args) {
		String s="madaM";
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=sb.toString();
		
		if(s.equals(s1)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		
		if(new StringBuffer(s.toLowerCase()).reverse().toString().equals(s.toLowerCase())) {
			System.out.println("Yep its palindrome");
		}else {
			System.out.println("No its not palindrome");
		}
		
		int x=1211;
		if(new StringBuffer(x+"").reverse().toString().equals(x+"")) {
			System.out.println("Yep its numerical palindrome "+x);
		}else {
			System.out.println("No its not numerical palindrome "+x);
		}
		
		int y=1211;
		if(isPalindrome(y+"")) {
			System.out.println("Yep its numerical palindrome "+y);
		}else {
			System.out.println("No its not numerical palindrome "+y);
		}
		
		if(isPalindrome("GADAG")) {
			System.out.println("Yep its  palindrome ");
		}else {
			System.out.println("No its not  palindrome ");
		}
		
	}
	
	public static boolean isPalindrome(String s) {
		boolean b=false;
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			b=true;
		}
		return b;
	}

}
