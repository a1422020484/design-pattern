package statusModel;

public class ForenoonState extends State {

	@Override
	public void WriteProgroam(Work w) {
		if (w.getHour() < 12) {
			System.out.println("当前时间" + w.getHour() + "为上午时间");
		} else {
			w.SetState(new NoonState());
			w.WriteProgram();
		}
	}
}
