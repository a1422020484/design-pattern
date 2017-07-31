package responseChain;

public abstract class Handler {
	
	public abstract void handlerRequest(int request);
	
	public abstract void setHandler(Handler handler);
}
