package composite;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {

	}

	@Override
	public void remove(Company c) {

	}

	@Override
	public void display(String depth) {
		System.out.println(depth + name);

	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + "员工培训");
	}

}
