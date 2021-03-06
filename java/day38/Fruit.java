package day38;

import java.util.HashMap;
import java.util.Map;

public class Fruit {

	public static void main(String[] args) {
		// Map is key value data structure.
		// Map is not part of the collections because it doesn't extend Collections or
		// Iterable,
		// but still java provides Map as ready API for us to use.
		// Each element of the map referred as entity.
		// Map works with Object only for keys and values
		// Map<K, V>
		// K - data type for Key
		// V - data type for Value
		Map<String, Double> fruit = new HashMap<>();

		fruit.put("Orange", 1.05);
		fruit.put("Mango", 0.5);
		fruit.put("Apple", 0.76);
		fruit.put("Lemon", 1.47);
		fruit.put("Watermelon", 3.28);
		fruit.put("Banana", 1.49);

		System.out.println(fruit);// {Apple=0.76, Watermelon=3.28, Mango=0.5, Orange=1.05, Lemon=1.47,
									// Banana=1.49}

		// User get(K) method to get the value
		// get(K) return null if key doesn't exit(or match)

		Double lemonPrice = fruit.get("Lemon");
		System.out.println("Price of Lemon: " + lemonPrice);// Price of Lemon: 1.47
		System.out.println("Price of Mango: " + fruit.get("Mango"));// Price of Mango: 0.5

		// Get sum of price for Orange, Apple, and Mango
		Double sum = fruit.get("Orange") + fruit.get("Apple") + fruit.get("Mango");
		System.out.println("Sum of Orange, Apple, and Mango: " + sum); //Sum of Orange, Apple, and Mango: 2.31

		// containsKey(K) returns true if key is in the map, otherwise false
		boolean b = fruit.containsKey("Kiwi");
		System.out.println("Key 'Kiwi' is in the map? " + b);

		// containsValue(V) returns true if value exist in the map, otherwise false
		System.out.println(fruit.containsValue(1.39)); // true
		System.out.println("---------");

		// remove(K) removes the element
		System.out.println(fruit);// {Apple=0.76, Watermelon=3.28, Mango=0.5, Orange=1.05, Lemon=1.47,
									// Banana=1.49}
		fruit.remove("Mango");
		System.out.println(fruit);// {Apple=0.76, Watermelon=3.28, Orange=1.05, Lemon=1.47, Banana=1.49}
		// change the value of the element(K, V)
		// Map does not allow duplicate keys.
		// if we use put(K, V) with same K then it will override old one.
		// ??????????????????????????????????????????????????? ?????? element ???????????????????????? ????????????????????????????????? element ???????????? orange and
		// Orange
		fruit.put("Orange", 95.5);
		System.out.println(fruit);

		fruit.put("Apple", 0.85);
		System.out.println(fruit);
		System.out.println("----------");
	}

}
