package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.masai.repository.SeriesDao;
import com.masai.ui.Series;

@Service
public class SeriesServiceImpl implements SeriesService {
	
	@Autowired
	private final SeriesDao seriesDao;

	@Autowired
	public SeriesServiceImpl(@Qualifier("seriesDaoImpl") SeriesDao seriesDao) {
		this.seriesDao = seriesDao;
	}

	@Override
	public List<Series> getAllSeries() {
		return seriesDao.getAllSeries();
	}

	@Override
	public void saveSeries(Series series) {
		seriesDao.saveSeries(series);
	}

	@Override
	public void updateSeries(Series updatedSeries) {
		seriesDao.updateSeries(updatedSeries);
	}

	@Override
	public void deleteSeries(Long id) {
		seriesDao.deleteSeries(id);
	}
}
