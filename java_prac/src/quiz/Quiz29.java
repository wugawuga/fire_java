package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz29 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		
		int[][] arr3 = {{2,3,2},{4,2,4,},{3,1,4}};
		int[][] arr4 = {{5,4,3},{2,4,1},{3,1,1}};
		
		System.out.println(arr1.length);
		
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		for(int x = 0;x<arr1.length;x++) {
			for(int y = 0;y<arr2[0].length;y++) {
				for(int z = 0;z<arr2[0].length;z++) {
				
					answer[x][y] += arr1[x][z] * arr2[z][y];
				}
			}
		}
		System.out.println(Arrays.deepToString(answer));

	}

}
