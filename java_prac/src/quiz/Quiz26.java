package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz26 {

	static int N, numbers[], totalCnt;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		N = sc.nextInt();
		numbers = new int[N];

		int M = sc.nextInt();

		switch (M) {
		case 1:
			dice1(0);
			break;
		case 2:
			dice2(0, new boolean[7]);
			break;
		case 3:
			dice3(0, 1);
			break;
		case 4:
			dice4(0, 1);
			break;

		default:
			break;
		}

		System.out.println("총 경우의 수: " + totalCnt);

	}

	// 주사위 던지기 1: 중복순열
	public static void dice1(int cnt) {
		if (cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = 1; i <= 6; i++) { // i=주사위의 눈
			numbers[cnt] = i;
			dice1(cnt + 1);
		}
	}

	// 주사위 던지기 2: 순열 nPr
	public static void dice2(int cnt, boolean[] isSelected) {

		if (cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = 1; i <= 6; i++) {
			if (isSelected[i])
				continue;

			numbers[cnt] = i;
			isSelected[i] = true;

			dice2(cnt + 1, isSelected);
			isSelected[i] = false;
		}
	}

	// 주사위 던지기 3: 중복 조합 nHr=n+r+1Cr
	public static void dice3(int cnt, int start) {
		if (cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = start; i <= 6; i++) {
			numbers[cnt] = i;
			dice3(cnt + 1, i); // 다음 주사위는 선택한 현재 수부터 시도.
		}
	}

	// 주사위 던지기 4: 조합 nCr
	public static void dice4(int cnt, int start) {

		if (cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = start; i <= 6; i++) {
			numbers[cnt] = i;
			dice4(cnt + 1, i + 1); // 다음 주사위는 선택한 현재 수의 다음 수부터 시도.
		}
	}

}