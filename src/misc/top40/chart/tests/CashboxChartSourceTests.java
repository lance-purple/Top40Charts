package misc.top40.chart.tests;

import static org.junit.Assert.*;
import misc.top40.chart.Chart;
import misc.top40.chart.ChartDate;
import misc.top40.chart.ChartSource;
import misc.top40.chart.ChartSources;

import org.junit.Test;

public class CashboxChartSourceTests {

	@Test
	public void testEarliestDateForCashboxChartSource() {
		ChartSource cashbox = ChartSources.CASHBOX.get();
		assertEquals(cashbox.earliestDate(), ChartDate.of(1950,1,7));
	}

	@Test
	public void testLatestDateForCashboxChartSource() {
		ChartSource cashbox = ChartSources.CASHBOX.get();
		assertEquals(cashbox.latestDate(),  ChartDate.of(1996,11,16));
	}

	private void assertCannotGetChartForChartSourceByDate(ChartSource source, ChartDate date) {
		Chart chart = source.getChart(date);
		assertNull(chart);
	}
	
	private void assertCanGetChartForChartSourceByDate(ChartSource source, ChartDate date) {
		Chart chart = source.getChart(date);
		assertNotNull(chart);
		assertEquals(chart.date(), date);
	}

	@Test
	public void testGetChartForCashboxChartSourceEarliestDate() {
		ChartSource cashbox = ChartSources.CASHBOX.get();
		assertCanGetChartForChartSourceByDate(cashbox, cashbox.earliestDate());
	}
	
	@Test
	public void testGetChartFailsPriorToCashboxChartSourceEarliestDate() {
		ChartSource cashbox = ChartSources.CASHBOX.get();
		ChartDate badDate = cashbox.earliestDate().previousWeek();
		assertCannotGetChartForChartSourceByDate(cashbox, badDate);
	}

	@Test
	public void testGetChartForCashboxChartSourceLatestDate() {
		ChartSource cashbox = ChartSources.CASHBOX.get();
		assertCanGetChartForChartSourceByDate(cashbox, cashbox.latestDate());		
	}
	
	
}
