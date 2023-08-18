package com.masai.service;

import java.util.Set;

import com.masai.Emp;

public interface EmpService {
	public void add(Emp emp);

	public Set<Emp> show();
}
