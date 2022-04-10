package day35;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AList {

	public static void main(String[] args) {
		// Interview Q
		//					กำหนดชนาดของ ArrayList
		List<Integer> l = new ArrayList<>(50);
		// * Internally ArrayList is based on array
		// new ArrayList<>(50); we can specify the initial size of out list
		// * By default ArrayList allocates array with size 10
		// and when we will keep adding new elements ArrayList will grow the size
		// of internal array automatically
		
		List<Integer> l2 = new ArrayList<>(Arrays.asList(5,3,2,1));
		//List<Integer> l3 = l2;
		List<Integer> l3 = new ArrayList<>(l2);
		
		System.out.println(l2);//[5, 3, 2, 1]
		System.out.println(l3);//[5, 3, 2, 1]
		
		l3.add(7);
		System.out.println(l2);//5, 3, 2, 1, 7]  ถ้าใช้ line 19 จะเปลี่ยนเป็น [5, 3, 2, 1]
		System.out.println(l3);//5, 3, 2, 1, 7]
	
	}

}
