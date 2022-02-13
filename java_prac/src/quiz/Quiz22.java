package quiz;

import java.util.Scanner;

public class Quiz22 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print(">> ");
		int a = sc.nextInt();
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				int k = Math.min(j, i);
				int b = Math.min(k, a-i-1);
				int c = Math.min(b, a-j-1);
				int d;
				if(j>=i) {
					d = i+j - c*2;
				}else {
					d = (a-1 - c*2)*4 - (i+j - c*2);
				}
				d += 4*(c*a-(c*c));
				System.out.print(d+1+"\t");
			}
			System.out.println();
		}
	}
}
