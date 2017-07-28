package composite;


public abstract class Company {
	public String name;
	public Company(String name){
		this.name = name;
	}
	
	public abstract void add(Company c);
	public abstract void remove(Company c);
	public abstract void display(int depth);//显示公司名字
	public abstract void lineOfDuty();//职责
	
}
