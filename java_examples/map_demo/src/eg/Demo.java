package eg;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		
		
		Map<Integer, String> hm=new HashMap<>();
		hm.put(100, "hello"); //put works both as insert & update
		hm.put(100, "updated");
		hm.put(201, "hello");
		hm.put(99, "hello");
		hm.put(44, "java");
		hm.put(1444, "jee");
		hm.put(404, "jme");
		hm.put(4774, "jse");
		hm.put(null, "java");
		hm.put(49904, null);
		hm.put(63904, null);
		System.out.println("hm : "+hm);
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(100, "hello"); //put works both as insert & update
		lhm.put(100, "updated");
		lhm.put(201, "hello");
		lhm.put(99, "hello");
		lhm.put(44, "java");
		lhm.put(1444, "jee");
		lhm.put(404, "jme");
		lhm.put(4774, "jse");
		lhm.put(null, "java");
		lhm.put(49904, null);
		lhm.put(63904, null);
		System.out.println("lhm : "+lhm);
		
		
		Map<Integer, String> tm=new TreeMap<>();
		tm.put(100, "hello"); //put works both as insert & update
		tm.put(100, "updated");
		tm.put(201, "hello");
		tm.put(99, "hello");
		tm.put(44, "java");
		tm.put(1444, "jee");
		tm.put(404, "jme");
		tm.put(4774, "jse");
		//tm.put(null, "java");
		tm.put(49904, null);
		tm.put(63904, null);
		System.out.println("tm : "+tm);
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(100, "hello"); //put works both as insert & update
		ht.put(100, "updated");
		ht.put(201, "hello");
		ht.put(99, "hello");
		ht.put(44, "java");
		ht.put(1444, "jee");
		ht.put(404, "jme");
		ht.put(4774, "jse");
		//ht.put(null, "java");
		//ht.put(49904, null);
		//ht.put(63904, null);
		System.out.println("ht : "+ht);
		
		System.out.println(ht.size());
		System.out.println(ht.containsKey(111));
		System.out.println(ht.containsValue("jee"));
		
		System.out.println(ht.get(100));
		System.out.println(ht.get(199999));
		
		ht.remove(100); //removes both K,V pair
		System.out.println(ht);
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		System.out.println("\nIterating map method - 1");
		Set<Integer> hs=ht.keySet();
		for(Integer i:hs) {
			System.out.println("Key = "+i+" Value = "+ht.get(i));
		}
		System.out.println("\nIterating map method - 2(preffered)");
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("Key -> "+e.getKey()+" Value -> "+e.getValue());
		}
	}

}
