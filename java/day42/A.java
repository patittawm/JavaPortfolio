package day42;

import java.util.Arrays;
import java.util.List;

public class A { //B1
	/*
	 * final variable cannot be reassigned
	 * final classes cannot be extended
	 * final methods cannot be overridden
	 * 
	 * How to prevent you method for being overridden?
	 *  - by making it final
	 * 
	 */
	protected void m1(String str) throws RuntimeException{
		System.out.println(str);
	}
	
	public String m2() {
		return "Java is great";
	}
	
	public int getNum(int i, int i2) {
		return Math.max(i, i2);
	}
	
	public void loopOver(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}
	public List<String> getList(){
		return Arrays.asList("A","B","C");
	}
	
	public Animal getObject() {
		return null;
	}
}
