package Day24;

public class B {  // ทำงานร่วมกับ class A
	public String str;
	public int num;
	public String res; // ถ้าใส่ static เข้าไป จะมีผลใน res 
	//                     ที่ class A
	public void printDetails() {
		System.out.println("str : "+ str);
		System.out.println("num : "+ num);
		System.out.println("res : "+ res);
		
	}
	
	
}
