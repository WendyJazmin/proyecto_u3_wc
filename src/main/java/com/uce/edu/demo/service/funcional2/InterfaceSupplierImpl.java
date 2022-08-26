package com.uce.edu.demo.service.funcional2;

import java.util.Random;

public class InterfaceSupplierImpl implements IInterfaceSupplier<Integer>{

	@Override
	public Integer get() {
		int random = new Random().nextInt();
		return random;
	}

}
