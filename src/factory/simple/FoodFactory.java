package factory.simple;

public class FoodFactory {
	public Food createFood(String className) throws Exception{
		Food food = (Food) Class.forName(className).newInstance();
		return food;
	}
}
