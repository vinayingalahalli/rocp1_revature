package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("heyy");
		hs.add("java");
		hs.add("jee");
		hs.add("jme");
		hs.add("sql");
		hs.add("hibernate");
		hs.add(null);
		hs.add(null);
		hs.add("java");
		hs.add("jee");
		hs.add("mysql");
		System.out.println("hs - "+hs);
		
		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("heyy");
		lhs.add("java");
		lhs.add("jee");
		lhs.add("jme");
		lhs.add("sql");
		lhs.add("hibernate");
		lhs.add(null);
		lhs.add(null);
		lhs.add("java");
		lhs.add("jee");
		lhs.add("mysql");
		System.out.println("lhs - "+lhs);
		
		
		Set<String> ts = new TreeSet<>(); //ascending
		//Set<String> ts = new TreeSet<>(Collections.reverseOrder()); //descending
		ts.add("heyy");
		ts.add("java");
		ts.add("jee");
		ts.add("jme");
		ts.add("sql");
		ts.add("hibernate");
		//ts.add(null);
		//ts.add(null);
		ts.add("java");
		ts.add("jee");
		ts.add("mysql");
		System.out.println("ts = "+ts);
		//System.out.println(ts.);
		
		System.out.println(ts.size());
		System.out.println(ts.contains("heyy"));
		System.out.println(ts.contains("hello"));
		ts.remove("hibernate");
		System.out.println(ts);
		
		//addAll, retainAll, removeAll....
		
		for(String s:ts) {
			System.out.println(s.toUpperCase());
		}
	}

}
