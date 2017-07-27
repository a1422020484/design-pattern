package observation.other2;

public class ModelObserver1 implements Observer {
	@Override
	public void update() {
		System.out.println("ModelObserver1 接收到了反馈");
	}

}
