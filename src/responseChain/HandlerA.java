package responseChain;

public class HandlerA extends Handler {

	private Handler handler;
	
	@Override
	public void handlerRequest(int request) {
		if (request > 10) {
			System.out.println("HandlerA 处理了");
		} else {
			handler.handlerRequest(request);
		}
	}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
