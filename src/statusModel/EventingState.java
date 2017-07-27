package statusModel;

public class EventingState extends State{
	@Override
	public void WriteProgroam(Work w) {
		if (w.getHour() < 20) {
			System.out.println("当前时间" + w.getHour() + "为晚上时间");
		} else {
			w.SetState(new RestState());
			w.WriteProgram();
		}
	}
}
