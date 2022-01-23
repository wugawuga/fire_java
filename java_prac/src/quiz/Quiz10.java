package quiz;


public class Quiz10 {

	public static void main(String[] args) {
		int n = 987;
		int answer = 0;
		String[] k = String.valueOf(n).split("");
		for(String z : k) {
			answer += Integer.parseInt(z);
		}
		System.out.println(answer);
	}

}
