package Day18;
								//การเอาคลาส enum มาใช้กับ class นี้
public class Rating {
	
	public static void main(String[] args) {
		System.out.println(getRatingMsg(MovieRating.Excelent));
		
		MovieRating r = MovieRating.Average;
		System.out.println(getRatingMsg(r));
		
		System.out.println(getRatingMsg(MovieRating.Bad));
		
	}
	
	public static String getRatingMsg(MovieRating rating) {
		String msg;
		
		switch (rating) {
		case Excelent:
			msg = "You must see this movie!";
			break;
		case Average:
			msg = "This movie is OK, but not great";
			break;
		case Bad:
			msg = "Skip it";
			break;
			default:
				msg = "Something went wrong";
			
		}
			return msg;   // การใช้ return ท้ายสุด

	}

}
