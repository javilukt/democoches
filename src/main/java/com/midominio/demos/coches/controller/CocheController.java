package com.midominio.demos.coches.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.midominio.demos.coches.model.Coche;


@Controller
@RequestMapping("/coche")
public class CocheController {
	
	// @Value("Coches")
	// private String tituloGeneral;
	
	@ModelAttribute("titulo")
	public String tituloGeneral() {
		return "Coches";
	}
	
	
	@GetMapping("")
	public String m(@RequestParam int id, Model model) {
		
		Coche miCoche = Coche.cochePorId(id); 
		// model.addAttribute("titulo", tituloGeneral);
		model.addAttribute("tituloH1", "Datos de un coche");
		model.addAttribute("coche", miCoche);
		
		return "coche/un-coche";
	}
	
	@GetMapping("/all")
	public String listadoTodosLosCoches(Model m) {		
		// m.addAttribute("titulo", tituloGeneral);
		m.addAttribute("tituloH1", "Listado de coches");
		m.addAttribute("listaCoches", Coche.dameLaListaDeCoches());
		return "coche/listado-coches";
	}
	
	@GetMapping("/lista")
	public String listadosVarios(
			@RequestParam String marca,
			@RequestParam(required = false, defaultValue = "10000") int cantidad,
			Model m) {
		
		List<Coche> listaRecortada = new ArrayList<>();
		if(Coche.cochesPorMarca(marca).size() <= cantidad) {
			listaRecortada = Coche.cochesPorMarca(marca);
		} else {
			for (int i = 0; i < cantidad; i++) {
				listaRecortada.add(Coche.cochesPorMarca(marca).get(i));
			}
		}
		
		m.addAttribute("tituloH1", "Listado de coches filtrado");
		m.addAttribute("listaCoches", listaRecortada);
		return "coche/listado-coches";
	}
	
	@GetMapping("id/{id}")
	public String m1(
			@PathVariable("id") int id,
			Model m) {
		Coche miCoche = Coche.cochePorId(id); 
		m.addAttribute("tituloH1", "Datos de un coche");
		m.addAttribute("coche", miCoche);
		
		return "coche/un-coche";
	}
}
