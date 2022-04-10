package day36;

import java.util.ArrayList;
import java.util.List;

public class BookDemo { // คลาสนี้สร้างหลังจาก class Book class ที่ 3

	public static void main(String[] args) {
		// List that can hold the object
		List<Book> list = new ArrayList<>();
		// หลังเครื่องหมาย = คือการครีเอท Object
		Book b = new Book("OCA", "Jenne", 500, Rating.EXCELLENT); // อันนี้ คือ element 0
		list.add(b);
		list.add(new Book("OCP", "Janne", 700, Rating.EXCELLENT)); // อันนี้ คือ element 1
		list.add(new Book("The 10X Rule", "Cardone", 250, Rating.GOOD));
		list.add(new Book("Educated", "Westover", 350, Rating.GOOD));
		list.add(new Book("The Black Swan", "Taleb", 482, Rating.EXCELLENT));

		System.out.println(list.get(0));// day36.Book@5eb5c224 จะบอกว่า ทุก element มี object
		
		System.out.println("-----firstBook------");
		// .get() จะได้  แต่ละตัวใน element ออกมา
		Book firstBook = list.get(0);
		System.out.println("Title : " + firstBook.title); // ในวงเล็บเรียกว่า poperties
		System.out.println("Author : " + firstBook.author);
		System.out.println("Pages : " + firstBook.pages);
		System.out.println("Rating : " + firstBook.rating);

		System.out.println("----second book-----");
		System.out.println("Title : " + list.get(1).title);
		System.out.println("Author : " + list.get(1).author);
		System.out.println("Pages : " + list.get(1).pages);
		System.out.println("Rating : " + list.get(1).rating);

		System.out.println("----TODO For Loop รายขื่อหนังสือ-----");
		// TODO print each title of each book inside our list by using loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Title : " + list.get(i).title);
		}

		System.out.println("----TODO Each Loop รายขื่อหนังสือ-----");

		for (Book book : list) {
			System.out.println(book.title);
		}

		System.out.println("----TODO TotalPages For จำนวน หน้าทั้งหมดในลิส-----");
		int totalPagesToRead = 0;
		int totalPagesToRead2 = 0;
		// TODO find out and assign total pages to totalPagesToRead from our list
		for (int i = 0; i < list.size(); i++) {
			totalPagesToRead += list.get(i).pages;
		}
		System.out.println("The total pages to read is " + totalPagesToRead);

		System.out.println("----TODO TotalPages Each จำนวน หน้าทั้งหมดในลิส-----"); //คำตอบตอนนี้ จะเอา for มารวม
		// we use for each loop when we need to over
		// type of single element of each element
		for (Book book : list) {
			totalPagesToRead2 += book.pages;
		}
		System.out.println("The total pages to read is " + totalPagesToRead2);
		
		System.out.println("----TODO -Good Book----");

		// TODO add all GOOD books from list to goodBooks based on rating
		List<Book> goodBooks = new ArrayList<>();
		//FOR Loop
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).rating == Rating.GOOD) {
				System.out.println(goodBooks.add(list.get(i)));
				
			}
		}
		//EACH loop
		// List<Book> list = new ArrayList<>();
//		for (Book str : list) {
//			if (str.rating == Rating.GOOD) {
//				System.out.println("เป็น Good Book : " + goodBooks.add(str));
//			}
//		}
		System.out.println("-----");
		
		for (Book eachBook : goodBooks) {
			System.out.println("หนังสือ จากความนิยม ระดับ Good คือ " + eachBook.title);
			
		}
		System.out.println("--ทดสอบ---");
		
		int totalPage = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).rating == Rating.GOOD) {
				totalPage += list.get(i).pages;
			}
		}
		System.out.println("จำนวนหน้าทั้งหมดใน good : " + totalPage + " หน้า");
		
	}

}
