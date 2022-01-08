package quiz;

import java.util.Scanner;

public class Quiz03 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min = 0;
		int max = 0;
		for(int i=1;i <= m;i++) {
			if(n%i==0 && m%i==0) {
				min = i;
				max = n*m / i;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
