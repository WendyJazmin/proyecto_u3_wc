package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.facturacion.repository.modelo.Cliente;
import com.uce.edu.demo.facturacion.repository.modelo.DetalleFactura;
import com.uce.edu.demo.facturacion.repository.modelo.Factura;
import com.uce.edu.demo.facturacion.service.IClienteService;
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
	private IClienteService iClienteService;
	
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
				logg.info("JOIN FETCH");
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
		//this.iTransferenciaService.realizarTransferencia("123456", "121343", new BigDecimal(7));
		//this.iTransferenciaService.realizarTransferenciaFachada("121343","123456",  new BigDecimal(1));

		//INSERTAR
		Cliente cli = new Cliente();
		cli.setCedula("12345678");
		cli.setNumeroTarjeta("q3234f");
		
		//this.iClienteService.insertar(cli);
		
		Cliente cli2 = this.iClienteService.buscarPorCedula("12345678");
		logg.info(cli2);
		
		
		//insertar factura
		Factura fact = new Factura();
		fact.setFecha(LocalDateTime.now());
		fact.setNumero("2233555");
		fact.setCliente(cli2);
		
		DetalleFactura detalle = new DetalleFactura();
		detalle.setSubtotal(new BigDecimal(32));
		detalle.setCantidad(1);
	}

}
