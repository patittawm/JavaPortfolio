package Day7;

public class Swap {

	public static void main(String[] args) {
		String sky = "yellow";
		String sun = "blue";
		// TODO to swap values of variables sky and sun
		// Without direct reassignment.	
		
		
		
		String tem = sky; // tem is name 
		sky = sun;
		sun = tem;
		
		System.out.println("Sky is " + sky);
		System.out.println("Sun is " + sun);
		

	}

}
