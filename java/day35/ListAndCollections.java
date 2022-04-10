package day35;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListAndCollections {   // Interview

	public static void main(String[] args) {
		// What's the built-in helper class for array in Java?
		// Arrays is helper for array

		// Collections is helper class for ArrayList(collection framework)

		// sort
		List<Integer> list = new ArrayList<>(Arrays.asList(4, 9, 8, 2, 1, 0, 15));
		System.out.println(list); // [4, 9, 8, 2, 1, 0, 15]
		Collections.sort(list);

		System.out.println(list); // [0, 1, 2, 4, 8, 9, 15]

		// search
		// [0, 1, 2, 4, 8, 9, 15]
		int res = Collections.binarySearch(list, 8);
		System.out.println("Res index of 8: " + res); //Res index of 8: 4

		// reverse
		Collections.reverse(list);
		System.out.println(list); // [15, 9, 8, 4, 2, 1, 0]

		// shuffle
		Collections.shuffle(list);
		System.out.println(list);//[9, 2, 0, 1, 15, 8, 4]

		// addAll
		Collections.addAll(list, 7, 7, 7, 7);
		System.out.println(list);//[9, 2, 0, 1, 15, 8, 4, 7, 7, 7, 7]

	}

}
