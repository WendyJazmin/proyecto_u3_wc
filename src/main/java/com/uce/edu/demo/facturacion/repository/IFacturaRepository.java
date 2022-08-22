package com.uce.edu.demo.facturacion.repository;

import com.uce.edu.demo.facturacion.repository.modelo.Factura;

public interface IFacturaRepository {

	public void insertar(Factura factura);
	public Factura buscarPorNumero(String numero);
}
