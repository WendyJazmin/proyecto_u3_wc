package com.uce.edu.demo.facturacion.repository.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	
	@Id
	@Column(name ="clie_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clie_id_seq")
	@SequenceGenerator(name="clie_id_seq", sequenceName = "clie_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name ="clie_cedula")
	private String cedula;
	
	
	@Column(name ="clie_numero_tarjeta")
	private String numeroTarjeta;
	

	@OneToMany(mappedBy = "cliente")
	private List<Factura> facturas;

	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cedula=" + cedula + ", numeroTarjeta=" + numeroTarjeta;
	}


	//get y set
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}


	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}



	public List<Factura> getFacturas() {
		return facturas;
	}


	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}


