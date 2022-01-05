package quiz;

import java.util.Scanner;

public class Quiz01 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int left = sc.nextInt();
		int right = sc.nextInt();
		int answer = 0;
		for(int i = left; i<=right ;i++) {
			int count = 0;
			for(int j = 1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count%2 == 0) {
				answer += i;
			}else {
				answer -= i;
			}
			
		}
		System.out.print(answer);
		
	}

}
