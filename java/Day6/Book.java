package Day6;

public class Book {  // ตัวอย่าง ฝึกหัด static variables
	
		public static String title = "Harry Potter";
		public static int numberOfPages = 500;
		public static double price = 99.99;
		
		public static void main(String[] args) {
			System.out.println(title);
			System.out.println(numberOfPages); 
			System.out.println(price);
			
			
			title = "Java OCP";
			numberOfPages = 700;
			price = 26.99;
			
			System.out.println("Title: " + title);
			System.out.println("Number of pages: " + numberOfPages);
			System.out.println("Price: " + price);
		
			
	}

}
