package com.masai.dao;

import java.util.HashSet;
import java.util.Set;

import com.masai.Emp;

public class EmpDaoImpl implements EmpDao {
	Set<Emp> set = new HashSet<Emp>();

	public EmpDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpDaoImpl(Set<Emp> set) {
		super();
		this.set = set;
	}

	@Override
	public void add(Emp emp) {
		set.add(emp);
	}

	@Override
	public Set<Emp> show() {
		return set;
	}
}
