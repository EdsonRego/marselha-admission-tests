package Application;

public class FoodFactory {

	public Food getFood(String order) {

		if ("pizza".equals(order)) {

			return new Pizza();

		} else if ("cake".equals(order)) {

			return new Cake();

		}

		return null;

	}
}
