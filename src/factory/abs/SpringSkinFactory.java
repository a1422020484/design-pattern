package factory.abs;

public class SpringSkinFactory implements SkinFactory {

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SpringComboBox();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SpringButton();
	}

}
