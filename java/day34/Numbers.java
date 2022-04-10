package day34;
import java.util.ArrayList;
import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {
		//ArrayList with Integer
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		//		ใส่เป็น int ไม่ได้ ต้องใส่ Integer
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		ArrayList<Character> listChars = new ArrayList<>();
		listChars.add('a');
		listChars.add('b');
		listChars.add('c');
		System.out.println(listChars);
	}

}
