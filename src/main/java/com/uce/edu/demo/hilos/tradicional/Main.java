package com.uce.edu.demo.hilos.tradicional;

import java.util.Arrays;

import org.hibernate.internal.build.AllowSysOut;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long tiempoInicial = System.currentTimeMillis();
		
		System.out.println("Nombre Hilo: "+Thread.currentThread().getName());
		
		Cajero cajero1 = new Cajero("Edison",Arrays.asList("Pepito","Juan"));
		Cajero cajero2 = new Cajero("Luis",Arrays.asList("Pedro","Jeff"));
		Cajero cajero3 = new Cajero("Paul",Arrays.asList("Jessie","Juan"));
		
		PCCajero gestorAtencion = new PCCajero();
		gestorAtencion.procesar(cajero1);
		
		PCCajero gestorAtencion1 = new PCCajero();
		gestorAtencion1.procesar(cajero2);
		
		PCCajero gestorAtencion2 = new PCCajero();
		gestorAtencion2.procesar(cajero3);
		
		long tiempoFinal= System.currentTimeMillis();
		
		long tiempoTranscurrido = (tiempoFinal - tiempoInicial)/1000;
		System.out.println(tiempoTranscurrido+" seg");
				
	}

}
