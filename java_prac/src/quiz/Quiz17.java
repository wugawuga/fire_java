package quiz;

public class Quiz17 {

	public static void main(String[] args) {
		
		int n = 626331;
		int cnt = 0;
		while(n != 1) {
			if(n%2==0) {
				n = n/2;
			}else {
				n = (n*3) + 1;
			}
			cnt++;
			if(cnt > 500) {
				System.out.println("-1");
			}
		}
		System.out.println(cnt);
	}
}
