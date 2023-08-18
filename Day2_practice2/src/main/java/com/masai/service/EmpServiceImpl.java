package com.masai.service;

import java.util.Set;

import com.masai.Emp;
import com.masai.dao.EmpDao;
import com.masai.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService {
	EmpDao empDao = new EmpDaoImpl();

	public EmpServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpServiceImpl(EmpDao empDao) {
		super();
		this.empDao = empDao;
	}

	@Override
	public void add(Emp emp) {
		empDao.add(emp);
	}

	@Override
	public Set<Emp> show() {
		return empDao.show();
	}

}
