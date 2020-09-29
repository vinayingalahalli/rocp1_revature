package eg;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Demo2 {

	public static void main(String[] args) {
		
		Map<Country, List<State>> countryMap=new LinkedHashMap<>();
		
		List<State> stateListIndia=new ArrayList<>();
		stateListIndia.add(new State(100, "Karnataka"));
		stateListIndia.add(new State(101, "TamilNadu"));
		stateListIndia.add(new State(102, "Gujarath"));
		
		countryMap.put(new Country(7777, "INDIA"), stateListIndia);
		
		List<State> stateListUSA=new ArrayList<>();
		stateListUSA.add(new State(200, "Texas"));
		stateListUSA.add(new State(201, "Florida"));
		stateListUSA.add(new State(202, "Virginia"));
		
		countryMap.put(new Country(7778, "USA"), stateListUSA);
		
		System.out.println("Printing country with their states");
		
		for(Entry<Country, List<State>>c:countryMap.entrySet()) {
			System.out.println("Country - "+c.getKey().getName());
			List<State> stateList=c.getValue();
			for(State s:stateList) {
				System.out.println("-"+s.getName());
			}
		}

	}

}
