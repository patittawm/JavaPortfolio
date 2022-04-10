package day44;

public interface Box { // B1 เทียบกับ interface Car จะแตกต่าง  
	
	long MAX_SIZE = 100;
	
	void putInside(String item);
	String getItem(int index);
	int getNumberOfItems();
	String getItems();

}
//Box - ArrayBox - BoxDemo