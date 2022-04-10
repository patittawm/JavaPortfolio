package day38;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class City {

	public static void main(String[] args) {
		// TODO create map of K = String , V - Integer with name cities
		// pit these element into the map
		// {Arlington=229164, Leesburg=375629, Manassas=451721, Richmond=210309,
		// Alexandria=147391, Norfolk=245782}

		Map<String, Integer> cities = new HashMap<>();
		cities.put("Arlington", 229164);
		cities.put("Leesburg", 375629);
		cities.put("Manassas", 451721);
		cities.put("Richmond", 210309);
		cities.put("Alexandria", 147391);
		cities.put("Norfolk", 245782);

		System.out.println(cities);

		// TODO print each city in this format by iterating over the map
		// city: Arlington, population: 229164
		// keySet() - returns keys from the map
		System.out.println("-----city list-----");
		Set<String> keys = cities.keySet();
		for (String key : keys) {
			System.out.println("City : " + key + " , population : " + cities.get(key));
		}

		System.out.println("-----Bek city list-----");
		// Bek done like this คือไม่ใช้ Set ไม่ต้อง import set
		for (String key : cities.keySet()) {
			Integer val = cities.get(key);
			System.out.println("city: " + key + ", population: " + val);
		}
		System.out.println("----รวม pop------");

		// TODO get total population from cities map
		int totalPopulation = 0;
		for (int key : cities.values()) {
			totalPopulation += key;
		}
		System.out.println("Total population: " + totalPopulation);
		
		System.out.println("----Bek รวม pop------");
		//Bek done like this
		int total = 0;
		for(String key : cities.keySet()) {
			total += cities.get(key);
		}
		System.out.println("Total population: " + total);
		
		System.out.println("-----pop มากกว่า 3แสน-----");
		// TODO print city name with population more than 300000 from cities map
		for(String key : cities.keySet()) {
			if(cities.get(key) > 300000) {
				System.out.println(cities.get(key));
			}
		}
		System.out.println("-----Bek pop มากกว่า 3แสน-----");
		for(String key : cities.keySet()) {
			if(cities.get(key) > 300000) {
				System.out.println(key);
			}
		}
		System.out.println("----------");
	
		String biggestCity = "";
		int maxPopulation = 0;
		
		for(String key : cities.keySet()) {
			if(cities.get(key) > maxPopulation) {
				maxPopulation = cities.get(key);
				biggestCity = key;
			}
		}
		System.out.println("The biggest city is " + biggestCity + " with " + maxPopulation + " population.");
		//The biggest city is Manassas with 451721 population.
		System.out.println("----------");
		
		//TODO increase  poplution of each city by 999
		String incCity = "";
		int popInc = 0;
		for(String key : cities.keySet()) {
			 popInc = cities.get(key)-999;
			 incCity = key;
			// System.out.println(key);
			//System.out.println(popInc);
			 cities.put(key, popInc);
		}
		System.out.println(cities);// each value should be increased by 999
		
		
		
	}

}
