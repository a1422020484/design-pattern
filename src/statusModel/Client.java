package statusModel;

/**
 * @author Administrator
 * 核心：状态切换和状态终结
 */
public class Client {

	public static void main(String[] args) {
		Work emergencyProjects = new Work();
		for(int i = 9;i < 21 ; i++){
			emergencyProjects.setHour(i);
			emergencyProjects.WriteProgram();
			if(i == 21){
				emergencyProjects.setFinish(true);
			}
		}
	}

}
