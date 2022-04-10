package day39;

import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTypes {

	public static void main(String[] args) {
		// HashMap does not maintain insertion order
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(4, "four");
		hashMap.put(3, "three");
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(0, "zero");
		hashMap.put(-7, "seven");
		hashMap.put(null, "ten");
		hashMap.put(10, null);
		hashMap.put(11, null);

		System.out.println(hashMap);// {0=zero, 1=one, 2=two, 3=three, 4=four, -7=seven}
		System.out.println("--------");

		// Hashtable is less poplar(older) version of HashMap
		// 1. HashMap is not synchronize(not thread safe) and Hashtable is
		// synchronized(thread safe)
		// 2. HashMap map allows one null key and multiple null value EX.
		// hashMap.put(null, "zero");
		// Hashtable does not allow null keys and values

		Map<Integer, String> hashTable = new Hashtable<>();
		// hashTable.put(null, "abc"); // Exception here, no null keys allowed in Hashtable	
		// hashTable.put(1, null); // Exception here, no null values allowed in Hashtable
		
		hashTable.put(1, "one");
		hashTable.put(2, "two");
		System.out.println(hashTable);//{2=two, 1=one}
		System.out.println("------------");
		
		//LinkHashMap dose maintain insertion order
		// It is not sync.
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(4, "four");
		linkedHashMap.put(3, "three");
		linkedHashMap.put(1, "one");
		linkedHashMap.put(2, "two");
		linkedHashMap.put(0, "zero");
		linkedHashMap.put(-7, "seven");
		linkedHashMap.put(null, "ten");
		linkedHashMap.put(10, null);
		linkedHashMap.put(11, null);
		System.out.println(linkedHashMap);//{4=four, 3=three, 1=one, 2=two, 0=zero, -7=seven, null=ten, 10=null, 11=null}
		
		
		//TreeMap - it keep elements sorted by the key
		Map<Integer, String> treeMap = new TreeMap<>();
		// No null key for TreeMap
		// treeMap.put(null, "ten");
		treeMap.put(4, "four");
		treeMap.put(3, "three");
		treeMap.put(1, "one");
		treeMap.put(2, "two");
		treeMap.put(0, "zero");
		treeMap.put(-7, "seven");
		//treeMap.put(null, "ten");
		treeMap.put(10, null);
		treeMap.put(11, null);
		System.out.println(treeMap);//{-7=seven, 0=zero, 1=one, 2=two, 3=three, 4=four, 10=null, 11=null}
	}

}
