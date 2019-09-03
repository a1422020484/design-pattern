package composite;

/**
 * @author Administrator 组合模式 主要用于树形结构和文件夹形式 将对象组合成树形结构以表示“部分-整体”的层次结构。composite
 *         使得用户对单个对象和组合对象的使用具有一致性。
 *         <p>通过迭代的方式找到儿子 display()
 */
public class Client {
	public static void main(String[] args) {

		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源"));
		root.add(new FinanceDepartment("总公司财务"));

		ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
		comp.add(new HRDepartment("华东人力资源"));
		comp.add(new FinanceDepartment("华东财务"));
		root.add(comp);

		ConcreteCompany comp1 = new ConcreteCompany("南京公司");
		comp1.add(new HRDepartment("南京人力资源"));
		comp1.add(new FinanceDepartment("南京财务"));
		root.add(comp1);

		ConcreteCompany comp2 = new ConcreteCompany("杭州公司");
		comp2.add(new HRDepartment("杭州人力资源"));
		comp2.add(new FinanceDepartment("杭州财务"));
		root.add(comp2);
		root.display("--");

	}
}
