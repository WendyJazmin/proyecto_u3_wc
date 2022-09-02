package com.uce.edu.demo.hilos.paralelo2;

public class MainParalelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperacionesMatematicas operaciones = new OperacionesMatematicas();
		operaciones.start();
		
		
		OperacionesMatematicas operaciones2 = new OperacionesMatematicas();
		operaciones2.start();
		
		
		OperacionesMatematicas operaciones3 = new OperacionesMatematicas();
		operaciones3.start();
		
		
		OperacionesMatematicas operaciones4 = new OperacionesMatematicas();
		operaciones4.start();
		
		OperacionesMatematicas operaciones5 = new OperacionesMatematicas();
		operaciones5.start();
	}

}
