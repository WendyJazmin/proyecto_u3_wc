package com.uce.edu.demo.perfume.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uce.edu.demo.perfume.repository.modelo.Almacen;
import com.uce.edu.demo.repository.modelo.Hotel;

@Repository
@Transactional
public class AlmacenRepositoryImpl implements IAlmacenRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Almacen almacen) {
		// TODO Auto-generated method stub
		this.entityManager.persist(almacen);
	}
	
	@Override
	public Almacen buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Almacen.class, id);
	}

	@Override
	public List<Almacen> buscarAlmacenInnerJoin(String tipoPerfume) {
		// TODO Auto-generated method stub
		TypedQuery<Almacen> myQuery = this.entityManager.createQuery("SELECT a FROM Almacen a JOIN a.perfumes pe WHERE pe.tipo = :tipoPerfume",Almacen.class);
		myQuery.setParameter("tipoPerfume", tipoPerfume);
		
		List<Almacen> almacenes = myQuery.getResultList();
		for(Almacen a : almacenes) {
			a.getPerfumes().size();
		}
		
		return almacenes;
	}

	@Override
	public List<Almacen> buscarAlmacenInnerJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Almacen> myQuery = this.entityManager.createQuery("SELECT a FROM Almacen a JOIN a.perfumes pe",Almacen.class);
		return myQuery.getResultList();
		
	}

	@Override
	public List<Almacen> buscarAlmacenOuterJoinLeft(String tipoPerfume) {
		// TODO Auto-generated method stub
		TypedQuery<Almacen> myQuery = this.entityManager.createQuery("SELECT a FROM Almacen a LEFT JOIN a.perfumes pe WHERE pe.tipo = :tipoPerfume",Almacen.class);
		myQuery.setParameter("tipoPerfume", tipoPerfume);
		return myQuery.getResultList();
	}

	@Override
	public List<Almacen> buscarAlmacenOuterJoinLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Almacen> buscarAlmacenOuterJoinRigth(String tipoPerfume) {
		// TODO Auto-generated method stub
		TypedQuery<Almacen> myQuery = this.entityManager.createQuery("SELECT a FROM Almacen a RIGHT JOIN a.perfumes pe WHERE pe.tipo = :tipoPerfume",Almacen.class);
		myQuery.setParameter("tipoPerfume", tipoPerfume);
		return myQuery.getResultList();
	}

	@Override
	public List<Almacen> buscarAlmacenJoinWhere(String tipoPerfume) {
		// TODO Auto-generated method stub
		TypedQuery<Almacen> myQuery = this.entityManager.createQuery("SELECT al FROM Almacen al, Perfume pe WHERE al = pe.almacen AND pe.tipo= :tipoPerfume",Almacen.class);
		myQuery.setParameter("tipoPerfume", tipoPerfume);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Almacen> buscarAlmacenJoinFetch(String tipoPerfume) {
		// TODO Auto-generated method stub
		TypedQuery<Almacen> myQuery = this.entityManager.createQuery("SELECT a FROM Almacen a JOIN FETCH a.perfumes pe WHERE pe.tipo = :tipoPerfume",Almacen.class);
		myQuery.setParameter("tipoPerfume", tipoPerfume);
		
		return myQuery.getResultList();
	}

	

}
