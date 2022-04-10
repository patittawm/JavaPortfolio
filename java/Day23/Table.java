package Day23;
						
public class Table {  // this is blueprint of Object คือการ 1. create object
	public String type;
	public String color;
	public int height;
	public boolean isReserved;

	//เพิ่มเติมของ t2 สำคัญมาก จำๆๆๆ
	// constructor is a special method to create an object
	// - it has same name as class name.
	// - by default java provides one empty constructor
	//   when you define your own any constructor java will
	//   no longer provide default constructor.
	public Table() {// ถ้าไม่ต้องการให้ พิมพ์ ก็เอา public  ออก
		System.out.println("in empty constructor"); //สั่งพิมพ์แล้วจะไป โชว์ใน class restaurant
	}
	// ส่วนนี้สำคัญ เรียกว่า constructor เสร็จแล้ว ไปใน restaurant2 ต่อ
	// create own constructors
	public Table(String type, String color, int height, boolean isR) {
		this.type = type;    // ใช้ this แบบนี้ เพราะว่าชื่อ มันเหมือนกัน ต้องบอกว่าอันนี้ คือ ใส่ this
		this.color = color;  //  this. หมายความว่า เป็นอันทีเดียวกันที่ ่อยู่ใน class  
		this.height = height;
		isReserved = isR;  // อันนี้ไม่มี this และมี ชื่อที่แตกต่างออกไป
	}

	//TODO ลำดับ 1 implement method that prints all properties
	public void printDetails()	{
	
	System.out.println("Type : " + type);
	System.out.println("Color : " + color);
	System.out.println("height : " + height);
	System.out.println("isReserve : " + isReserved);

	}
}	
	

