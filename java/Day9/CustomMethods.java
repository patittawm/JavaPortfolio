package Day9;

public class CustomMethods {

	public static void main(String[] args) {
		
		String name = "Apple"; //เราทำส่ง
		printExclamation(name);
	//or
		printExclamation("Apple"); //อาจารย์ทำ
		printExclamation("John");
		
		
	}

	public static void printExclamation(String name){
		System.out.println(name + "!");
		
	}
	
}
