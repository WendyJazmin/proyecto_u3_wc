package com.uce.edu.demo.service.funcional2;

public class InterfaceFunctionImpl implements IInterfaceFunction<Integer,String>{

	@Override
	public Integer aplicar(String dato) {
		// TODO Auto-generated method stub
		Integer n = dato.length();
		return n;
	}

}
