package statusModel;

public class RestState extends State{

	@Override
	public void WriteProgroam(Work w) {
		System.out.println("下班" + w.getHour());
	}

}
