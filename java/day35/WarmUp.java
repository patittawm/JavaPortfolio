package day35;
import java.util.List;
import java.util.ArrayList;
public class WarmUp {

	public static void main(String[] args) {
		// What difference between array and ArrayList
		//ArrayList has dynamic size and array had fixed size
		//
		
		//List is inter face and ArrayList is concrete class of it
		//This is more preferable way of create list
		List<String>books = new ArrayList<>();
		books.add("OCA");
		books.add("OCP");
		books.add("Algorithms in Java");
		books.add("Java Head First");
		books.add("Clean code");
		
		System.out.println(books);//[OCA, OCP, Algorithms in Java, Java Head First, Clean code]
		System.out.println(books.size());//5
		
		System.out.println("------");
		//TODO loop over

		for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
		}
		
		System.out.println("------");
		for (int j = books.size()-1; j >= 0; j--) {
            System.out.println(books.get(j));
		}
		
		System.out.println("---each loop---");
		//ใช้each loop
		
		for(String book : books) {
			System.out.println(book);
		}
		for (int i = books.size() - 1; i >= 0; i-- ) {
			System.out.println(books.get(i));
		}
	}

}
