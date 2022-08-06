package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Habitacion;
import com.uce.edu.demo.repository.modelo.Hotel;
import com.uce.edu.demo.service.IHotelService;



@SpringBootApplication
public class ProyectoU3WcApplication implements CommandLineRunner{

	@Autowired
	private IHotelService iHotelService;
	
	private static Logger logg = Logger.getLogger(ProyectoU3WcApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU3WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*logg.info("INNER JOIN");
		List<Hotel> listaHoteles = this.iHotelService.buscarHotelInnerJoin("individual");
		
		for(Hotel h:listaHoteles) {
			logg.info("Hotel: "+h.getNombre()+", direccion: "+h.getDireccion());
			
		}
		
		logg.info("JOIN");
		List<Hotel> listaHoteles2 = this.iHotelService.buscarHotelInnerJoin();
		
		for(Hotel h:listaHoteles2) {
			logg.info("Hotel: "+h.getNombre()+", direccion: "+h.getDireccion());
			
		}
		
		//LEFT
		logg.info("LEFT JOIN");
		List<Hotel> listaHotelesLeft = this.iHotelService.buscarHotelOuterJoinLeft("individual");
		
		for(Hotel h:listaHotelesLeft) {
			logg.info("Hotel: "+h.getNombre()+", direccion: "+h.getDireccion());
			
		}
		
		
		logg.info("LEFT JOIN");
		List<Hotel> listaHotelesLeft2 = this.iHotelService.buscarHotelOuterJoinLeft();
		
		for(Hotel h:listaHotelesLeft2) {
			logg.info("Hotel: "+h.getNombre()+", direccion: "+h.getDireccion());
			
		}
		
		//Right
		logg.info("RIGHT JOIN");
		List<Hotel> listaHotelesRight = this.iHotelService.buscarHotelOuterJoinRigth("individual");
		
		for(Hotel h:listaHotelesRight) {
			logg.info("Hotel: "+h.getNombre()+", direccion: "+h.getDireccion());
			
		}
		*/
		
		//JOIN WHERE
		//Right
		logg.info("\nJOIN WHERE");
		List<Hotel> listaHotelesWhere = this.iHotelService.buscarHotelJoinWhere("familiar");
		
		for(Hotel h:listaHotelesWhere) {
			logg.info("Hotel: "+h.getNombre()+", direccion: "+h.getDireccion());
			
		}
		
		logg.info("\nINNER JOIN EAGER/LAZY");
		List<Hotel> listaHoteles2 = this.iHotelService.buscarHotelInnerJoin("familiar");
		
		for(Hotel h:listaHoteles2) {
			logg.info("Hotel2: "+h.getNombre()+", direccion: "+h.getDireccion());
			for(Habitacion ha: h.getHabitaciones()) {
				logg.info("Habitacines: "+ha);
			}
		}
		
		
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
		
		
	}

}
