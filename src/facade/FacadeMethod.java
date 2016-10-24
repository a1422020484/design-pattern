package facade;

public class FacadeMethod {
	FirstBox fb = new FirstBox();
	SecondBox sb = new SecondBox();
	public void openFile(){
		fb.openFile();
		sb.openFile();
	}
}
