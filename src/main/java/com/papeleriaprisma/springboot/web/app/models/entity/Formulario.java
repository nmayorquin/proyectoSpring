package com.papeleriaprisma.springboot.web.app.models.entity;

import java.io.Serializable;


import jakarta.persistence.Entity; //SE DEBE IMPORTAR DE JAVX PERO NO SALÍA
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



//CLASE MODELS CON ENTITY PORQUE SERÁ LA CLASE QUE SE MAPEE A TABLA DE H2

@Entity
@Table( name = "clientes")
public class Formulario implements Serializable{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	
	private String nombre;
	private String apellido;
	private String email;
	private String contacto;
	private String necesidad;
	
	
	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public String getNecesidad() {
		return necesidad;
	}


	public void setNecesidad(String necesidad) {
		this.necesidad = necesidad;
	}


	private static final long serialVersionUID = 1L;
	
}
