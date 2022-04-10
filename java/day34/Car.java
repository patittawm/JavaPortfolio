package day34;
import java.util.ArrayList;
public class Car { 
		// control + space
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("audi");
		cars.add("honda");
		cars.add("tesla");
		System.out.println(cars); //[BMW, audi, honda, tesla]
		
		int s = cars.size();
		System.out.println("Size : " + s ); //Size : 4
		
		cars.add("ford");
		System.out.println("Size : " + cars.size() ); //Size : 5
		System.out.println(cars); //[BMW, audi, honda, tesla, ford]
		
		//remove(index), remove(value)
		cars.remove(0);
		System.out.println(cars); //[audi, honda, tesla, ford]
		System.out.println("Size : "+ cars.size()); //Size : 4
		
		cars.remove("honda");
		System.out.println(cars); //[audi, tesla, ford]

		//clear() - It will remove all elements from ArraList แฟล้วเราก็เพิ่มอย่างอื่นเข้าไปใหม่
		cars.clear();
		System.out.println(cars); //[]
		
		cars.add("bmw");
		cars.add("audi");
		cars.add("honda");
		System.out.println(cars);
		
		System.out.println("----------");
		//for loop
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(i + " " + cars.get(i));	
		}
		System.out.println("----------");
		// each loop
		for(String str : cars) {
			System.out.println(str);
		}
		
	}

}
