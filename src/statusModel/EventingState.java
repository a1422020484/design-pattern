package statusModel;

public class EventingState extends State {
	@Override
	public void WriteProgroam(Work w) {
		if(w.isFinish()){
			w.SetState(new RestState());
			w.WriteProgram();
		} else {
			if (w.getHour() < 20) {
				System.out.println("当前时间" + w.getHour() + "为晚上加班时间");
			} else {
				w.SetState(new SleepState());
				w.WriteProgram();
			}
		}
	}
}
