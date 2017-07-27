package observation.other1;

public class ModelObserver2 implements Observer {
	@Override
	public void update() {
		System.out.println("ModelObserver1 接收到了反馈");
	}
}
