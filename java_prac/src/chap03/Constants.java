package chap03;

public class Constants {

	public static void main(String[] args) {
		
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12; // 할당하지 않았던 상수의 값 할당
		System.out.println("상수 1 : "+MAX_SIZE);
		System.out.println("상수 2 : "+CONST_CHAR);
		System.out.println("상수 3 : "+CONST_ASSIGNED);
	}

}
