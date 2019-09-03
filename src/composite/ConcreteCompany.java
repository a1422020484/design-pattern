package composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

	private List<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(String depth) {
		System.out.println(depth + name);
		for (Company c : children) {
			c.display(depth + "--");
			c.lineOfDuty();
		}
	}

	@Override
	public void lineOfDuty() {
		for (Company c : children) {
			c.lineOfDuty();
		}
	}

}
