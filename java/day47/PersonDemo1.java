package day47;

public class PersonDemo1 {//A2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		//TODO
		//handle this exception here
		//and print exception is handled
		
		try {
			person.setAge(-2);
		}catch (RuntimeException e) {
			System.out.println("Exception is handle");
		}
		
	}

}
