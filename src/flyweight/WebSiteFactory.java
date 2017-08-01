package flyweight;

import java.util.Hashtable;

public class WebSiteFactory {

	private Hashtable<String, ConcreteWebSite> table = new Hashtable<String, ConcreteWebSite>();

	public WebSite getWebSite(String name) {
		if (!table.containsKey(name))
			table.put(name, new ConcreteWebSite(name));
		return table.get(name);
	}

	public Hashtable<String, ConcreteWebSite> getTable() {
		return table;
	}
}
