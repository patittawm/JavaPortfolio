package Day24;
// เปรียบเทียบการใช้public,protected,default(empty),private
public class CarDemo2 { //ใช้คู้กับ class Car

	public static void main(String[] args) {
		Car car = new Car();
		//car.model = "BMW"; // not visible
		//car.year = 2021;	 // not visible
		//car.price = 30000;	// not visible
		//car.color = "black";
		car.printDetails();
	}

}
