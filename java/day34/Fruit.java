package day34;

import java.util.ArrayList;

public class Fruit {

	public static void main(String[] args) {
		// Create an ArrayList<String>fruits
		// add any 4 element(fruit names)
		// print each value in the new line by ustin a loop

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("orange");

		System.out.println(fruits); //[apple, banana, kiwi, orange]

		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(i + " " + fruits.get(i));
		}

		for (String str : fruits) {
			System.out.println(str);
		}
		System.out.println("----------");

		// make Uppercase set(index, newValue);

		fruits.set(0, fruits.get(0).toUpperCase());
		System.out.println(fruits);// [APPLE, banana, kiwi, orange]
		
		System.out.println("----------");

		// Write a code to make all elements of list upper case.
		// size จะบอกถึงใน element ว่ามีกี่ element เหมือนกับ length
		for (int i = 0; i < fruits.size(); i++) {
			fruits.set(i, fruits.get(i).toUpperCase());
		}

		System.out.println(fruits); // [APPLE, PEAR, KIWI, ORANGE]
	}

}
