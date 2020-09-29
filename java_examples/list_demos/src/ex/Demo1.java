package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		li.add(999);
		li.add("heyyy");
		li.add("hii");
		li.add(true);
		li.add('c');
		li.add(23.333);
		li.add(678687687587587L);
		li.add(null);
		li.add(null);
		System.out.println(li);
		
		
		List<Integer> li1=new LinkedList<>();
		li1.add(12331);
		li1.add(321);
		li1.add(22);
		li1.add(11);
		li1.add(22);
		li1.add(22);
		li1.add(null);
		li1.add(null);
		li1.add(56);//insert at last
		System.out.println(li1);
		
		li1.add(1, 100); //insert at specific position
		System.out.println(li1);
		System.out.println(li1.size());
		System.out.println(li1.get(0)); //read
		System.out.println("With simple for loop");
		for (int i = 0; i < li1.size(); i++) {
			System.out.print(li1.get(i)+" ");//read
		}
		System.out.println("\nWitth for-each loop");
		for(Integer i:li1) {
			System.out.print(i+" "); //read
		}
		System.out.println();
		li1.set(0, 222); //update
		System.out.println(li1);
		Integer i=100;
		li1.remove(i);//deletion
		System.out.println(li1);
		Integer i1=22;
		while(li1.remove(i1)) {} //delete all
		System.out.println(li1);
		
		System.out.println(li1.contains(88));
		System.out.println(li1.contains(222));
		
		List<Integer> li2=new ArrayList<>(li1);
		System.out.println("li2 = "+li2);
		li2.addAll(li1);
		System.out.println("li2 = "+li2);
		li2.add(55);
		li2.add(66);
		li2.add(77);
		System.out.println("li2 = "+li2);
		System.out.println("li1 = "+li1);
		//li2.retainAll(li1); //common
		
		li2.removeAll(li1);
		System.out.println("li2 = "+li2);
		//System.out.println(null==null);
		
		li2.add(77);
		li2.add(null);
		li2.add(null);
		li2.add(44);
		li2.add(11);
		li2.add(11);
		
		System.out.println("li2 = "+li2);
		Collections.shuffle(li2);
		System.out.println("li2 = "+li2);
		Collections.reverse(li2);
		System.out.println("li2 = "+li2);
		
		Collections.replaceAll(li2, null, 0);
		System.out.println("li2 = "+li2);
		Collections.sort(li2);
		System.out.println("li2 = "+li2);
		Collections.sort(li2,Collections.reverseOrder());
		System.out.println("li2 = "+li2);
		
		
		Collections.sort(li2);
		System.out.println("li2(before binarySearch) = "+li2);
		System.out.println(Collections.binarySearch(li2, 22));
		System.out.println(Collections.binarySearch(li2, 11));
		
	}

}
