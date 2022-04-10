package Day25;

public class SbMethods {

	public static void main(String[] args) {
		// SringBulder dose support most of String method
		//and it has it is own methods.
		//chatAt(), length(), indexOf(), substring(), equals()
		
		StringBuilder day = new StringBuilder("Tuesday");
		System.out.println(day); // Tuesday
		System.out.println(day.length()); // 7
		
		char ch = day.charAt(0);
		System.out.println(ch); // T
		
		int i = day.indexOf("y");
		System.out.println(i); //6
		
		//substring will return String
		String str = day.substring(0, 3);  // มาจาก Tuesday
		System.out.println(str);           //Tue
		System.out.println("----------");
		
		StringBuilder sb = new StringBuilder();
		//         0123456
		sb.append("animals");
		System.out.println(sb); //animals
		
		//insert(index, string); it inserts the specific string in the given
		//index.the char in that index will be pushed to the right.
		sb.insert(3,  "-");
		System.out.println(sb); //ani-mals
		
		sb.insert(0,  "?");		//012345678
		System.out.println(sb); //?ani-mals ->  ?ani-ma=ls
		
		sb.insert(7, "=");
		System.out.println(sb); //?ani-ma=ls
		
		sb.insert(sb.length(), "abc");
		System.out.println(sb); //?ani-ma=lsabc
		System.out.println("----------");
		
		//delete(start, end);
		//removes characters from start till end(exclude)
		//									   012345
		StringBuilder sb2 = new StringBuilder("abcdef");
		System.out.println(sb2); //abcdef
		
		sb2.delete(1, 3);
		System.out.println(sb2); //adef
		
		sb2.delete(1, 2);
		System.out.println(sb2); //aef
		
		System.out.println("----------");
		
		StringBuilder sb3 = new StringBuilder();
		sb3.append("123456789");
		// TODO delete chars from sb3 so sb3 will have value as "19"
		sb3.delete(1, sb3.length() - 1); // อันนี้จะเหลือตัวแรกกะตัวสุดท้าย
		System.out.println(sb3); //19
		
		// deleteCharAt(index)                 01234
		StringBuilder sb4 = new StringBuilder("apple");
		System.out.println(sb4); //apple
		sb4.deleteCharAt(3);
		System.out.println(sb4); //appe
		System.out.println("----------");
		
		//reverse
		StringBuilder sb5 = new StringBuilder("Wooden Spoon");
		System.out.println(sb5);
		sb5.reverse();
		System.out.println(sb5);	

	}

}
