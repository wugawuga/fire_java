package quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		String[] seoul = {"Jane","Kim"};
		
		int x = 0;
		for (String name : seoul) {
			if(name.equals("Kim"))break;
			x++;
		}
		System.out.println("김서방은 "+x+"에 있다");
	}

}
