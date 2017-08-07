package adapter;

public class Adapter extends AdapteeSpec implements Target {

	@Override
	public void request() {
		specificRequest();
	}

	@Override
	public void specificRequest() {
		System.out.println("被适配类具有 特殊功能...");
	}

}
