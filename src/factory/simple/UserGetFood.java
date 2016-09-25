package factory.simple;

public class UserGetFood {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FoodFactory ff = new FoodFactory();
		Food food2 = ff.createFood("factory.simple.Orange");
		Food food = ff.createFood("factory.simple.Apple");
		food.getFood();
		food2.getFood();
	}

}
