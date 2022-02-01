package apple_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FilteringApples {
	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
				new Apple(155, Color.GREEN),
				new Apple(120, Color.RED));
		
		List<Apple> heavyApples =
				filterApples(inventory, new AppleHeavyWeightPredicate());
		List<Apple> greenApples =
				filterApples(inventory, new AppleGreenColorPredicate());
		//22-01-31 유캔두
		for(Apple a : heavyApples) {
			System.out.println("150 이상 사과 : "+a.getWeight()+"g, "+a.getColor()+" 색");
		}
		System.out.println("-------------------------------------");
		for(Apple a : greenApples) {
			System.out.println("초록색 사과 : "+a.getWeight()+"g, "+a.getColor()+" 색");
		}
	}

	public static List<Apple> filterApples(List<Apple> inventory, Applepredicate p) {
		
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
