package com.uce.edu.demo.service.funcional;

@FunctionalInterface
public interface IPersonaPredicate {

	public Boolean esVerdad(Integer dato);
}
