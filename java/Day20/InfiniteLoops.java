package Day20;

public class InfiniteLoops {    // ให้ระวังในการใช้ เพราะจะรันไม่หยุดจนกว่าจะกดปุ่มแดง

	public static void main(String[] args) {
	//	while (true)  { 
	//		System.out.println("Hello, World!");  // อันนี้จะ รัน ไม่หยุด ต้องกดปุ่มแดง
		int i = 0;
		while (i < 100) {   // ถ้าใช้แบบนี้ โปรแกรมจะหยุด
			System.out.println("Hello, World!");
			i++;  // ต้องมีไม่งั้นจะรันไม่หยุด
 		
		}
			System.out.println("The end");
	}

}
