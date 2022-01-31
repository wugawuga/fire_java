package apple_predicate;

public class AppleGreenColorPredicate implements Applepredicate{

	@Override
	public boolean test(Apple apple) {
		return Color.GREEN.equals(apple.getColor());
	}
	
}
