package quiz;

import java.util.Arrays;

public class Quiz15 {

	public static void main(String[] args) {
		
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"eden","kiki"};
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(int i = 0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				System.out.println(participant[i]);
			}
		}
		System.out.println(participant[participant.length-1]);
		
	}
}
