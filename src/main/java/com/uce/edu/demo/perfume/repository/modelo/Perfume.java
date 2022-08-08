package com.uce.edu.demo.perfume.repository.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "perfume")
public class Perfume {
	
	@Id
	@Column(name = "perf_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "perf_id_seq")
	@SequenceGenerator(name="perf_id_seq", sequenceName = "perf_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "perf_codigo")
	private String codigo;
	
	@Column(name = "perf_nombre")
	private String nombre;
	
	@Column(name = "perf_tipo")
	private String tipo;
	
	@Column(name = "perf_fechaCaducidad")
	private LocalDateTime fechaCaducidad;
	
	@ManyToOne
	@JoinColumn(name = "perf_id_alma")
	private Almacen almacen;

	
	@Override
	public String toString() {
		return "Perfume [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo
				+ ", fechaCaducidad=" + fechaCaducidad + ", almacen=" + almacen + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	
	

	
	
	
	

}
