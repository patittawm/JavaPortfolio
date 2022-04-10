package day41;

public class Lion extends Animal {  //AN2
	
	public static void main(String[] args) {
		Lion lon = new Lion();
		lon.lionName = "Leo";
		lon.color = "brown";
		lon.age = 1;
		
		System.out.println(lon.getLionInfo());
	}

}
