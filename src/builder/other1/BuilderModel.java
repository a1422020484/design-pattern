package builder.other1;


public abstract class BuilderModel {
	abstract void getHead();
	abstract void getFood();
	abstract void getBody();
	abstract Person getPerson();
	void buildPerson(){
		getHead();
		getFood();
		getBody();
	};
	
	public static BuilderModel getPersonModel(BuilderModel builderModel){
		return builderModel;
	}
	
}
