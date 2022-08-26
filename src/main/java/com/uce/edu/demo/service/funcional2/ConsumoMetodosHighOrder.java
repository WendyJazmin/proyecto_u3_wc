package com.uce.edu.demo.service.funcional2;

import java.time.LocalDateTime;
import java.util.Random;

public class ConsumoMetodosHighOrder {
	
	public Integer consumirSupplier(IInterfaceSupplier<Integer> funcion) {
		Integer r = new Random().nextInt();
		return r+funcion.get();
	}
	
	public void consumirConsumer(IInterfaceConsumer<LocalDateTime>funcion, LocalDateTime fecha) {
		funcion.accept(fecha);
	}
	
	public boolean consumirPredicate(IInterfacePredicate<String>funcion,String valor) {
		return funcion.multiplicar(valor);
	}
	
	public Integer consumirFunction(IInterfaceFunction<Integer,String>funcion, String valor) {
		return funcion.aplicar(valor);
	}
	
	public Double consumirUnaryOperator(IInterfaceUnaryOperator<Double>funcion, Double valor) {
		return funcion.apply(valor);
	}
}

