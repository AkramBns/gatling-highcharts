/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Gatling Highcharts License
 */
package com.excilys.ebi.gatling.highcharts.component
import org.joda.time.DateTime

import com.excilys.ebi.gatling.charts.series.Series
import com.excilys.ebi.gatling.highcharts.series.{ ResponseTimeSeries, NumberPerSecondSeries }
import com.excilys.ebi.gatling.highcharts.template.RequestDetailsLatencyTemplate

class RequestDetailsLatencyComponent(latencySuccess: Series[DateTime, Int], latencyFailures: Series[DateTime, Int], allActiveSessions: Series[DateTime, Int])
	extends HighchartsComponent(
		new RequestDetailsLatencyTemplate(
			"Latency during simulation",
			new ResponseTimeSeries(latencySuccess.name, latencySuccess.data, latencySuccess.colors.head),
			new ResponseTimeSeries(latencyFailures.name, latencyFailures.data, latencyFailures.colors.head),
			new NumberPerSecondSeries(allActiveSessions.name, allActiveSessions.data, allActiveSessions.colors.head)))