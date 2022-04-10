package day42;
//		extends Object 
	public class BookToString { //  D1
	public String title;
	public int numberOfPages;
	
	public BookToString(String title, int numberOfPages) {
		this.title = title;
		this.numberOfPages = numberOfPages;
	}
	
	public BookToString() {}
	
	// D3
	@Override
	public String toString() {
		return "Book [title="+title+", numberOfPages="+numberOfPages+"]";
	}
	@Override
	//					(book obj)
	public boolean equals(Object obj) {
		//instance of will check if object is instance of specific class
		if(obj == null || !(obj instanceof BookToString)) {
			return false;
		}
		// casting Object to Book class
		BookToString book = (BookToString)obj;
		
		return title.equals(book.title) && numberOfPages == book.numberOfPages;
	}
	@Override
	public int hashCode() {
		return title.hashCode() + numberOfPages;
	}
}
