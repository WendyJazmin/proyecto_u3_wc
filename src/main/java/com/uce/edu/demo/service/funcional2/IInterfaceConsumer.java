package com.uce.edu.demo.service.funcional2;

@FunctionalInterface
public interface IInterfaceConsumer<T> {

	public void accept(T dato);
}
