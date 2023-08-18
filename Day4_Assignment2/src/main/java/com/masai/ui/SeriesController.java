package com.masai.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.service.SeriesService;

@Controller
public class SeriesController {
	private final SeriesService seriesService;

	@Autowired
	public SeriesController(SeriesService seriesService) {
		this.seriesService = seriesService;
	}

	public List<Series> getAllSeries() {
		return seriesService.getAllSeries();
	}

	public void addSeries(Series series) {
		seriesService.saveSeries(series);
	}

	public void updateSeries(Series updatedSeries) {
		seriesService.updateSeries(updatedSeries);
	}

	public void deleteSeries(long id) {
		seriesService.deleteSeries(id);
	}
}
