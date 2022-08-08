package com.uce.edu.demo.perfume.repository.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.uce.edu.demo.perfume.repository.modelo.Perfume;

@Entity
@Table(name= "almacen")
public class Almacen {
	
	@Id
	@Column(name = "alma_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alma_id_seq")
	@SequenceGenerator(name="alma_id_seq", sequenceName = "alma_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "alma_nombre")
	private String nombre;
	
	@Column(name = "alma_direccion")
	private String direccion;
	
	//@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@OneToMany(mappedBy = "almacen",cascade = CascadeType.ALL,fetch=FetchType.LAZY)//lazy = carga perezosa
	private List<Perfume> perfumes;

	
	@Override
	public String toString() {
		return "Almacen [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Perfume> getPerfumes() {
		return perfumes;
	}

	public void setPerfumes(List<Perfume> perfumes) {
		this.perfumes = perfumes;
	}
	
	

	
	

}
