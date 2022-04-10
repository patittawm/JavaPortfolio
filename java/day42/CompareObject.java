package day42;

public class CompareObject { // D4 เรียนเรื่อง equals

	public static void main(String[] args) {
		// ("OCA" , 500) เรียกว่า property
		BookToString book = new BookToString("OCA", 500);
		BookToString book1 = new BookToString("OCA", 500);

		// are they same? it really depends what we are comparing

		// equals should be used to compare object from the same class
		// by default equals that comes from Object class will work
		// as == operator.

		// it is recommended that we override equals to give our
		// own way of comparing object of our class.
		// Note hashCode method also should be overridden
		// if equals is overridden.

		if (book.equals(book1)) {
			System.out.println("Yes, they are same");
		} else {
			System.out.println("No, they are same");
		}
		System.out.println(book.hashCode());// 78561
		System.out.println(book1.hashCode());// 78561

		System.out.println("------");

		BookToString b = new BookToString("Java", 600);
		BookToString b2 = new BookToString("Selenium", 500);

		if (b.equals(b2)) {
			System.out.println("Yes, they are same");
		} else {
			System.out.println("No, they are same");

		}

	}
}
