package day42;

public class SuperObjectClass { // D2
	public static void main(String[] args) {
	
	BookToString book = new BookToString("OCA", 500);
	// Every class extends java.lang.Object class by default
	// Why?
	// Because java wants to give common behaviors
	// for every object that will be created.
	// ประโยชน์ 
	// ใช้บ่อยแค่ไหน
	
	System.out.println(book.getClass()); //class day42.Book
	System.out.println(book.getClass().getTypeName());//day42.Book
	
	System.out.println(book.toString());//day42.Book@ea30797
	System.out.println(book.equals(null));//false
	System.out.println(book.hashCode()); //245565335
	
	//these method for multithreasing environment
	book.notify();
	book.notifyAll();
	//unhanlded exception
	//book.wait();
	//book.wait(2000);
	//book.wait(100, 10);
	
	}
}
