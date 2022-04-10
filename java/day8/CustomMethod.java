package day8;

public class CustomMethod {

	public static void main(String[] args) {
		sayAloha();
		System.out.println("------");
		
		sayAloha();
		System.out.println("------"); //	เราสามารถสั่งได้ว่าจะให้พิมพ์กี่ครั้งโดยการเพิ่ม โคดที่นี่
		
		sayAloha();
		
	}

	public static void sayAloha() {
		System.out.println("Aloha Friend!");
		System.out.println("Aloha Friend!");
		System.out.println("Aloha Friend!");
		
	}
}
