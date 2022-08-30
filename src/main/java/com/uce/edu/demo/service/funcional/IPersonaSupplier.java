package com.uce.edu.demo.service.funcional;

@FunctionalInterface
public interface IPersonaSupplier</*? extends*/ T> {//se puede recibir cualquier objeto que descienda de T

	public T getNombre();
}
