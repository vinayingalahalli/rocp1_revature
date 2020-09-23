package ex1;

public class Demo1 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		System.out.println("s1.hashCode() = "+s1.hashCode());
		System.out.println("s2.hashCode() = "+s2.hashCode());
		System.out.println("s3.hashCode() = "+s3.hashCode());
		System.out.println("address of s3 = "+System.identityHashCode(s3));
		System.out.println("address of s2 = "+System.identityHashCode(s2));
		System.out.println("address of s1 = "+System.identityHashCode(s1));
		
		
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1==s3 : "+(s1==s3));
		
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		
		System.out.println("s1.equals(\"HELLO\") : " +s1.equals("HELLO"));
		
		System.out.println("s1.equalsIgnoreCase(\"HELLO\") : " +s1.equalsIgnoreCase("HELLO"));
		
		System.out.println("s1.length() : "+s1.length());
		
		System.out.println("Accessing character by character from s1");
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("s1.contains(\"ll\") : "+s1.contains("ll"));
		System.out.println("s1.contains(\"lol\") : "+s1.contains("lol"));
		System.out.println("s1.contains(\"llo\") : "+s1.contains("llo"));
		
		System.out.println("s1.substring(1) : "+s1.substring(1));
		
		System.out.println("s1.substring(1,4) : "+s1.substring(1,4));
		
		String s="hello hii good afternoon  everyone";
		s=s.replaceAll("  ", " ");
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			if(i%2==0) {
			System.out.println(ar[i].toUpperCase());
			}else {
				System.out.println(ar[i]);
			}
		}
		
		System.out.println("s1.toUpperCase() : "+s1.toUpperCase());
		System.out.println("s1 : "+s1);
		System.out.println("HELLO.toLowerCase() : "+"HEllO".toLowerCase());
		
		String s4="          fdkjhdsfkhdfkdshfkjdsf         ";
		System.out.println("s4 : "+s4);
		System.out.println("s4.trim() : "+s4.trim());
		
		

	}

}
