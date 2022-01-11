package quiz;

public class Quiz07 {

	public static void main(String[] args) {
	    
		String s = "HelloWuga";
		int n = 3;
		String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char alpa = s.charAt(i);
            if(alpa >= 'a' && alpa <= 'z') {
                alpa = (char)((alpa - 'a' + n) % 26 + 'a');
            } else if (alpa >= 'A' && alpa <= 'Z') {
                alpa = (char)((alpa - 'A' + n) % 26 + 'A');
            }
            answer += alpa;
        }
        System.out.println(answer);
	}

}
