package factory.simple;

public class FoodFactory {
	public Food createFood(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Food food = (Food) Class.forName(className).newInstance();
		return food;
	}
}
