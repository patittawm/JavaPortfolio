package day42;

public class AnimalDemo { // A3 child class

	public static void main(String[] args) {
		Lion obj = new Lion();
		obj.name = "Alex";
		obj.age = 5;
		obj.eat();
		obj.run();
		System.out.println(obj.getName());
	}

}
