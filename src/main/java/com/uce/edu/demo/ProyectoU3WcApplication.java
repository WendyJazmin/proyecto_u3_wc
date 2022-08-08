package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.perfume.repository.modelo.Almacen;
import com.uce.edu.demo.perfume.repository.modelo.Perfume;
import com.uce.edu.demo.perfume.service.IAlmacenService;
import com.uce.edu.demo.perfume.service.IPerfumeService;
import com.uce.edu.demo.repository.modelo.Habitacion;
import com.uce.edu.demo.repository.modelo.Hotel;
import com.uce.edu.demo.service.IHotelService;



@SpringBootApplication
public class ProyectoU3WcApplication implements CommandLineRunner{

	@Autowired
	private IHotelService iHotelService;
	
	@Autowired
	private IAlmacenService iAlmacenService;
	
	@Autowired
	private IPerfumeService iPerfumeService;
	
	private static Logger logg = Logger.getLogger(ProyectoU3WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU3WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		//insertando almacen
		Almacen al = new Almacen();
		al.setNombre("Celestial");
		al.setDireccion("Av. Granados");
		//this.iAlmacenService.insertar(al);
		
		//insertando perfumes
		Perfume perf1 = new Perfume();
		perf1.setNombre("La Vida es Bella");
		perf1.setCodigo("belle11221");
		perf1.setFechaCaducidad(LocalDateTime.of(2025, 8, 15, 12, 10));
		perf1.setTipo("dulce");
		
		Almacen al1 = new Almacen();
		al1.setId(2);
		perf1.setAlmacen(al1);
		//this.iPerfumeService.insertar(perf1);
		
		
		////CONSULTAS////
		
		//INNER JOIN
		logg.info("INNER JOIN");
		List<Almacen> listaAlmacenes =this.iAlmacenService.buscarAlmacenInnerJoin("dulce");
		
		for(Almacen a:listaAlmacenes) {
			logg.info("Almacen: "+a.getNombre()+", direccion: "+a.getDireccion());
			
		}
		
		logg.info("");
		logg.info("JOIN");
		List<Almacen> listaAlmacenes2 = this.iAlmacenService.buscarAlmacenInnerJoin();
		
		for(Almacen a:listaAlmacenes2) {
			logg.info("Almacen: "+a.getNombre()+", direccion: "+a.getDireccion());
			
		}
		
		
		//LEFT
		logg.info("");
		logg.info("LEFT JOIN");
		List<Almacen> listaAlmacenes3 =this.iAlmacenService.buscarAlmacenOuterJoinLeft("dulce");
		
		for(Almacen a:listaAlmacenes3) {
			logg.info("Almacen: "+a.getNombre()+", direccion: "+a.getDireccion());
			
		}
		
		//RIGHT
		logg.info("");
		logg.info("RIGHT JOIN");
		List<Almacen> listaAlmacenes4 =this.iAlmacenService.buscarAlmacenOuterJoinRigth("floral");
				
		for(Almacen a:listaAlmacenes4) {
			logg.info("Almacen: "+a.getNombre()+", direccion: "+a.getDireccion());
					
		}
		
		
		
	}

}
