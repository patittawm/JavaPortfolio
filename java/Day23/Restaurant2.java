package Day23;

public class Restaurant2 { // ทำงานคู่กับ Class Table

	public static void main(String[] args) {
		// TODO ลำดับ 2
		// create an object from Table class
		// assign any objects details.
		//อันนี้กับ Table.java นั้น สัมพันธ์กัน
		
		Table t = new Table(); 
		System.out.println(t);
		t.type = "2 people";
		t.color = "white";
		t.height = 5;
		t.isReserved = true;
		t.printDetails();   // อันนี้มาจาก Class Table.java
		
		System.out.println("-------"); // เพิ่มเติมใน Table.java สำคัญ มาก จำๆๆ
		
		Table t2 = new Table();
		t2.color = "red";
		t2.printDetails();
		
		System.out.println("-------"); // เพิ่มเติมใน Table.java สำคัญ มาก จำๆๆ
		
		Table t3 = new Table("4 people", "white", 3, false); // อันนี้มาจาก Table.java จะมี
		t3.printDetails();									//  บรรทัดนี้เป็นพื้นถาน Table(String type, String color, 
															//  int height, boolean isR)
		
	}

}
