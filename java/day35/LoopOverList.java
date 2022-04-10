package day35;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class LoopOverList {

	public static void main(String[] args) {
		List<String>customers = new ArrayList<>();
		customers.add("Oliver");
		customers.add("James");
		customers.add("Anna");
		customers.add("Alex");
		customers.add("Tomas");
		customers.add("John");
		
		//1. by using regular loop
		
		//System.out.println(customers.get(i));
		for (int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i));    //.get()
		}
		System.out.println("-------");
		
		//2. by using for each loop
		for (String customer :customers ) {
			System.out.println(customer);
		}
		System.out.println("-------");
		
		//3. iterate over by using Iterator พิมพ์ทีละบรรทัด ถ้าใช้ while loop ก้จะพิมพ์ทั้งหมดที่มี
		// .hasNext  ไปดูซ้ำ
		Iterator<String> iterator = customers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());  // .next()
		}
		System.out.println("-------");
		
		//4.Iterate over the list by Using streams forEach function
		customers.forEach(element-> {
			System.out.println(element);
		});
		
	}

}
