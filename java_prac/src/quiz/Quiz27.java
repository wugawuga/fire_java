package quiz;

import java.util.Scanner;

public class Quiz27 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for(int j = 1; j<=T;j++) {
			String card = sc.nextLine();
			
			String[] car = card.split(" ");
			
			System.out.print("#"+j+" ");
			for(int i=0;i<(car.length+1)/2;i++) {
			
				if(i == (car.length-1)/2) {
				
					if(car.length%2 == 0) {
						System.out.print(car[i]+" "+car[(car.length+1)/2+i]);
					}else {
						System.out.print(car[i]+" ");
					}
					break;
				}
				System.out.print(car[i]+" "+car[(car.length+1)/2 +i]+" ");
			}
		}
	}
}
