package quiz;

import java.util.Scanner;

public class Quiz32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x, y, temp = 0;
		int[] arr = new int[N];
		
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(x=0;x<N-1;x++) {
			
			y = x;
			while(arr[y] > arr[y+1]) {
				
				temp = arr[y];
				arr[y] = arr[y+1];
				arr[y+1] = temp;
				y--;
			}
			
		}
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
	}

}
