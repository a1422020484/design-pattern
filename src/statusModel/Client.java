package statusModel;

public class Client {

	public static void main(String[] args) {
		Work emergencyProjects = new Work();
		for(int i = 9;i < 22 ; i++){
			emergencyProjects.setHour(i);
			emergencyProjects.WriteProgram();
		}
	}

}
