package com.uce.edu.demo.perfume.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uce.edu.demo.perfume.repository.modelo.Perfume;

@Repository
@Transactional
public class PerfumeRepositoryImpl implements IPerfumeRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Perfume perfume) {
		// TODO Auto-generated method stub
		this.entityManager.persist(perfume);
	}

	@Override
	public Perfume buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Perfume.class, id);
	}

}
