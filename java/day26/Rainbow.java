package day26;

public class Rainbow {

	public static void main(String[] args) {
		//					0 		1			2 		3		4		5			6
		String[] color = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
		System.out.println(color[0]);
		System.out.println(color[1]);
		System.out.println(color[2]);
		System.out.println(color[3]);
		System.out.println(color[4]);
		System.out.println(color[5]);
		System.out.println(color[6]);
		//... แทนที่จะทำแบบนี้ เราทำวิธีอื่นได้สั้นกว่า
		System.out.println("------------------");
		for(int i = 0; i < color.length; i++) {
			//System.out.println(i); // ถ้าใช้ i จะออกมาเป็นตัวเลข
			System.out.println(color[i]); // จะออกมาเป็นสีให้
			
		}
		
		

	}

}
