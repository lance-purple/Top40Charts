package misc.top40.chart;

public class Chart {
	
	private final ChartSource source;
	private final ChartDate date;

	public Chart(ChartSource fromSource, ChartDate forDate) {
		this.source = fromSource;
		this.date = forDate;
	}
	
	public ChartDate date() {
		return this.date;
	}
	
	public String toString() {
		return this.source + ":" + this.date;
	}
}
