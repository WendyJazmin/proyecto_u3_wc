package com.uce.edu.demo.perfume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.perfume.repository.IPerfumeRepository;
import com.uce.edu.demo.perfume.repository.modelo.Perfume;

@Service
public class PerfumeServiceImpl implements IPerfumeService{

	@Autowired
	private IPerfumeRepository iPerfumeRepository;
	
	@Override
	public void insertar(Perfume perfume) {
		// TODO Auto-generated method stub
		this.iPerfumeRepository.insertar(perfume);
	}

	@Override
	public Perfume buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPerfumeRepository.buscar(id);
	}

}
