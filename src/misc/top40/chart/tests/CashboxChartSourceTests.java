package misc.top40.chart.tests;

import static org.junit.Assert.*;
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

}
