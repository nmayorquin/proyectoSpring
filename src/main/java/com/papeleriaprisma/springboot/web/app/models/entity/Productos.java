package com.papeleriaprisma.springboot.web.app.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@SuppressWarnings("serial")
@Entity
public class Productos implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long IdProducto;
	
	private String nombreProducto;
	private String DescripcionProducto;
	private int valorProducto;
	
	public Long getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(Long idProducto) {
		IdProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDescripcionProducto() {
		return DescripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		DescripcionProducto = descripcionProducto;
	}
	public int getValorProducto() {
		return valorProducto;
	}
	public void setValorProducto(int valorProducto) {
		this.valorProducto = valorProducto;
	}
	
	
	
}
