package com.uce.edu.demo.facturacion.repository;

import java.math.BigDecimal;

import com.uce.edu.demo.facturacion.repository.modelo.Producto;

public interface IProductoRepository {

	public void insertar(Producto producto);
	
	public int actualizarPorPrecio(BigDecimal precio);
}
