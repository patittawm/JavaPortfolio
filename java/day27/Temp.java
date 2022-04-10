package day27;

public class Temp {
	public static void main(String[] args) {
		double[] temp = {32, 31, 25.7, 26, 34, 31.5, 29};
		// find out sum from temp
		double sum = 0.0;
		//loop to go over the array
		for (int i = 0;i < temp.length; i++) {
			sum += temp[i];
		}
		System.out.println("Sum is " + sum);
		
		//find out average value from temp
		double averageTemp = sum / temp.length;
		System.out.println("Average tem is " + averageTemp); //Average tem is 29.885714285714283
		
		//TODO print value from temp array that grater than average value
		
		for(int i = 0; i < temp.length; i++) {
			if (temp[i] > averageTemp) {
				System.out.println(temp[i]); 
			}
		}
		
	}

}
