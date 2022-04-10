package day26;

public class Fruit {

	public static void main(String[] args) {    //Array กับ String
		
		String[] fruit = new String[4];
		fruit[0] = "orange";
		fruit[1] = "kiwi";
		fruit[2] = "banana";
		fruit[3] = "apple";
		
//      0          1        2         3
		// {["orange"] ["kiwi"] ["banana"] ["apple"]}
		String str = fruit[2];
		System.out.println(str); // banana
		//[String]  [String]  [String]  [String]
		//we can trate each element as single variable if array type.
		
		// reassign third element with "cherries"
		fruit[2] = "cherries";
		System.out.println(fruit[2]); // cherries
		
		//TODO
		// reassign first element to upper case version of it.
		fruit[0] = fruit[0].toUpperCase();// ใช้กันได้ ถ้าเปลี่ยน ค่าด้านบน มันก็จะ เปลี่ยนให้ด้วยเลย
		System.out.println(fruit[0]); //ORANGE
	}

}
