package day45;
// ใช้สำหรับ prepare data 
public class Chocolate { // A1
	// create instance variable
	public static String chocolate;
	public String str;
	public String str1;
	
	// this is static block, it will get executed when we use this class in any way
	// it executes only once
	static {
		System.out.println("in static block");
		chocolate = "Str";
		
	}
	
	//this is initializer block
	// It will get executed before each object creation.
	{
		System.out.println("in initilizer block");
	}
	// best way to use constructor to prepare data
	public Chocolate() {
		System.out.println("in empty constructor");
	}

}
