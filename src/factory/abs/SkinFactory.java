package factory.abs;


/**
 * @author Administrator
 * 抽象工厂方法
 */
public interface SkinFactory {
	public TextField createTextField();
	public ComboBox createComboBox();
	public Button createButton();
}
