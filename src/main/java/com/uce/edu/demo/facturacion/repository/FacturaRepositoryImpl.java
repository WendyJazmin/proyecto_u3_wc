package com.uce.edu.demo.facturacion.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional.TxType;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.uce.edu.demo.facturacion.repository.modelo.Cliente;
import com.uce.edu.demo.facturacion.repository.modelo.Factura;


@Repository
@Transactional
public class FacturaRepositoryImpl implements IFacturaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value =TxType.MANDATORY)
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

	@Override
	@Transactional(value =TxType.MANDATORY)
	public Factura buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
	
		TypedQuery<Factura> myQuery = this.entityManager.createQuery("SELECT f FROM Factura f WHERE f.numero =: datoNumero",Factura.class);
		myQuery.setParameter("datoNumero", numero);
		return myQuery.getSingleResult();
	}


	

}
