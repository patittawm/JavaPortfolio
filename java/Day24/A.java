package Day24;

public class A { // 	ทำงานร่วมกับ class B
	//สอนให้รู้ว่ามันไม่มีผลซึ่งกันและกัน 
	public static void main(String[] args) {
		B obj = new B();
		obj.str = "Apple";
		obj.num = 1;
		obj.res = "Wooden spoon";
		obj.printDetails();
		System.out.println("--------");
		
		B obj2 = new B();
		obj2.printDetails();
		
		obj.res = "iron spoon";
		
		System.out.println(obj.res); // iron spoon
		System.out.println(obj2.res); // null
	}

}
