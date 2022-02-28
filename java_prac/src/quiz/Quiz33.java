package quiz;

import java.util.Scanner;

public class Quiz33 {
	
//	조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//	조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//	조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		String nn = Integer.toBinaryString(n);
		
		int cnt = 0;
		
		char[] nns = nn.toCharArray();
		
		for(char a : nns) {
			if(a == '1') {
				cnt++;
			}
		}
		
		while(true) {
			
			n++;
			char[] wws = Integer.toBinaryString(n).toCharArray();
			int wnt = 0;
			for(char a : wws) {
				if(a == '1') {
					wnt++;
				}
			}
			if(cnt == wnt) {
				break;
			}
		}
		
		System.out.println(n);
	}
}
