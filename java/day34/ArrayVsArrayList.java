package day34;
import java.util.ArrayList; 
import java.util.Arrays;
public class ArrayVsArrayList {

	public static void main(String[] args) {
		// Array is collection of data of the same type
		// - It is fixed size
		// - array can work with primitives and objects
		
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Bob";
		names[2] = "Alex";
		//names[3] = "Kuba"; เพิ่มไม่ได้
		
		String str = names[0]; // สแดงตังอย่าง array ถ้าต้องการเพิ่ม
		
		System.out.println(Arrays.toString(names)); //[John, Bob, Alex]
		names[2] = "Bek";  // 
		
		// ArrayList is collection of data of the same type
		// - It has dynamic size
		// - ArrayList can work only with objects.
		ArrayList<String> listName = new ArrayList<>();
		listName.add("John");
		listName.add("Bob");
		listName.add("Alex");
		listName.add("Kuba");
		System.out.println(listName);//[John, Bob, Alex, Kuba]
		
		String firstElement = listName.get(0);
		String secondElement = listName.get(1);
		System.out.println("First element : " + firstElement);//First element : John
		System.out.println("Second element : " + secondElement); //Second element : Bob
		listName.add("Ramesh");
		System.out.println(listName);//[John, Bob, Alex, Kuba, Ramesh]
		
		listName.add(0, "vijay");
		System.out.println(listName);//[vijay, John, Bob, Alex, Kuba, Ramesh]
		
		listName.add(1, "Uros");
		System.out.println(listName);//[vijay, Uros, John, Bob, Alex, Kuba, Ramesh]
		
		listName.set(0,  "Smith");//[Smith, Uros, John, Bob, Alex, Kuba, Ramesh]
		System.out.println(listName);
		
		listName.set(6, "Milena");
		System.out.println(listName);//[Smith, Uros, John, Bob, Alex, Kuba, Milena]
		
		// add(value) - it will add new value to our list
		// add(index, value) - it will add new value to specified index.
		// get(index) - it will read the element under this index.
		// set(index, newValue) - it will change elements value in specified index. 
		

	}

}
