package com.uce.edu.demo.hilos.paralelo;

import java.util.concurrent.TimeUnit;

import com.uce.edu.demo.hilos.tradicional.Cajero;

public class PCCajeroParalelo extends Thread{//cuando se extiende de thread siempre se debe sobreescribir el metodo run

	private CajeroParalelo cajero;
	public PCCajeroParalelo(CajeroParalelo cajero) {
		this.cajero = cajero;
	}
	//Disparar el metodo a paralelizar
	@Override
	public void run() {
		this.procesar(this.cajero);
	}
	
	public void procesar(CajeroParalelo cajero) {
		
		long tiempoInicial = System.currentTimeMillis();
		
		System.out.println("Nombre Hilo procesar: "+Thread.currentThread().getName());
		System.out.println("Procesando cajero: "+cajero.getNombre());
		for(String cliente: cajero.getClientes()) {
			this.atenderCliente(cliente);
		}
			
		long tiempoFinal= System.currentTimeMillis();
		
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial)/1000;

		System.out.println("Termino: "+cajero.getNombre()+", "+tiempoTranscurrido+" seg");

	}
	
	private void atenderCliente(String cliente)  {
		System.out.println("Atendiendo a: "+cliente);
		//demora el metodo 5 seg
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
