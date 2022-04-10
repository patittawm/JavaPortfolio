package day43;

public class Parent { //A1
	public void walk() {
		System.out.println("Parent class is walk");
	}
	public String getWords() {
		return "Word forn Parent class";
	}
	
	public Parent() {} // ต้องมีไว้ ไม่วั้นฝั่ง child  จะไม่คอมไพล์
	
	public Parent(String str) {
		System.out.println("Str : " + str);
	}
	
}
