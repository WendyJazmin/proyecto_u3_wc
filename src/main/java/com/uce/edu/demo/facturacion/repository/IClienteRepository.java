package com.uce.edu.demo.facturacion.repository;

import com.uce.edu.demo.facturacion.repository.modelo.Cliente;

public interface IClienteRepository {

	public void insertar(Cliente cliente);
	public Cliente buscarPorCedula(String cedula);
}
