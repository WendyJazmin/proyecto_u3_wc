package com.uce.edu.demo.perfume.service;

import com.uce.edu.demo.perfume.repository.modelo.Perfume;

public interface IPerfumeService {

	//CRUD
	public void insertar(Perfume perfume);
	
	public Perfume buscar(Integer id);
}
