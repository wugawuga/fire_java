package quiz;

import java.util.Scanner;

public class Quiz31 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		int i, j, min, temp, index = 0;
		
		for(int w = 0;w<N;w++) {
			arr[w] = sc.nextInt();
		}
		
		for(i=0;i<N;i++) {
			
			min = 9999;
			for(j=i;j<N;j++) {
				
				if(min>arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		for(int k = 0;k<N;k++) {
			
			System.out.println(arr[k]);
		}
	}

}
