package factory.abs;

public class SummerSkinFactory implements SkinFactory {

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SummerTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SummerCommBox();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SummerButton();
	}

}
