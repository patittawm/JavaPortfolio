package Day24;
//เปรียบเทียบการใช้public,protected,default(empty),private
public class CarDemo { //ใช้คู่กับ class Car

	public static void main(String[] args) {
		Car car = new Car();
		car.model = "Audi";
		car.year = 2020;
		car.price = 30000;
		//car.color = "red";
		car.printDetails();

	}

}
