package statusModel;

public class NoonState extends State{
	@Override
	public void WriteProgroam(Work w) {
		if (w.getHour() < 14) {
			System.out.println("当前时间" + w.getHour() + "为午休时间");
		} else {
			w.SetState(new AfterNoonState());
			w.WriteProgram();
		}
	}
}
