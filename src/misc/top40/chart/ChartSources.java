package misc.top40.chart;

import misc.top40.chart.ChartSource;
import misc.top40.chart.CashboxChartSource;;

public enum ChartSources {

	CASHBOX(new CashboxChartSource());
	
	private ChartSource chartSource;
	
	ChartSources(ChartSource impl) {
		this.chartSource = impl;
	}

	public ChartSource get() {
		return this.chartSource;
	}

}
