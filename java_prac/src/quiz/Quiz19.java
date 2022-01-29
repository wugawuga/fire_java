package quiz;

import java.util.Set;
import java.util.TreeSet;

public class Quiz19 {

	public static int[] main(String[] args) {
		
		int[] arr = {6,2,5,3,1};
		Set<Integer> set = new TreeSet<Integer>();
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				set.add(arr[i]+arr[j]);
				}
		}
		return set.stream().mapToInt(Integer::intValue).toArray();
	}

}
