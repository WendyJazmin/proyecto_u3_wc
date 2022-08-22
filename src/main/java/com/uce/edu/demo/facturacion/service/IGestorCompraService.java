package com.uce.edu.demo.facturacion.service;

import java.util.List;


public interface IGestorCompraService {

	public void realizarCompra(String cedula, String numFactura, List<String> codigoBarras);
}
