package com.uce.edu.demo.facturacion.service;

import com.uce.edu.demo.facturacion.repository.modelo.Cliente;

public interface IClienteService {

	public void insertar(Cliente cliente);
	public Cliente buscarPorCedula(String cedula);
}
