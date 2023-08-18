package com.masai.repository;

import java.util.List;

import com.masai.ui.Series;

public interface SeriesDao {
	public List<Series> getAllSeries();

	public void saveSeries(Series series);

	public void updateSeries(Series series);

	public void deleteSeries(Long id);
}
