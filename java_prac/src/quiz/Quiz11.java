package quiz;

public class Quiz11 {

	public static void main(String[] args) {
		
		int price = 3;
		int count = 4;
		int money = 20;
		int sum = 0;
		for(int i=1;i<=count;i++) {
			sum += price*i;
		}
		if(money>sum) {
			System.out.println("0");
		}else {
			System.out.println("모자람"+(sum-money));
		}
	}

}
