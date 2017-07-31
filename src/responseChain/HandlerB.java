package responseChain;

public class HandlerB extends Handler {

	private Handler handler;
	
	@Override
	public void handlerRequest(int request) {
		if (request > 20) {
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
