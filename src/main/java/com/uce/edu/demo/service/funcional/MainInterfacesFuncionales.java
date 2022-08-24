package com.uce.edu.demo.service.funcional;

import org.apache.log4j.Logger;


public class MainInterfacesFuncionales {

	private static Logger logg = Logger.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] args) {
		
		ConsumoMetodosHighOrder metodosHO = new ConsumoMetodosHighOrder();
		
		//SUPLIER
		//CLASES
		IPersonaSupplier<String> supplier = new PersonaSupplierImpl();
		logg.info("Supplier Clase: "+supplier.getNombre());
		
	
		IPersonaSupplier<String> supplierTE = new PersonaSupplierTEImpl();
		logg.info("Supplier Clase: "+supplierTE.getNombre());
				
		//LAMBDAS
		IPersonaSupplier<String> supplierLambda = () -> "Edison2";
		logg.info("Supplier Lambdas: "+supplierLambda.getNombre());
		
		IPersonaSupplier<String> supplierLambdaTE = () -> "Daniel TE";
		logg.info("Supplier Lambdas: "+supplierLambdaTE.getNombre());
		
		
		//CONSUMER
		//CLASES
		IPersonaConsumer<String> consumer = new PersonaConsumerImpl();
		consumer.accept("Prueba Consumer");
		
		
		//LAMBDAS
		IPersonaConsumer<String> consumerLambda = cadena -> System.out.println(cadena);
		consumerLambda.accept("Prueba ConsumerLambda");
	
		//METODOS HIGH ORDER
		metodosHO.consumirConsumer(valor -> System.out.println(valor), 2);
		
		
		
		//Predicate
		//CLASES
		IPersonaPredicate<String> predicateLambda = cadena -> cadena.contains("z");
		logg.info("Predicate Lambda: "+predicateLambda.evaluar("Edison"));
		
		//high order
		boolean respuesta = metodosHO.consumirPredicate(cadena -> cadena.contains("z"), "Edison");
		logg.info("High Order Predicate: "+respuesta);
		
		
		
		//FUNCTION
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
		
		
		//UNARY OPRATOR (FUNCTION)
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
