package misc.top40.chart.tests;

import static org.junit.Assert.assertEquals;
import misc.top40.chart.ChartDate;

import org.junit.Test;

public class ChartDateTests {

	@Test
	public void testPreviousWeek() {
		assertEquals(ChartDate.of(1950,1,7).previousWeek(), ChartDate.of(1949,12,1));
	}
}
