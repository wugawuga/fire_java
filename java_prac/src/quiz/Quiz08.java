package quiz;

import java.util.*;


public class Quiz08 {

	public static void main(String[] args) {
		
		int[] arr = {5,9,7,10};
		int divisor = 12;
		int[] answer = Arrays.stream(arr).filter(n -> n%divisor==0).sorted().toArray();
		
		answer = answer.length == 0 ? new int[] {-1}:answer;
		
		System.out.println(Arrays.toString(answer));
	}

}
