package com.papeleriaprisma.springboot.web.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

//ANOTACION DE COMPONENTE DE PERSISTENCIA-ACCESO DE DATOS- DA MEJOR DETALLE DE LOS ERRORES
@Repository("showProductJPA")
public class IFormularioDAO implements IFormularioProductos {

	//VIEW: MOSTRAR PRODUCTOS
	@PersistenceContext
	private EntityManager entityManager; //EM SE ENCARGA DE MAEJAR LAS CLASES DE LAS ENTIDADES, CRUD A NIVEL DE OBJETOS-CONSULTAS PASAN POR AHÍ
	
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true) //TENER CUIDADO CON LA IMPORTACION O SINO NO RECONOCER readOnly
	@Override
	public List<IFormularioProductos> findAll() {
		
		return entityManager.createQuery("from Productos").getResultList();
	}

}
