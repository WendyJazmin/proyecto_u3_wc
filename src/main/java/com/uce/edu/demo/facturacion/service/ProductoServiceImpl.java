package com.uce.edu.demo.facturacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.facturacion.repository.IProductoRepository;
import com.uce.edu.demo.facturacion.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.insertar(producto);
	}

	@Override
	public int actualizarPorPrecio(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.actualizarPorPrecio(precio);
	}

}
