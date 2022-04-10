package day49;

import java.util.ArrayList;
import java.util.List;

public class ReaderWriterDemo {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("John");
//		list.add("Ramesh");
//		list.add("Vijay");
//		list.add("Milena");
//		list.add("Tomas");
//		list.add("Sunil");
//		
//		 ReaderAndWriter.writeContent(list, "root/listOfNames.txt");
		//Array ด้านบน คือการสร้าง ให้อยู่ใน ไฟล์ ชื่อ listOfName จากนั้น ก็ลบออกได้ ปล้วมารันด้านล่าง
		// นี้จะได้เป็น list ออกมา แต่ถ้าไม่ทำก็จะไม่มีไฟล์ ให้ list
		List<String> content = ReaderAndWriter.readContent("root/listOfNames.txt");
		System.out.println(content);//[John, Ramesh, Vijay, Milena, Tomas, Sunil]
	}

}
