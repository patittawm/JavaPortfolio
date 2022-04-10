package day35;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Countries {

	public static void main(String[] args) {
		// Array.asList(T...) returns fixed-size list backed by specified array
		List<String> countries = Arrays.asList("USA", "Bolivia", "France", "Brazil");
		System.out.println(countries); // [USA, Bolivia, France, Brazil]
		
		//When we create our list as Arrays.asList(...) it will be foxed-size list.
		// If we will add new elements or remove, it will throw UnsupportedOperation exception.
		// java.lang.UnsupportOperatoationException
		// countries.add("Argentina"); // ใช้ไม่ได้กับ list
		// countries.remove(0);
		// <> เป็นออฟชั่น จะใส่ String หรือไม่ก็ได้
		
		// We can pass asList(...) as argument to ArrayList and it will return regular dynamic-size list.
		List<String> countries2 = new ArrayList<>(Arrays.asList("USA", "Bolivia", "France", "Brazil"));
		System.out.println(countries2); // [USA, Bolivia, France, Brazil]

		countries2.add("Argentina");
		System.out.println(countries2);// [USA, Bolivia, France, Brazil, Argentina]

		
		// TODO loop over the list countries2 and print each element in new lines by
		// using regular loop
		System.out.println("-----regular loop-------");
		
		for(int i =0; i < countries.size(); i++) { // เริ่มจาก ตัวแปรที่2 ก็ได้
			System.out.println(countries2.get(i));
		}
		System.out.println("------for each loop------");

		// TODO loop over the list countries2 and print each element in new lines by
		// using for each loop
		for (String countries3 : countries) {
			System.out.println(countries3);
		}
		
		System.out.println("-----Iterator-------");

		// TODO loop over the list countries2 and print each element in new lines by
		// using Iterator
		Iterator<String> countries4  = countries.iterator() ;
		while(countries4.hasNext()) {
			System.out.println(countries4.next());
		}
		System.out.println("------forEach stream function------");

		// TODO loop over the list countries2 and print each element in new lines by
		// using forEach stream function
		countries.forEach(element ->{
			System.out.println(element);
		});
		System.out.println("------------");

	}
}
