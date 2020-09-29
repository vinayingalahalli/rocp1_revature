package eg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo1 {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<>();
		hm.put(100, "hello"); 
		hm.put(100, "updated");
		hm.put(201, "hello");
		hm.put(99, "hello");
		hm.put(44, "java");
		hm.put(1444, "jee");
		hm.put(404, "jme");
		hm.put(4774, "jse");
		hm.put(49904, null);
		hm.put(63904, null);
		hm.put(500, "jme");
		hm.put(690, "jse");
		System.out.println("Map before deletion");
		System.out.println(hm);
		
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getKey()%10==0) {
//				hm.remove(e.getKey());
//			}
//		}
		Iterator<Entry<Integer, String> > i=hm.entrySet().iterator(); 
		//Note: If it is list or set or queue you can assign it to iterator object by just doing 
		//listobj.iterator() for List and setobj.iterator() for Set and queueObj.iterator() for Queue
		while(i.hasNext()) {
			Entry<Integer, String>  e=i.next();
			if(e.getKey()%10==0) {
				i.remove();
			}
		}
		System.out.println("Map after deletion");
		System.out.println(hm);
	}
/*
 * Enumerator -> read from top to bottom
 * Iterator -> read and remove from top to bottom
 * ListIterator(List) ->add,read,remove and is bidirectional
 */
}
