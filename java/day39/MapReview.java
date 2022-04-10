package day39;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapReview {

	public static void main(String[] args) {
		//Map is key value data structure where keys are uniqe
		//Map<K,V>
		Map<String, Double> students = new HashMap<>();
		students.put("John", 90.5);
		students.put("Smith", 60.0);
		students.put("Alex", 95.5);
		students.put("Mish", 100.0);
		
		System.out.println(students);
		
		//get(K) it returns value by key
		Double score = students.get("Alex");
		System.out.println("Alex's score : " + score);
		
		// remove(K) it removes element from the map by key
		students.remove("John");
		System.out.println(students);//{Alex=95.5, Mish=100.0, Smith=60.0}
		
		//containsKwy(K)
		System.out.println("Is Misha in the map : " + students.containsKey("Misha"));
		
		//containsValue(V)
		System.out.println("Do we have 100.0 as score(value) :  " + students.containsValue(100.0));
		System.out.println(students);//{Alex=95.5, Mish=100.0, Smith=60.0}
		
		//map's key are unique
		//when we try to put existing key with new value, it overrides the old element value
	
		students.put("Smith", 70.0);
		
		System.out.println(students);
		
		Set<String> keys = students.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		System.out.println("----------");
		
		//values() will return all values inside map as Collection
		Collection<Double> values = students.values();
		System.out.println(values.size());
		
		for(Double val : values) {
			System.out.println(val);
		}
		System.out.println("----------");
		
		//How to iterate
		for (String key : students.keySet()) {
			System.out.println("Student: " + key +", score: " + students.get(key));
		}
		
		
	}

}
