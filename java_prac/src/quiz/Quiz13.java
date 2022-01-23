package quiz;

public class Quiz13 {

	public static void main(String[] args) {
		
		String s = "adxdb";
		String answer;
		int k = s.length();
		if(k%2==0) {
			answer = String.valueOf(s.charAt(k/2-1))+String.valueOf(s.charAt(k/2));
		}else {
			answer = String.valueOf(s.charAt(k/2));
		}
		System.out.println(answer);
	}

}
