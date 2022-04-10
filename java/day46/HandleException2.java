package day46;

public class HandleException2 {

	public static void main(String[] args) {
		String str = null;
		//System.out.println(str);
		//System.out.println(str.toUpperCase());
		//TODO
		//handle exception that comes from line 7 and print "Exception is handle!"
		// เอา line ที่ไม่รับ มา try แล้วมา  catch เฉยๆ Bek เอาทั้ง 2  มาใช้ ออกมาเหมือนกัน
		try {
			System.out.println(str);
			System.out.println(str.toUpperCase());
			
		} catch (NullPointerException e) {
			System.out.println("Exception is handle!");
			
		}
		
	}

}
