package chap07;

import java.util.Scanner;

public class Juice {
	
	static Scanner sc = new Scanner(System.in);
	static int don;
	private static int coke = 1000;
	private static int sprite = 500;
	
	public static void main(String[] args) {
		
		System.out.println("우가 자판기에요");
		System.out.println("돈을 넣어주세요");
		System.out.print(">> ");
		don = Integer.parseInt(sc.nextLine());
		
		if(don>0) {
			boolean stop = false;
			while(!stop) {
				System.out.println(don+"원 있어요");
				System.out.println("1. 음료 선택");
				System.out.println("2. 거스름돈 받기");
				System.out.println("3. 끝");
				System.out.println();
				System.out.print(">> ");
				int selectMenu = Integer.parseInt(sc.nextLine());
				
				switch(selectMenu) {
				case 1:
					selectJuice();
					break;
				case 2:
					changeMoney();
					break;
				case 3:
					System.out.println("맛있게 드세요");
					return;
				default:
					System.out.println("다시 입력해 주세요!");
					break;
				}
			}
		}else {
			System.out.println("돈 다시 넣어요");
		}
	}

	private static void changeMoney() {
		System.out.println(don+"남았어요!");
		return;
	}

	private static void selectJuice() {
		
		boolean stop = false;
		while(!stop) {
			System.out.println("음료를 선택해요");
			System.out.println("1. 콜라 1000원");
			System.out.println("2. 사이다 500원");
			System.out.println("3. 나가기");
			System.out.print(">> ");
			int selectSoda = Integer.parseInt(sc.nextLine());
				switch(selectSoda) {
				case 1:
					System.out.println("콜라 선택!");
					System.out.println("잔액은 "+(don-coke)+"원");
					don = don-coke;
					return;
				case 2:
					System.out.println("사이다 선택!");
					System.out.println("잔액은 "+(don-sprite)+"원");
					don = don-sprite;
					return;
				case 3:
					System.out.println("왜 안먹어요?");
					return;
				default:
					break;
				}
		}
	}

}
