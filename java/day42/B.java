package day42;

import java.util.ArrayList;
import java.util.List;

public class B extends A{ // B2
	//TODO Override each method from class A
	// The method implementation is up to you
	//@Override
	//	- Method name and arguments should be the same
	//	- Return type should be the same covariant
	// 	- Method access modifier should be the same
	//	   or more visible in the child method
	//	- if parent method has exception declaration
	//		the child method can have the same or smaller
	//		exception declaration or none
	
	// Animal and Lion are covariant types
	// because Lion extends Animal and
	// we can say Lion is animal as well.
	@Override
	public void m1(String str) throws IllegalArgumentException{ // ส่วนนี้ จะต้องเหมือนเป๊ะๆ
		// 	ส่วน println จะทำ ให้ไม่เหมือนกับ parent class ได้
		System.out.println("from child class: " + str);
	}
	@Override
	public String m2() {
		return "Java is great";
	}
	
	@Override
	public int getNum(int i, int i2) {
		return Math.max(i, i2);
	}
	@Override
	public void loopOver(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}
	@Override
	public List<String> getList(){
		return null;
	}
	@Override
	public Lion getObject() { // จาก Animal จะใช้เป็น Lion ก็ได้
		return null;
	}
	
	
}
