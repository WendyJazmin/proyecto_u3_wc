package com.uce.edu.demo.service.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.core.env.SystemEnvironmentPropertySource;


public class MainInterfacesFuncionales {

	private static Logger logg = Logger.getLogger(MainInterfacesFuncionales.class);

	public static boolean prueba(Integer numero) {
		return numero>=3;
	};
	
	public static void imprimir(String cadena) {
		logg.info("Impresion: "+cadena);
	}
	public static void guardar(String elementoInsertar) {
		logg.info("Impresion: "+elementoInsertar);
	}
	
	public static void main(String[] args) {
		
		ConsumoMetodosHighOrder metodosHO = new ConsumoMetodosHighOrder();
		
		//SUPLIER
		//CLASES
		IPersonaSupplier<String> supplier = new PersonaSupplierImpl();
		logg.info("Supplier Clase: "+supplier.getNombre());
		
	
		IPersonaSupplier<String> supplierTE = new PersonaSupplierTEImpl();
		logg.info("Supplier Clase: "+supplierTE.getNombre());
		
		//JAVA
		logg.info("Java Supplier");
		Stream<String> test = Stream.generate(()-> "Edison 3").limit(7);
		test.forEach(cadena ->  System.out.println(cadena));
		
		//LAMBDAS
		IPersonaSupplier<String> supplierLambda = () -> "Edison2";
		logg.info("Supplier Lambdas: "+supplierLambda.getNombre());
		
		IPersonaSupplier<String> supplierLambdaTE = () -> "Daniel TE";
		logg.info("Supplier Lambdas: "+supplierLambdaTE.getNombre());
		
		
		
		//CONSUMER------------
		//CLASES
		IPersonaConsumer<String> consumer = new PersonaConsumerImpl();
		consumer.accept("Prueba Consumer");
		
		
		//LAMBDAS
		IPersonaConsumer<String> consumerLambda = cadena -> System.out.println(cadena);
		consumerLambda.accept("Prueba ConsumerLambda");
	
		//METODOS HIGH ORDER
		metodosHO.consumirConsumer(valor -> System.out.println(valor), 2);
		
		//JAVA
		logg.info("Java Consumer");
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5);
		listaNumeros.forEach(numero -> System.out.println(numero));
		
		
		//Predicate---------------------
		//CLASES
		IPersonaPredicate<String> predicateLambda = cadena -> cadena.contains("z");
		logg.info("Predicate Lambda: "+predicateLambda.evaluar("Edison"));
		
		//high order
		boolean respuesta = metodosHO.consumirPredicate(cadena -> cadena.contains("z"), "Edison");
		logg.info("High Order Predicate: "+respuesta);
		
		//JAVA
		logg.info("Java Predicate");
		Stream<Integer>nuevaLista = listaNumeros.stream().filter(numero-> prueba(numero));
		nuevaLista.forEach(numero -> System.out.println(numero));
		
		
		//FUNCTION----------------------------
		IPersonaFunction<Integer,String> funtionLambda = cadena -> {
			Integer valor = Integer.parseInt(cadena);
			Integer valorFinal = valor-2;
			return valorFinal;
		};
		logg.info("Function Lambda: "+funtionLambda.aplicar("7"));
		
		//metodos high order
		String valorFinalHO = metodosHO.consumirFunction(valor ->{
			String retorno = valor.toString()+"A";
			return retorno;
		}, 1);
		logg.info("HO Function: "+valorFinalHO);
		
		//	JAVA
		logg.info("JAVA FUNCTION");
		Stream<String> listaCambiada = listaNumeros.stream().map(numeroLista ->{
			Integer valor = numeroLista +1;
			String cadena = "num: "+valor.toString();
			return cadena;
		} );
		
		//declarativa: ideas
		listaCambiada.forEach(valor -> imprimir(valor));
		
		List<String> lista1 = new ArrayList<>();
		Map<String,String> mpa1 = new HashMap<>();
		
		//UNARY OPRATOR (FUNCTION)--------------------extiende de function
		IPersonaUnaryOperator<String> unaryLambda = cadena -> {
			String valorFinal = cadena.concat("sufijo");
			return valorFinal;
		};
		logg.info("Unary Lambda: "+unaryLambda.apply("Daniel"));		
	
	
	
		//METODOS HIGH ORDER
		String valorHO =metodosHO.consumrrSupplier(()->"Hola Mundo");
		logg.info("HO Supplier: "+valorHO);
		
		
		String valorHO1 =metodosHO.consumrrSupplier(()->{
		String valorConsultado = "1132445";
		return valorConsultado;
		});
		
		logg.info("HO Supplier1: "+valorHO1);
	}
}
