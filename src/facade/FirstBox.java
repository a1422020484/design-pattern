package facade;

public class FirstBox implements Facade {

	@Override
	public void getKey() {
		// TODO Auto-generated method stub
		System.out.println("获得一个钥匙");
	}

	@Override
	public void getFile() {
		// TODO Auto-generated method stub
		System.out.println("打开第一个盒子里获得一个文件");
	}

	@Override
	public void openFile() {
		// TODO Auto-generated method stub
		System.out.println("打开这个文件，获得第下个盒子的钥匙");
	}

}
