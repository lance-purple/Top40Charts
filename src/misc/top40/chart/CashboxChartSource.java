package misc.top40.chart;

public class CashboxChartSource implements ChartSource {

	private static final ChartDate EARLIEST_DATE = ChartDate.of(1950,1,7);
	
	private static final ChartDate LATEST_DATE = ChartDate.of(1996,11,16);
	
	@Override
	public ChartDate earliestDate() {
		return EARLIEST_DATE;
	}

	@Override
	public ChartDate latestDate() {
		return LATEST_DATE;
	}

	@Override
	public Chart getChart(ChartDate forDate) {
		if (forDate.before(EARLIEST_DATE)) {
			return null;
		}
		return new Chart(this, forDate);
	}
	
	public String toString() {
		return "Cashbox";
	}

}
