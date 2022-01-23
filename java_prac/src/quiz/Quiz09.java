package quiz;

public class Quiz09 {

	public static boolean main(String[] args) {
		int count = 0;
		String s = "Hello Java";
		char[] k = s.toUpperCase().toCharArray();
		for(char py : k) {
			if(py == 'P') {
				count++;
			}
			if(py == 'Y') {
				count--;
			}
		}
        if(count==0){
            return true;
        }else{
            return false;
        }
	}

}
