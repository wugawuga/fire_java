package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz04 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long a = sc.nextLong();
		String number = String.valueOf(a);
		String[] num = number.split("(?<=.)");
		Arrays.sort(num);
		String nms="";
		for(int i=num.length-1; 0<=i;i--) {
			nms += num[i];
		}
		long answer = Long.parseLong(nms);
		System.out.println(answer);

	}

}
