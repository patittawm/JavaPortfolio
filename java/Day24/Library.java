package Day24;

public class Library {     //เปิดคู่กับ class Book

	public static void main(String[] args) {
		Book oca = new Book(); //ใช้ new keyword เรียกว่า constructor
		oca.title = "OCA"; //assign property
		oca.pages = 500;
		oca.author = "Jeanne Boyrasky";
		//  read มาจาก class Book
		oca.read(); //reading OCA
		
		Book ocp = new Book();
		ocp.read(); // reading null
		ocp.title = "OCP";
		ocp.read(); // reading OCP
								//เรียกว่า constructor แ่ตทำตรงนี้ไม่ได้ ไปทำใน class Book
		//Book introToProg = new Book("", 600,..) // ต้องไปสร้าง ใน class Book ก่อน
		Book introToProg = new Book("Intro", 500, "Savitch");
		System.out.println(introToProg.title); //Intro
		System.out.println(introToProg.pages); //500
		System.out.println(introToProg.author);//Savitch
		System.out.println("-------------");
		//ด้านล่างนี้ เป็นตัวอย่างของ 2 argument ต้องไปสร้าง constructor ใหม่ใน class Book
		Book book = new Book("Algorithms", 800);
		System.out.println(book.title); //Algorithms
		System.out.println(book.pages); //800
		
	}

}
