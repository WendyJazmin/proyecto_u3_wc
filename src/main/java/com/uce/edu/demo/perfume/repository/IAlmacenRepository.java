package com.uce.edu.demo.perfume.repository;

import java.util.List;

import com.uce.edu.demo.perfume.repository.modelo.Almacen;
import com.uce.edu.demo.repository.modelo.Hotel;

public interface IAlmacenRepository {

	//CRUD
	public void insertar(Almacen almacen);
	
	public Almacen buscar(Integer id);
	
   public List<Almacen> buscarAlmacenInnerJoin(String tipoPerfume);
	
	public List<Almacen> buscarAlmacenInnerJoin();

	public List<Almacen> buscarAlmacenOuterJoinLeft(String tipoPerfume);
	
	public List<Almacen> buscarAlmacenOuterJoinLeft();

	public List<Almacen> buscarAlmacenOuterJoinRigth(String tipoPerfume);

	public List<Almacen> buscarAlmacenJoinWhere(String tipoPerfume);

	public List<Almacen> buscarAlmacenJoinFetch(String tipoPerfume);
}
