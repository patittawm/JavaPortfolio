package day32;

public class Team {

	public static void main(String[] args) {
		//array it itself of array

		String[][] rows = {
				{"apple", "orange"}, 
				{"kiwi", "banana"}, 
				{"blueberry", "pineapple", "berry"}}; 
		
		System.out.println(rows.length); // 3
		System.out.println(rows[0].length); // 2
		System.out.println(rows[1].length); // 2
		System.out.println(rows[2].length); // 3
		
		// print each element of rows two dimention of array on new lines
		// TODO  เปลี่ยนได้ อ่านได้
		// We can label our loops and while using break or continue, 
		// we can specify by label which loop to break/continue.
		outerLoop: // ใช้สำหรับหยุดไม่ต้องพิมต่อ
		for(int i = 0; i < rows.length; i++) {
			
			for(int j = 0; j < rows[i].length; j++) {
				
				if (rows[i][j].equals("banana")) {
					System.out.println("Banana is here!");
					// break innerLoop;
					break outerLoop;
				}
				// rows[i][j] = rows[i][j].toUpperCase();
				System.out.println(rows[i][j]);
			}						// [i] = outer
		}							// [j] = inner
		System.out.println("------------");
		
		// ผลออกมาเหมือนกัน แต่ใช้ each loop ดีในการอ่าน อเรย์ แต่ไม่เหมาะกับการเปลี่ยนอาเรย์
		// this is label for outer loop
		forOuterLoop:
		for(String[] arr : rows) {
			for (String str : arr) {
				System.out.println(str);
			}
		}
		
		
		
	}

}
