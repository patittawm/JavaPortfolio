package day37;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

	public static void main(String[] args) {
		// Queue in java represents a data structure designed to have elements
		// inserted in tje end of the queue and elements remove from the beginning
		
		//FIFO - First in First out
		
		// Queue has few implementations: เรียน 3 ตัวนี้
		// 1. PriorityQueue
		// 2. LinkedList
		// 3. ArrayDeque

		Queue<String> qInDMV = new LinkedList<>();
		qInDMV.offer("Alex");
		// after 2 min
		qInDMV.offer("Misha");             //--> Queue ไม่ใชัและไม่รับ add เพราะไม่ต้องเก็บข้อมูล 
		qInDMV.offer("Tigran");			
		qInDMV.offer("Bek");
		
		// peek will return the element based FIFO but will not remove it from the queue
		String nextEl = qInDMV.peek();
		System.out.println(nextEl);
		
		
		System.out.println("People in the queue line : " + qInDMV);
		
		// poll() will return element from the Queue and it will remove it
		String personInProgress = qInDMV.poll();
		System.out.println("Person in progress : " + personInProgress);
		System.out.println("Person in the queue line : " + qInDMV);
		
		System.out.println("-------------");
		personInProgress = qInDMV.poll();
		System.out.println("Person in progress : " + personInProgress);
		System.out.println("Person in the queue line : " + qInDMV);
		
		while(!qInDMV.isEmpty()) {
			System.out.println("-------------");
			personInProgress = qInDMV.poll();
			System.out.println("Person in progress : " + personInProgress);
			System.out.println("Person in the queue line : " + qInDMV);
		}
	}

}
