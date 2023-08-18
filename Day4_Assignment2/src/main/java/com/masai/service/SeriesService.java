package com.masai.service;

import java.util.List;

import com.masai.ui.Series;

public interface SeriesService {

	public List<Series> getAllSeries();

	public void saveSeries(Series series);

	public void updateSeries(Series series);

	public void deleteSeries(Long id);

}
