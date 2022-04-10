package Day23;

public class Restaurant {
	// Class is blueprint for its object
	// object is implementation of the class
	// we use new keyword to create an object

	public static void main(String[] args) {
		// numeric (int, double, long ...)
		// String
		// char & boolean
		//  Table = reference type, table = actual reference
		//  on the right side object creation => 	new Table()	
		//                 Table() เรียกว่า constructor
		Table table1 = new Table(); // 2.Assign value
		// table1 call = reference
		System.out.println(table1); //Day23.Table@ea30797
		
		table1.type = "4 people";
		table1.color = "black";
		table1.height = 3;
		table1.isReserved = false;
		
		//3.print object value
		System.out.println(table1.type);  //4 people  
		System.out.println(table1.color);  //black
		System.out.println(table1.height); //3
		System.out.println(table1.isReserved);  // false
		System.out.println("------");

		//create one more Object อันนี้ ไม่ได้ครีเอท Object จึงมี default มาอัตโนมัติ
		Table table2 = new Table();  
		System.out.println(table2.type); //null
		System.out.println(table2.color); //null
		System.out.println(table2.height); // 0
		System.out.println(table2.isReserved); // false
		// the properties of objects have default values:
		// Value: ที่เป็น ดีฟอล จะเป็นดังด้านล่าง
		// Object - null
		// numerics(and char) - 0
		// boolean - false

	}

}
