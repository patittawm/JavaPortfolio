package Day19;

public class BreakAndContinue {

	public static void main(String[] args) {
		int count = 0;
		while(count < 10) {
			System.out.println(count);
			count++;
			// ลองกำหนด ให้นับแค่ 7 มันจะพิม แค่ 6
			if (count == 7 ) {
				break;    // มี break ไม่ว่ายังไง มันก็จะหยุดแค่ตัวที่สั่ง
				
			}
			
		}
		System.out.println("-----ต่อเนื่อง-----");
		int i = 0;
		while (i < 10) {
			i++;
			//
			if(i % 2 == 1) {
				continue; // it slips rest of the code of loop body snd goes to
			}			  // next iteration.
			System.out.println(i);
		}
	}

}
