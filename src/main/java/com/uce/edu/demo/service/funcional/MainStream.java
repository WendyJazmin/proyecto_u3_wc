package com.uce.edu.demo.service.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

public class MainStream {

	private static Logger logg = Logger.getLogger(MainStream.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listaNombres = Arrays.asList("Jeff","Daniel","Dominik","Jessie","Marlon");
	
		//Método High Order (Supplier) de un Stream
		logg.info("High Order (Supplier)");
		ArrayList<String> lista = listaNombres.stream().filter(a -> a.contains("a")).collect(Collectors.toCollection(ArrayList::new));
		
		//Método High Order (Consumer) de un Stream
		logg.info("\nHigh Order (Consumer)");
		lista.forEach(cadena -> System.out.println(cadena));
		
		
		
		//Método High Order (Predicate) de un Stream
		logg.info("\nHigh Order (Predicate)");
		listaNombres.stream().filter(cadena-> cadena.length()<=6).forEach(cadena-> System.out.println(cadena));
		
		//Método High Order (Function) de un Stream
		logg.info("\nHigh Order (Function)");
		List<Integer> listaNumeros= listaNombres.stream().map(cadena->cadena.length()).toList();
		listaNumeros.forEach(numeros ->System.out.println(numeros));
	}

}
