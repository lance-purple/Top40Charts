package misc.top40.chart;

import java.util.GregorianCalendar;

@SuppressWarnings("serial")
public class ChartDate extends GregorianCalendar {

	public ChartDate() {
		setTimeInMillis(0);
	}
	
	public ChartDate(int year, int month, int day) {
		setTimeInMillis(0);
		set(YEAR, year);
		set(MONTH, month - 1);
		set(DAY_OF_MONTH, day);
	}

	public static ChartDate of(int year, int month, int day) {
		return new ChartDate(year, month, day);
	}
	
	private String twoDigitString(int value) {
		String leader = (value < 10) ? "0" : "";
		return leader + value;
	}
	
	public String toString() {
		int displayYear = get(YEAR);
		int displayMonth = get(MONTH) + 1;
		int displayDay = get(DAY_OF_MONTH);
		
		return displayYear + "/" + twoDigitString(displayMonth) + "/" + twoDigitString(displayDay);
	}

}
