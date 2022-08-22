package com.uce.edu.demo.facturacion.service;

import java.math.BigDecimal;

import com.uce.edu.demo.facturacion.repository.modelo.Producto;

public interface IProductoService {

	public void insertar(Producto producto);
	public int actualizarPorPrecio(BigDecimal precio);

}
