package com.uce.edu.demo;

import java.math.BigDecimal;
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
import com.uce.edu.demo.service.ITransferenciaService;



@SpringBootApplication
public class ProyectoU3WcApplication implements CommandLineRunner{
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	
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
	/*
		//FETCH
				logg.info("\nJOIN FETCH");
				List<Hotel> listaHoteles3 = this.iHotelService.buscarHotelJoinFetch("familiar");

				for(Hotel h:listaHoteles3) {
					logg.info("Hotel3: "+h.getNombre()+", direccion: "+h.getDireccion());
					for(Habitacion ha: h.getHabitaciones()) {
						logg.info("Habitacines: "+ha);
					}
					logg.info("");
				}
		*/
		//realizar la transferencia
		//this.iTransferenciaService.realizarTransferencia("123456", "121343", new BigDecimal(1));
		this.iTransferenciaService.realizarTransferenciaFachada("123456", "121343", new BigDecimal(1));

	}

}
