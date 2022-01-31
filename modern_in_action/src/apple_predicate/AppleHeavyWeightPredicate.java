package apple_predicate;

public class AppleHeavyWeightPredicate implements Applepredicate{

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}
	
}
