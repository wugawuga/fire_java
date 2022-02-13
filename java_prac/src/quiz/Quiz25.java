package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz25 {

	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		hanoi(N,1,2,3);
		System.out.println(cnt);
		System.out.println(sb.toString());
	}
	
	static void hanoi(int N, int start, int middle, int end) {
		
		if(N==0) {
			return;
		}
		++cnt;
		hanoi(N-1,start, end, middle);
		sb.append(start).append(" ").append(end).append("\n");
		hanoi(N-1,middle,start,end);
	}

}
