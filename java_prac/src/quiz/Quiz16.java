package quiz;

import java.util.Set;
import java.util.TreeSet;

public class Quiz16 {

	public static void main(String[] args) {
		
		int[] arr = {3,3,3,2,2,2,2};
		Set<Integer> answer = new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			answer.add(arr[i]);
		}
		System.out.println(answer.size());
	}

}
