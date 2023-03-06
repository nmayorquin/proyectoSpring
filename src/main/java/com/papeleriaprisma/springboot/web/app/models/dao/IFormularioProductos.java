package com.papeleriaprisma.springboot.web.app.models.dao;

import java.util.List;

import com.papeleriaprisma.springboot.web.app.models.entity.Formulario;

//VIEW: MOSTRAR PRODUCTOS
//INTERFACE QUE TOMA TODOS LOS COMPORTAMIENTOS DE DAO: PARA PODER TRABAJAR CON LOS DATOS
@SuppressWarnings("unused")
public interface IFormularioProductos {
	public List<IFormularioProductos> findAll(); //MOTRAR TODOS LOS ELEMENTOS DE LA CLASE FORMULARIO
}
