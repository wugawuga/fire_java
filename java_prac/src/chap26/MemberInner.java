package chap26;

class Outer1 {
	private int num = 0;
	
	class Member1 {
		void add(int n) {
			num += n;
		}
		int get() {
			return num;
		}
	}
}

public class MemberInner {

	public static void main(String[] args) {

		Outer1 o1 = new Outer1();
		Outer1 o2 = new Outer1();
		
		// o1 기반으로 두 인스턴스 생성
		Outer1.Member1 o1m1 = o1.new Member1();
		Outer1.Member1 o1m2 = o1.new Member1();
		
		// o2 기반으로 두 인스턴스 생
		Outer1.Member1 o2m1 = o2.new Member1();
		Outer1.Member1 o2m2 = o2.new Member1();
		
		// o1 기반으로 생성된 두 인스턴스 메소드 호출
		o1m1.add(5);
		System.out.println(o1m2.get());
		
		// o2 기반으로 생성된 두 인스턴스 메소드 호출
		o2m1.add(7);
		System.out.println(o2m2.get());
	}

}
