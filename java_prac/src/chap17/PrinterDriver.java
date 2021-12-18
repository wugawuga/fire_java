package chap17;

interface Printable { // ms가 정의하고 제공한 인터페이스
	
	public void print(String doc);
	
}

class SPrinterDriver implements Printable {
	
	@Override
	public void print(String doc) { // s사가 정의한 클래스
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable {
	
	@Override
	public void print(String doc) { // l사가 정의한 클래스
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

public class PrinterDriver {

	public static void main(String[] args) {
		
		String myDoc = "This is a report about...";
		
		// 삼성 프린터 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		// 엘지 프린터 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}

}
