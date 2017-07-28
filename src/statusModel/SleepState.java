package statusModel;

public class SleepState extends State {

	@Override
	public void WriteProgroam(Work w) {
		System.out.println("现在" + w.getHour() + "必须要睡觉了");
	}

}
