package com.midominio.demos.coches.model;

import java.util.ArrayList;
import java.util.List;

public class Coche {
	
	// propiedades
	private int id;
	private String marca;
	private String modelo;
	private String color;
	private int fabricadoEn;
	
	// constructor
	public Coche(int id, String marca, String modelo, String color, int fabricadoEn) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.fabricadoEn = fabricadoEn;
	}
	
	// método para devolver un coche en concreto de la lista dado un id
	
	public static Coche cochePorId(int id) {
		for (Coche c: Coche.dameLaListaDeCoches()) {
			if (c.id == id) return c;		
		}
		return null;		
	}
	
	public static List<Coche> cochesPorMarca(String marca) {
		List<Coche> listaCoches = new ArrayList<>();
		for (Coche c: Coche.dameLaListaDeCoches()) {
			if (marca.equalsIgnoreCase(c.getMarca())) { 
				listaCoches.add(c);
			}		
		}
		return listaCoches;		
	}
	
	
	// método para devolver la lista de 40 coches
	
	public static List<Coche> dameLaListaDeCoches() {
		List<Coche> listaCoches = new ArrayList<>();
		listaCoches.add(new Coche(1, "ford", "focus", "verde", 2010));
		listaCoches.add(new Coche(2, "seat", "ibiza", "azul", 2012));
		listaCoches.add(new Coche(3, "wolkswagen", "polo", "blanco", 2015));
		listaCoches.add(new Coche(4, "renault", "clio", "negro", 2018));
		listaCoches.add(new Coche(5, "ford", "fiesta", "rojo", 2005));
		listaCoches.add(new Coche(6, "seat", "leon", "amarillo", 2020));
		listaCoches.add(new Coche(7, "wolkswagen", "golf", "gris", 2017));
		listaCoches.add(new Coche(8, "renault", "megane", "naranja", 2013));
		listaCoches.add(new Coche(9, "ford", "mondeo", "violeta", 2019));
		listaCoches.add(new Coche(10, "seat", "ateca", "marron", 2021));
		listaCoches.add(new Coche(11, "ford", "explorer", "azul", 2009));
		listaCoches.add(new Coche(12, "seat", "arona", "verde", 2014));
		listaCoches.add(new Coche(13, "wolkswagen", "tiguan", "blanco", 2016));
		listaCoches.add(new Coche(14, "renault", "kadjar", "negro", 2022));
		listaCoches.add(new Coche(15, "ford", "edge", "rojo", 2008));
		listaCoches.add(new Coche(16, "seat", "alhambra", "amarillo", 2011));
		listaCoches.add(new Coche(17, "wolkswagen", "passat", "gris", 2015));
		listaCoches.add(new Coche(18, "renault", "captur", "naranja", 2017));
		listaCoches.add(new Coche(19, "ford", "mustang", "violeta", 2020));
		listaCoches.add(new Coche(20, "seat", "tarraco", "marron", 2018));
		listaCoches.add(new Coche(21, "ford", "ranger", "gris", 2003));
		listaCoches.add(new Coche(22, "seat", "exeo", "negro", 2008));
		listaCoches.add(new Coche(23, "wolkswagen", "arteon", "azul", 2019));
		listaCoches.add(new Coche(24, "renault", "scenic", "verde", 2014));
		listaCoches.add(new Coche(25, "ford", "fusion", "amarillo", 2006));
		listaCoches.add(new Coche(26, "seat", "toledo", "blanco", 2010));
		listaCoches.add(new Coche(27, "wolkswagen", "up", "rojo", 2012));
		listaCoches.add(new Coche(28, "renault", "koleos", "marron", 2017));
		listaCoches.add(new Coche(29, "ford", "flex", "naranja", 2015));
		listaCoches.add(new Coche(30, "seat", "mii", "violeta", 2018));
		listaCoches.add(new Coche(31, "wolkswagen", "amarok", "verde", 2021));
		listaCoches.add(new Coche(32, "renault", "twingo", "azul", 2020));
		listaCoches.add(new Coche(33, "ford", "ecosport", "gris", 2007));
		listaCoches.add(new Coche(34, "seat", "cordoba", "negro", 2004));
		listaCoches.add(new Coche(35, "wolkswagen", "touran", "blanco", 2013));
		listaCoches.add(new Coche(36, "renault", "talisman", "amarillo", 2016));
		listaCoches.add(new Coche(37, "ford", "escape", "rojo", 2011));
		listaCoches.add(new Coche(38, "seat", "altea", "marron", 2009));
		listaCoches.add(new Coche(39, "wolkswagen", "caddy", "naranja", 2018));
		listaCoches.add(new Coche(40, "renault", "fluence", "violeta", 2015));	
		return listaCoches;
	}
	
	// getters no setters

	public int getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public int getFabricadoEn() {
		return fabricadoEn;
	}
	
}
