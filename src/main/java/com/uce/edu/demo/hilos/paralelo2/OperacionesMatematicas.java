package com.uce.edu.demo.hilos.paralelo2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class OperacionesMatematicas extends Thread {

	@Override
	public void run() {
		this.operaciones();
	}
	
	public void operaciones() {
		
		long tiempoInicial = System.currentTimeMillis();
		System.out.println("Nombre Hilo procesar: "+Thread.currentThread().getName());
		for(int i=1; i<=6;i++) {
			int x =(int) (Math.random()*20);
			int y =(int) (Math.random()*20);
			if(i==1) {
			int suma = x+y;
			System.out.println("suma "+i+": "+suma);
			}
			if(i==2) {
				int resta = x-y;
				System.out.println("resta "+i+": "+resta);
			}
			if(i==3) {
				int multiplicacion =x*y;
				System.out.println("multiplcacion "+i+": "+multiplicacion);
			}
			if(i==4) {
				double division = x/y;
				System.out.println("division "+i+": "+division);
			}
			if(i==5) {
				double potencia = Math.pow(x, y);
				System.out.println("potencia "+i+": "+potencia);
			}
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		long tiempoFinal= System.currentTimeMillis();
		
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial)/1000;

		System.out.println("Termino el hilo"+Thread.currentThread().getName()+" "+tiempoTranscurrido+" seg");
	}
}
