package factory.simple;

/**
 * @author Administrator
 * 核心将类的实现与调用分离
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
