package day42;

public class ToStringMethod { //D3

	public static void main(String[] args) {
		BookToString book = new BookToString("OCA" , 500);
		/*
		 * It is recommended that all classes override toString method
		 * In  general, toString should return a string that 
		 * "textually represents" this object.
		 * The result should be informative representation that is easy 
		 * for a person to read.
		 */
		System.out.println(book); //day42.Book@6bf2d08e  หลัง Book [title=OCA, numberOfPages=500]
		//System.out.println(book.toString()); //day42.Book@6bf2d08e หลัง Book [title=OCA, numberOfPages=500]
		String strObj = book.toString();
		
		BookToString book2 = new BookToString("Java OCP" , 900);
		System.out.println(book2);//Book [title=Java OCP, numberOfPages=900]

	}

}
