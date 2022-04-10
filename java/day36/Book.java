package day36;

public class Book {  // class ที่ 2
	public String title;
	public String author;
	public int pages;
	public Rating rating; // create after create class Rating
	
	public Book(String title, String author,int pages,Rating rating) {
		this.title = title;
		this.author = author;  // method นี้เรียกว่า constructor
		this.pages = pages;
		this.rating = rating;
	}
	
	public Book() { // ต้องมีไว้ เป็น empty เหมือนกันที่เคยเรียน enum ก่อนหน้านี้
		
	}
}
