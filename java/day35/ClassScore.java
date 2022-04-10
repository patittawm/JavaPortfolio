package day35;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassScore {

	public static void main(String[] args) {
		// create List of double
		
		List<Double> classScore = new ArrayList<>(Arrays.asList(89.9, 100.0,78.1,99.9,65.6));
		System.out.println(classScore); //[89.9, 100.0, 78.1, 99.9, 65.6]
		
		double sum = 0.0;
		double maxScore = classScore.get(0);
		double minScore = classScore.get(0);
		//   Double is fine to
		for (double score : classScore) {
			sum += score;
			maxScore = maxScore < score ? score : maxScore;
			minScore = minScore > score ? score : minScore;
		
		}
		System.out.println("sum : "+ sum);
		System.out.println("Max score : "+ maxScore);
		System.out.println("Min score : "+ minScore);
	}

}
