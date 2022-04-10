package Day12;

public class Terminal {
	public static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase().contains("Windows");
	
	public static void main(String[] args) {
		//terary operator
		//1.terary operator alway return some value
		//                      condition ? value if true : value if false
		String terminalToUse = IS_WINDOWS ? "git bush" : "regular terminal";
		
		//String terminalToUse;      เราสามาถรใช้คำสั่งด้านบนแทน ได้
		
		
		//if (IS_WINDOWS) {
		//	terminalToUse = "git bush";
		//} else {
		//	terminalToUse = "regular terminal";
		//}
		
		System.out.println("OS: " + System.getProperty("os.name"));
		
		System.out.println(terminalToUse);
	}
	
	
}
