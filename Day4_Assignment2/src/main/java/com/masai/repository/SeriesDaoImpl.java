package com.masai.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.masai.ui.Series;

@Repository
public class SeriesDaoImpl implements SeriesDao {
	private List<Series> seriesList = new ArrayList<>();

	@Override
	public List<Series> getAllSeries() {
		return seriesList;
	}

	public Series getSeriesById(long id) {
		return seriesList.stream().filter(series -> series.getId() == id).findFirst().orElse(null);
	}

	@Override
	public void saveSeries(Series series) {
		seriesList.add(series);
	}

	@Override
	public void updateSeries(Series updatedSeries) {
		Series existingSeries = getSeriesById(updatedSeries.getId());
		if (existingSeries != null) {
			existingSeries.setTitle(updatedSeries.getTitle());

		}
	}

	@Override
	public void deleteSeries(Long id) {
		seriesList.removeIf(series -> series.getId() == id);
	}
}
