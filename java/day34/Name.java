package day34;
import java.util.ArrayList;
public class Name {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A"); 
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);// It is dynamic  [A, B, C]
		
		//
		System.out.println(list.get(0)); // A

	}

}
