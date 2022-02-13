package quiz;

import java.util.Arrays;

public class Quiz24 {

	public static void main(String[] args) {
		
		// 1. 코드가 실행이 되어야한다.
		// 2. 배열을 역순으로 뒤집기.
		
		int[] r = {1,2,3,4,5,6,7,8,9,10};
		int[] a = new int[10];
		
		for(int i=0, j=r.length-1; j>=0;j--,i++) {
			a[i] = r[j];
		}
		
		System.out.println(Arrays.toString(a));
		
		int[] test2 = {1,2,3,4,5};
		for(int i=0; i<(test2.length)/2;i++) {
			
			int z = test2[i];
			test2[i] = test2[test2.length - 1 - i];
			test2[test2.length - 1 - i] = z;
			
		}
		
		System.out.println(Arrays.toString(test2));
		
	}

}
