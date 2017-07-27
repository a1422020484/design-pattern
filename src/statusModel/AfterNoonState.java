package statusModel;

public class AfterNoonState extends State{
	@Override
	public void WriteProgroam(Work w) {
		if (w.getHour() < 18) {
			System.out.println("当前时间" + w.getHour() + "为下午时间");
		} else {
			w.SetState(new EventingState());
			w.WriteProgram();
		}
	}
}
