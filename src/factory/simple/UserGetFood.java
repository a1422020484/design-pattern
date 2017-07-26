package factory.simple;

/**
 * @author Administrator
 * 
 */
public class UserGetFood {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FoodFactory ff = new FoodFactory();
		Food food2 = ff.createFood("factory.simple.Orange");
		Food food = ff.createFood("factory.simple.Apple");
		food.getFood();
		food2.getFood();
	}

}
