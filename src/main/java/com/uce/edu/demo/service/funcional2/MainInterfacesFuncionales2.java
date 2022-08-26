package com.uce.edu.demo.service.funcional2;

import java.time.LocalDateTime;
import java.util.Random;

import org.apache.log4j.Logger;

import com.uce.edu.demo.service.funcional.MainInterfacesFuncionales;

public class MainInterfacesFuncionales2 {

	private static Logger logg = Logger.getLogger(MainInterfacesFuncionales2.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsumoMetodosHighOrder metodos = new ConsumoMetodosHighOrder();
		
		
		//SUPPLIER ------------------------------------
		logg.info("SUPPLIER");
		
		//Clases
		IInterfaceSupplier<Integer> supplierClase = new InterfaceSupplierImpl();
		logg.info("Supplier Clase: "+supplierClase.get());
		
		//Lambda
		IInterfaceSupplier<Double> supplierLambda = () ->   new Random().nextDouble();
		logg.info("Supplier Lambda: "+supplierLambda.get());
		
		//High Order
		Integer suma = metodos.consumirSupplier(()-> 10);
		logg.info("Supplier High Order:  Suma de 2 numeros - "+suma);
		
		
		
		//CONSUMER --------------------------------------
		logg.info("\n\tCONSUMER");
		//clase
		IInterfaceConsumer<LocalDateTime> consumerClase = new InterfaceConsumerImpl();
		 consumerClase.accept(LocalDateTime.now());
		 
		 //lambda
		 IInterfaceConsumer<LocalDateTime> consumerLambda = fecha -> 
		 									System.out.println("fecha de Nacimiento: "+fecha);
		 consumerLambda.accept(LocalDateTime.of(2000, 8,8, 16, 0));
		
		//High Order
		 metodos.consumirConsumer(fecha ->System.out.println("fecha de Nacimiento Consumer: "+fecha), LocalDateTime.now());
	
		 
		 
		 //PREDICATE -------------------------------------
		 logg.info("\n\tPREDICATE");
		 //clase
		 IInterfacePredicate<Double> predicateClase = new InterfacePredicateImpl();
		 logg.info("El resultado de la multiplicación fue mayor a cero: "+ predicateClase.multiplicar(new Random().nextDouble()));
		 
		 
		 //lambda
		 IInterfacePredicate<String> predicateLambda = nombre -> {
			int n = nombre.length()*nombre.length();
			if(n>16) {
				return true;
			}else {
				return false;	
			}
			
		 };
		 
		 logg.info("Lambda -> Multiplicar el tamaño de un String fue mayor a 16? "+predicateLambda.multiplicar("Jeff"));
		 
		 
		 //high order
		logg.info("High Order -> Multiplicar el tamaño de un String fue mayor a 16? "+metodos.consumirPredicate(predicateLambda, "Dominik")); 
		 
		
		
		 //FUNCTION --------------------------------
		logg.info("\n\tFUNCTION");
		//clase
		 IInterfaceFunction<Integer,String> functionClase = new InterfaceFunctionImpl();
		 String nombre = "Daniel";
		 logg.info("function clase: "+nombre+" contiene "+functionClase.aplicar(nombre)+" letras");
		
		
		 //lambda
		 IInterfaceFunction<Integer,String> functionLambda = cadena -> {
			 Integer n = cadena.length();
			 return n;
		 };
		 logg.info("function lambda: "+nombre+" contiene "+functionLambda.aplicar(nombre)+" letras");
		 
		 
		 //high order
		 Integer numero = metodos.consumirFunction(cadena -> {
			 Integer n = cadena.length();
			 return n;}, "Satur");
		 logg.info("Function High Order: el nombre contiene "+numero+" letras");
		 
		 
		 
		 
		 //UNARY OPERATOR  --------------------------
		logg.info("\n\tUNARY OPERATOR");
		//clase
		 IInterfaceUnaryOperator<Double> unaryClase = new InterfaceUnaryOperatorImpl();
		 Double resultado = unaryClase.apply(15.8);
		 logg.info("Unary Operator Clase: area del cuadrardo es "+resultado);
		 
		 //lambda
		 IInterfaceUnaryOperator<Double> unarylambda = lado ->  4*lado;
		 logg.info("Unary Operator lambda: area del cuadrardo es "+ unarylambda.apply(15.8));
		
		 
		 //high order
		 Double calculo = metodos.consumirUnaryOperator(lado -> 4*lado, 15.8);
		 logg.info("Unary Operator High Order : area del cuadrardo es "+calculo); 
	
	}

}
