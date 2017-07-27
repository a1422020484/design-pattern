package facade;

public class FacadeMethod {
	FirstBox fb = new FirstBox();
	SecondBox sb = new SecondBox();
	public void openFile(){
//		方法组
		fb.openFile();
		sb.openFile();
	}
}
