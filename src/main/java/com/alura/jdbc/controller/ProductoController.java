package com.alura.jdbc.controller;
import java.sql.Statement;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Categoria;
import com.alura.jdbc.modelo.Producto;

import java.util.HashMap;


public class ProductoController {

	private ProductoDAO productoDAO;
	

	public ProductoController() {
	
	this.productoDAO = new ProductoDAO(new ConnectionFactory().recuperaConexion());
	
	}

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id){
		return productoDAO.modificar(nombre,descripcion,cantidad, id);
		}
	 
	
	

	public int  eliminar(Integer id) {
		return productoDAO.eliminar(id);
	
		}
	
//paso 1 Crear la conexion con la base de datos
//paso 2 crear un obejto Statement.createStatement() o PreparedStatement
//paso 3 statement.execute()
//paso 4 cretar un objeto ResultSet resultSet=statement.getResultSet();
	
	 
	public List<Producto> listar() {
		return productoDAO.listar();
	
	      }
	
	public List<Producto>listar(Categoria categoria){
		return productoDAO.listar(categoria.getId());
	}
	
    public void guardar(Producto producto, Integer categoriaId)  {
    	producto.setCategoriaId(categoriaId);
    	productoDAO.guardar(producto);
	}

    	
    
}


