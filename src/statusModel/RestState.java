package statusModel;

public class RestState extends State{

	@Override
	public void WriteProgroam(Work w) {
		System.out.println("现在是下班时间" + w.getHour());
	}

}
