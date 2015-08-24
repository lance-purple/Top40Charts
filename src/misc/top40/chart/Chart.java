package misc.top40.chart;

public class Chart {
	
	private final ChartDate date;

	public Chart(ChartDate forDate) {
		this.date = forDate;
	}
	
	public ChartDate date() {
		return this.date;
	}
}
