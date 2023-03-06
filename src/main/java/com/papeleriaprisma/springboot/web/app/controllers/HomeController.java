package com.papeleriaprisma.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.papeleriaprisma.springboot.web.app.models.dao.IFormularioProductos;




@Controller
public class HomeController {
	
	//VIEW: HOME EN LA RAIZ
	@GetMapping({"/", "/home"})
	public String home(Model model) {
		model.addAttribute("tituloPagina", "Papelería Prisma");
		return "home";
	}
	
	//VIEW: MOSTRAR PRODUCTOS
	@Autowired //LA ANOTACION BUSCA EL COMPONENTE QUE CONTIENE LA INTERFAZ IFORMULARIO
	private IFormularioProductos formularioProductosDao;
	
	@Qualifier("showProductJPA") //SE ESPECIFICA 
	@GetMapping (value="/products") //PENDIENTE SI NO FUNCIONA
	public String listarDatos(Model model) {
		model.addAttribute("tituloBody", "Papelería Prisma");
		model.addAttribute("productos", formularioProductosDao.findAll());
		return "products";
	}
	
}
