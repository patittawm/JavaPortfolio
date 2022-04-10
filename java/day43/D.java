package day43;
// 		     D is the first concrete class
public class D extends C { //C2
	
	@Override 
	public void flower() {
		System.out.println("How many flower you need?");
	}
	@Override 
	public void color() {
		System.out.println("What color flower you need?");
	}
	@Override 
	public int box() {
		return 12;
	}
	
	public static void main(String[] args) {
		D obj = new D();
		obj.flower();//How many flower you need?
		obj.color();//What color flower you need?
		//obj.box();
		System.out.println(obj.box());//12
		
		obj.printHi();//hi!
		System.out.println(obj.getStr()); //str
	}
}
