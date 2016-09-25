package factory.abs;

public class Clinet {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Factory fc = new Factory();
		SkinFactory sf = fc.display("factory.abs.SummerSkinFactory");
		sf.createButton().display();
		sf.createComboBox().display();
		sf.createTextField().display();
		
	}

}
