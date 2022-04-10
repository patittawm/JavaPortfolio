package day45;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class DateFomatPractice {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today); //2022-03-24
		//need different format
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String fDate = f.format(LocalDate.now());
		System.out.println("Today's date is  " + fDate);
		
		//		MMMM = full month 
		f = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		fDate = f.format(today);
		System.out.println(fDate);
		
		f = DateTimeFormatter.ofPattern("MMM dd, YY");
		fDate = f.format(today); 
		System.out.println(fDate);
		
		//TODO write a code here to change formatting of 
		//the date and print it as
		
		
		f = DateTimeFormatter.ofPattern("MMMM.dd.YYYY");
		fDate = f.format(today); 
		System.out.println(fDate);
		
	}

}
