package listener;

import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

public class App {
	public static void main(String[] args) {
		Map<String, ListenerEvent> loaderMap = applicationContext.getBeansOfType(ListenerEvent.class);
		Iterator<ListenerEvent> list = loader.iterator();
		while(list.hasNext()) {
			list.next().putIntoListener();
		}
		EventManager.getEventManager().tiggerEvent(1);
	}
}
