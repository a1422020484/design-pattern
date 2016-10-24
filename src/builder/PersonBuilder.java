package builder;


/**
 * @author Administrator
 * 角色 builder
 */
public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	Person buildPerson();
}
