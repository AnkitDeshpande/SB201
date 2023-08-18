package com.masai.dao;

import java.util.Set;

import com.masai.Emp;

public interface EmpDao {

	public void add(Emp emp);

	public Set<Emp> show();
}
