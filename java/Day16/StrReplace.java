package Day16;

public class StrReplace {

	public static void main(String[] args) {
		//replace(oldString, newString) - it will replace the old string with new string
		//                                 and it will return that new version
		String city = "Alma-Ata";
		System.out.println(city); // Alma-Ata
		
		//Alma-Ata => Alma Ata
		
		city = city.replace("-", " ");
		System.out.println(city); // Alma Ata
		
		city = city.replace(" ", "");
		System.out.println(city);
		
		String str = "Java*Phython*JS*PH";
		System.out.println(str); //Java*Phython*JS*PH
		
		str = str.replace("*",", " );
		System.out.println(str); //Java, Phython, JS, PH
		
		String str2 = "Hello, World!";
		System.out.println(str2); //Hello, World!

		str2 = str2.replace("World", "Class");
		System.out.println(str2); //Hello, Class!
		
	
	}

}
