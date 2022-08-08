package com.uce.edu.demo.perfume.repository;

import com.uce.edu.demo.perfume.repository.modelo.Perfume;

public interface IPerfumeRepository {
	//CRUD
	public void insertar(Perfume perfume);
	public Perfume buscar(Integer id);

}
