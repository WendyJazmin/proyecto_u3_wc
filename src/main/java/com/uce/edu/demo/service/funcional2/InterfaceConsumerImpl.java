package com.uce.edu.demo.service.funcional2;

import java.time.LocalDateTime;

public class InterfaceConsumerImpl implements IInterfaceConsumer<LocalDateTime> {

	@Override
	public void accept(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("fecha actual: "+fecha);
	}

}
