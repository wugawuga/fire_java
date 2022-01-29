package quiz;

public class Quiz20 {

	public static void main(String[] args) {
		
		int n = 13;
		int k = n;
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n /= 10;
		}
		System.out.println(k%sum == 0 ? true : false);
	}

}
