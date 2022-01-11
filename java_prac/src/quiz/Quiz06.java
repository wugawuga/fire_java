package quiz;

public class Quiz06 {

	public static void main(String[] args) {
		
		String s = "hello world wuga";
		String answer = "";
		int x = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				answer += " ";
				x = 0;
			}else {
				if(x%2 == 0)answer += Character.toUpperCase(s.charAt(i));
				else answer += Character.toLowerCase(s.charAt(i));
			}
			x++;
		}
		System.out.println(answer);
	}

}
