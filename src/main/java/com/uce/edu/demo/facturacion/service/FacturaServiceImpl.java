package com.uce.edu.demo.facturacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.facturacion.repository.IFacturaRepository;
import com.uce.edu.demo.facturacion.repository.modelo.Factura;


@Service
public class FacturaServiceImpl implements IFacturaService{

	
	@Autowired
	private IFacturaRepository iFacturaRepository;
	
	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.iFacturaRepository.insertar(factura);
	}


	

	
}
