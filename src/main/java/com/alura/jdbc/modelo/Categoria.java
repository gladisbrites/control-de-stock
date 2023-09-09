package com.alura.jdbc.modelo;

import java.util.List;
import java.util.ArrayList;
public class Categoria {
	
	private Integer id;
	private String nombre;
	private List<Producto>productos;
	
public Categoria(int id, String nombre) {
	this.id=id;
	this.nombre=nombre;
		
	}
public Integer getId() {
	return this.id;
}

public void agregar(Producto producto) {
	if(this.productos==null) {
		this.productos= new ArrayList<>();
	}
	this.productos.add(producto);
}

@Override
public String toString() {
	return this.nombre;
}
public List<Producto> getProductos() {
	return this.productos;
}




}
