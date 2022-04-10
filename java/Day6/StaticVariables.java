package Day6;

public class StaticVariables {
	public static String firstName = "John";
	public static String lastName = "Doe";
	public static int age = 35;
	
	public static void main(String[] args) {
		/*
		 * Static variables are class level variables, but they belong
		 * to class itself and not to specific object.
		 * - we need to tag them as static by using static keyword.
		 * - they can have access modifiers.
		 * - they have default values.
		 * - they can be used in the main method directly because
		 *   main method is static as well.
		 * - the correct way of using them outside the class is by class name. 
		 * 
		 *  -------
		 *  Access modifiers - the visibility of the element outside of the class.
		 *  public 
		 *  protected
		 *  default
		 *  private
		 */
		
		System.out.println(firstName);
		System.out.println(lastName); 
		System.out.println(age);
		
		//ถ้ารีแอดไซด์ ผลการพิม ก็จะเปลี่ยนด้วย
		
		firstName = "Smith";
		lastName = "Wills";
		age = 42;
		System.out.println(firstName);
		System.out.println(lastName); 
		System.out.println(age);
		
		
		
	}
}
