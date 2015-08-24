package misc.top40.chart;

public interface ChartSource {

	ChartDate earliestDate();

	ChartDate latestDate();

	Chart getChart(ChartDate forDate);

}
