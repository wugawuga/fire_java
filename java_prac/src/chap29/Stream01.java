package chap29;

import java.util.Arrays;
import java.util.List;

public class Stream01 {

	public static void main(String[] args) {
		
		String[] names = {"YOON","LEE","PARK"};
		
		Arrays.stream(names)
		.forEach(s->System.out.println(s));
		
		System.out.println("---------------------------------");
		
		List<String> list = Arrays.asList(names);
		
		list.stream().forEach(s->System.out.println(s));
	}

}
