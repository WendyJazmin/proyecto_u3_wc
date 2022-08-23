package com.uce.edu.demo.service.funcional;

import org.apache.log4j.Logger;


public class MainInterfacesFuncionales {

	private static Logger logg = Logger.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] args) {
		
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
	
		//Predicate
		//CLASES
				
	
	}
}
