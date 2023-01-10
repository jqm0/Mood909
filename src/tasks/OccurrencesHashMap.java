package tasks;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hMap = new HashMap<>();
		String [] names = {"Atyab", "Fatima", "Saeed", "Malak", "Fatima", "Daniyal", "Abdullah", "Abdullah"};
		for(String name : names) {
			if(hMap.containsKey(name)) {
				hMap.put(name ,hMap.get(name)+1);
			}
			else {
				hMap.put(name,1);
			}
		}
	

		for(Map.Entry<String, Integer> elemants : hMap.entrySet()) {
			System.out.println(elemants.getKey() + " is repeated " + elemants.getValue()+" Times");
		}
	}

}
