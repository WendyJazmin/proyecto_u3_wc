package com.uce.edu.demo.service.funcional2;

public class InterfaceUnaryOperatorImpl implements IInterfaceUnaryOperator<Double>{

	@Override
	public Double apply(Double arg1) {
		// TODO Auto-generated method stub
		Double area = 4*arg1;
		return area;
	}

}
