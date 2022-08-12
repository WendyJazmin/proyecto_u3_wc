package com.uce.edu.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.uce.edu.demo.ProyectoU3WcApplication;
import com.uce.edu.demo.repository.IHotelRepository;
import com.uce.edu.demo.repository.modelo.Habitacion;
import com.uce.edu.demo.repository.modelo.Hotel;
import com.uce.edu.demo.service.IHotelService;

@SpringBootTest  
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Transactional
public class HotelTest {

	@Autowired
	private IHotelRepository iHotelRepository;

	@Autowired
	private IHotelService iHotelService;
	
	private static Logger logg = Logger.getLogger(HotelTest.class);

	@Test 
	@Rollback(true)
	public void insertarHotelTest() {
		Hotel hotel = new Hotel();
		hotel.setDireccion("Quito");
		hotel.setNombre("Hotel Luca");

		this.iHotelService.insertarHotel(hotel);

		assertNotNull(hotel.getDireccion(), hotel.getNombre());
	}

	@Test
	@Rollback(true)
	public void actualizarHotelTest() {

		assertThat(this.iHotelService.actualizarHotel("Hotel Latacunga", "Quito"));//se modica el nombre del hotel por el nombre de la direccion
	}

	@Test
	@Rollback(true)
	public void eliminarHotelTest() {

		assertThat(this.iHotelService.eliminarHotel("Quito"));
	}

	@Test
	public void buscarHotelJoinFetchTest() {
		assertThat(this.iHotelService. buscarHotelJoinFetch("matrimonial")).isNotEmpty();
	}

	@Test
	public void buscarHotelInnerJoinTest() {
		assertThat(this.iHotelService.buscarHotelInnerJoin("familiar")).isNotEmpty();
	}

	@Test
	public void buscarHotelOuterJoinLeftTest() {
		assertThat(this.iHotelService.buscarHotelOuterJoinLeft("matrimonial")).isNotEmpty();
	}

	@Test
	public void buscarHotelOuterJoinRightTest() {
		assertThat(this.iHotelService.buscarHotelOuterJoinRigth("familiar")).isNotEmpty();
		//logg.info(iHotelRepository);
	}
}
