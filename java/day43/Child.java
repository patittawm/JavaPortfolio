package day43;

public class Child extends Parent { //A2
	@Override
	public void walk() {
		System.out.println("Child class is walking");
	}
	
	@Override
	public String getWords() {
		return super.getWords() + " and some words from child class";
	}
	
	public Child() {
		super("str: Hello, World!"); // call parent constructor with one arg
	}
	
	public Child(String str) {
		// this();
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.walk();
		System.out.println(child.getWords());
	}
}
