package day41;

public class Parrot extends Bird{ //TODO F3
	
	public void talk() {
		System.out.println("Parrot is talking");
	}
	
	public static void main(String[] args) {
		Parrot obj = new Parrot();
		obj.name = "Jib Jib";
		
		obj.fly();
		obj.talk();
	}
}
