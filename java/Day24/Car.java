package Day24;
//เปรียบเทียบการใช้public,protected,default(empty),private
public class Car {
	//Access Modifiers
	//public- the member accessible from anywhere in the project
	//protected - accessible within the same package and subclasses
	//default(empty) - accessible within the same package only
	//private - accessible within the same class only
	
	public String model;
	protected int year;
	double price;  //default empty อยู่ในแพคเกจเดียวกัน ใช้ได้
	private String color; // ส่วนตัว ใช้ในคลาส อย่างเดียว ไปใช้คลาสอื่นไม่ได้
	//ตรว public สามารถ เปลี่ยน เป็น อื่นๆ ได้ หรือมีแค่ void ก็ได้
	public void printDetails() {
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
		System.out.println("Model : " + model);
		System.out.println("Model : " + model);
	}
}
