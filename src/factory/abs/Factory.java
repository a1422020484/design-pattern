package factory.abs;

public class Factory {
	public SkinFactory display(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		SkinFactory food = (SkinFactory) Class.forName(className).newInstance();
		return food;
	}
}
