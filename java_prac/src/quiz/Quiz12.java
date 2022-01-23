package quiz;

public class Quiz12 {

	public static void main(String[] args) {
		
		int n = 100;
		int answer = 0;
        for(int i=2;i<=n;i++)
            if(n%i==1) {
            	System.out.println(i);
            }
        System.out.println(answer);

	}

}
