package day34;
import java.util.ArrayList;

public class City {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Aldie");
		cities.add("Chantilly");
		cities.add("Tysons");
		cities.add("DC");
		cities.add("Hyammis");
		
		// contains  
		if(cities.contains("Aldie")) {
			System.out.println("Aldie is in the cities list");
		}else {
			System.out.println("Aldie is not the cities list");
		}
		boolean isThere = cities.contains("Paris");
		System.out.println(isThere);
		
		//indexOf บอกตำแหน่งคำที่ต้องการ
		int i = cities.indexOf("DC");
		System.out.println("DC: " + i); // DC: 3 
		System.out.println(cities.indexOf("Aldie")); // 0
		System.out.println(cities.indexOf("Paris")); // -1
		System.out.println(cities.indexOf("Tysons")); // 2
		
		System.out.println(cities.indexOf("dc")); // -1
		System.out.println(indexOfIgnoreCase(cities, "dc")); //3
		
		System.out.println("---------");
		
		// TODO
		// print elements from cities list in the new lines 
		// if element length is even
		for (String city : cities) {
			if (city.length() % 2 == 0) {
				System.out.println(city);//Tysons DC
			}
		}
		
		System.out.println("-----------");
		for( int j = 0; j < cities.size(); j++) {
			if(cities.get(j).length() % 2 == 0 ) {
				System.out.println(cities.get(j)); //Tysons DC
			}
		}
		
	}
	public static int indexOfIgnoreCase(ArrayList<String> list, String target) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equalsIgnoreCase(target)) {
				return i;
			}
		}
		
		return -1;
	}
}
