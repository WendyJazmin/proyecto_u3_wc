package com.uce.edu.demo.facturacion.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "factura_electronica")
public class FacturaElectronica extends Factura {

	@Id
	@Column(name ="fael_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fael_id_seq")
	@SequenceGenerator(name="fael_id_seq", sequenceName = "fael_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name ="fael_numero")
	private String numero;
	
	@Column(name ="fael_fecha")
	private LocalDateTime fecha;
	
	@Column(name ="fael_monto")
	private BigDecimal monto;

	
	@Column(name ="fael_detalles")
	private List<DetalleFactura> detalles;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public BigDecimal getMonto() {
		return monto;
	}


	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}


	public List<DetalleFactura> getDetalles() {
		return detalles;
	}


	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}
	
	
	
	
}
