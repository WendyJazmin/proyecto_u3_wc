package com.uce.edu.demo.service.funcional2;

import java.util.Random;

public class InterfacePredicateImpl implements IInterfacePredicate<Double> {

	@Override
	public boolean multiplicar(Double dato) {
		// TODO Auto-generated method stub
		Double r = 2.4;
		if(r*dato>0) {
			return true;
		}else {
		return false;
		}
	}

}
