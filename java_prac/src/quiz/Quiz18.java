package quiz;

import java.util.Arrays;

public class Quiz18 {
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,1};
		Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(arr2, (i1, i2) -> i2 - i1);
		Integer[] answer = Arrays.copyOf(arr2, arr2.length-1);
		if(arr.length == 0) {
			System.out.println("-1");
		}
		System.out.println(Arrays.toString(answer));
	}
}
