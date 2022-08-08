package com.uce.edu.demo.perfume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.perfume.repository.IAlmacenRepository;
import com.uce.edu.demo.perfume.repository.modelo.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	private IAlmacenRepository iAlmacenRepository;
	
	@Override
	public void insertar(Almacen almacen) {
		// TODO Auto-generated method stub
		this.iAlmacenRepository.insertar(almacen);
	}

	@Override
	public Almacen buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iAlmacenRepository.buscar(id);
	}

	@Override
	public List<Almacen> buscarAlmacenInnerJoin(String tipoPerfume) {
		// TODO Auto-generated method stub
		return this.iAlmacenRepository.buscarAlmacenInnerJoin(tipoPerfume);
	}

	@Override
	public List<Almacen> buscarAlmacenInnerJoin() {
		// TODO Auto-generated method stub
		return this.iAlmacenRepository.buscarAlmacenInnerJoin();
	}

	@Override
	public List<Almacen> buscarAlmacenOuterJoinLeft(String tipoPerfume) {
		// TODO Auto-generated method stub
		return this.iAlmacenRepository.buscarAlmacenOuterJoinLeft(tipoPerfume);
	}

	@Override
	public List<Almacen> buscarAlmacenOuterJoinLeft() {
		// TODO Auto-generated method stub
		return this.iAlmacenRepository.buscarAlmacenOuterJoinLeft();
	}

	@Override
	public List<Almacen> buscarAlmacenOuterJoinRigth(String tipoPerfume) {
		// TODO Auto-generated method stub
		return this.iAlmacenRepository.buscarAlmacenOuterJoinRigth(tipoPerfume);
	}

	@Override
	public List<Almacen> buscarAlmacenJoinWhere(String tipoPerfume) {
		// TODO Auto-generated method stub
		return this.iAlmacenRepository.buscarAlmacenJoinWhere(tipoPerfume);
	}

	@Override
	public List<Almacen> buscarAlmacenJoinFetch(String tipoPerfume) {
		// TODO Auto-generated method stub
		return this.iAlmacenRepository.buscarAlmacenJoinFetch(tipoPerfume);
	}

	
}
