package Day24;

public class Book {
	// เรียกว่า define property  ไม่จำเป็นต้องมี public
	public String title;
	public int pages;
	public String author;
	
	public void read() {
		System.out.println("reading " + title);
	}
	//create empty constructor
	public Book() {
		
	}
	//มาสร้าง constructor ในนี้ก่อน ถึงจะไปสร้าง Book introToProg = new Book("", 600,..) ได้
	public Book(String title, int pages, String author) {
		this.title = title; //จะดีมากที่ทำให้ชื่อเหมือนกัน
		this.pages = pages;
		this.author = author;
	}
	// TODO define a constructor that make work Library class
	public Book(String title, int pages) {
		this.title = title;  //เรียกว่า assign property
		this.pages = pages;
	}
	
	
}
		/*
		 *  title: OCA
		 *  page: 500
			author : Jeanne Boyrasky
			read(){
			print(title);
			}
		 * 
		 */
		
	