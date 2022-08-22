package com.uce.edu.demo.facturacion.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional.TxType;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;


import com.uce.edu.demo.facturacion.repository.modelo.Cliente;


@Repository
@Transactional
public class ClienteRepositoryImpl implements IClienteRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value =TxType.MANDATORY)
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	@Transactional(value =TxType.MANDATORY)
	public Cliente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		
		TypedQuery<Cliente> myQuery = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.cedula =:datoCedula",Cliente.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
		
	}

}
