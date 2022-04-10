package day26;
import java.util.Arrays;
public class FirstLast {

	public static void main(String[] args) {
		// ปกติทำแบบนี้
		//int[] num = new int[9];
		//num[0] = 12;
		//num[1] = 14;
		
		String[] team = {"Tomas", "Ramesh", "Milena"}; //นับจำนวน ในปีกกา
		//
		System.out.println(team[0]);
		System.out.println(team[1]);
		System.out.println(team[2]);
		
		
		String[] team2 = new String[3];
		team2[0] = "Tomas";
		team2[1] = "Ramesh";
		team2[2] = "Milena";
		
		System.out.println(team); // [Ljava.lang.String;@73a8dfcc
		//Array works the same way as objects do
		System.out.println(Arrays.toString(team)); // จะต้องไปอิมพอร์ต Array [Tomas, Ramesh, Milena]
		
		//we can use .length to find out size of array
		int arrSize = team.length;
		System.out.println("Size of array: " + arrSize); //Size of array: 3
		
		double[] tmpWeek = {32, 35.5, 25.7, 26.9, 31.5, 29.9, 28.1};
		//TODO print first and last

		System.out.println(tmpWeek.length); //7
		System.out.println("First: " + tmpWeek[0]); //First: 32.0
		System.out.println("Last: " + tmpWeek[tmpWeek.length - 1]); //Last: 28.1
		
	}

}
