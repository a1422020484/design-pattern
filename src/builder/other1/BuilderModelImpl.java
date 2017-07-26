package builder.other1;


/**
 * @author Administrator
 *	导演类  就是建造者的类
 */
public class BuilderModelImpl {

	private BuilderModel builderModel;
	
	public BuilderModelImpl(BuilderModel builderModel){
		this.builderModel = builderModel;
	}
	
	void buildPerson() {
		builderModel.setHead();
		builderModel.setFood();
		builderModel.setBody();
	};
	
	public BuilderModel getPerson(){
		return builderModel;
	}

}
