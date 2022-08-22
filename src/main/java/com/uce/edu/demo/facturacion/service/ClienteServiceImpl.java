package com.uce.edu.demo.facturacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.facturacion.repository.IClienteRepository;
import com.uce.edu.demo.facturacion.repository.modelo.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepository iClienteRepository;

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepository.insertar(cliente);
	}

	@Override
	public Cliente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iClienteRepository.buscarPorCedula(cedula);
	}
	
}
