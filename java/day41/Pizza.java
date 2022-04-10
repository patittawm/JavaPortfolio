package day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; // Pizza1

public class Pizza {
	private final String[] availableTopping = {"cheese", "pepperoni", "chicken", "bacon"};
	private List<String> toppings;
	
	public Pizza() {
		toppings = new ArrayList<>();
	}
	
	public void addTopping(String topping) {
		if (Arrays.asList(availableTopping).contains(topping.toLowerCase())) {
			toppings.add(topping);
		} else {
			System.out.println("This topping is not available : " + topping);
		}
	}
	// when we are encapsulating mutable objects and arrays.
	// we always need to return the copy of the object in the getter.
	//สำหรับเพิ่มแต่ต้องให้ผ่านมาจาก private List<String> toppings; จากด้านบน ถึงจะรู้จักกัน
	public List<String> getToppings(){
		//return toppings; // we shouldn't return original reference
		return new ArrayList<>(toppings);// ใช้อันนี้ แล้วแอดด เพิ่ม ไม่ได้
	}
}
