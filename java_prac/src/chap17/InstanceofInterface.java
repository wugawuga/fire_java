package chap17;

interface Printable {
	void printLine(String str);
}

class SimplePrinter implements Printable { // Printable을 직접 구현
	
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter { // Printable을 간접 구현
	
	public void printLine(String str) {
		super.printLine("start of multi...");
		super.printLine(str);
		super.printLine("end of multi");
	}
}

public class InstanceofInterface {

	public static void main(String[] args) {
		
		Printable prn1 = new SimplePrinter();
		Printable prn2 = new MultiPrinter();
		
		if(prn1 instanceof Printable) {
			prn1.printLine("This is a simpel printer.");
		}
		System.out.println();
		
		if(prn2 instanceof Printable) {
			prn2.printLine("This is a multiful printer.");
		}
	}

}
