package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUp {

	public static void main(String[] args) {
		System.out.println(reverseEach(Arrays.asList("abc", "apple", "spoon")));
		System.out.println(reverseEach(Arrays.asList("car", "java", "red")));
		System.out.println(reverseEach(Arrays.asList("bmw", "audi", "honda", "resla")));

	}

	public static List<String> reverseEach(List<String> list){
		// 1. Create new revList
		// 2. loop over the list argument
		// 3. reverse each element and add to revList
		// 4. return revList
		List<String> revList = new ArrayList<>();
		// อันนี้ ใช้ for loop
		for(int j = 0; j < list.size(); j++) {
			String str = list.get(j);
			
		
		// อันนี้ สำหรับใช้ Each Loop 
		//for (String str : list) {
			
			String revStr = "";
			for(int i = str.length() - 1; i >= 0; i--) {
				revStr += str.charAt(i);
			}
			revList.add(revStr);
		}
		
		return revList;
		
	}
}
