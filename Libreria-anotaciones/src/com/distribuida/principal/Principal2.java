package com.distribuida.principal;

import java.sql.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Clientes;
import com.distribuida.entities.DatosLibreria;
import com.distribuida.entities.DetalleFacturas;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libros;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("**1**");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Principal3.class);
		System.out.println("**2**");
		
		
		Clientes cliente = context.getBean("cliente", Clientes.class);
		Libros libro = context.getBean("libro", Libros.class);
		Factura factura= context.getBean("factura", Factura.class);
		Categoria categoria = context.getBean("categoria", Categoria.class);
		Autor autor = context.getBean("autor", Autor.class);
		DetalleFacturas detalleFactura = context.getBean("detFac", DetalleFacturas.class);
		DatosLibreria datosLibreria = context.getBean("datosLibreria", DatosLibreria.class);
		
		cliente.setIdCliente(1);
		cliente.setCedula(1726606765);
		cliente.setNombre("Pedro");
		cliente.setApellido("Marlon");
		cliente.setDireccion("Cumbaya");
		cliente.setTelefono(994825836);
		cliente.setCorreo("pjalon19@gmail.com");
		
		factura.setIdFactura(1);;
		factura.setNum_factura(2);
		factura.setFecha(new Date(0));
		factura.setTotalNeto(500.00);
		factura.setIva(0.12);
		factura.setTotal(225.00);
		
		detalleFactura.setIdDetFac(1);;
		detalleFactura.setCantidad(2);
		detalleFactura.setSubtotal(12.12);
		
		categoria.setIdCategoria(1);
		categoria.setCategoria("Terror");
		categoria.setDescripcion("libro basado en novela");
		
		autor.setIdAutor(22);
		autor.setNombre("José");
		autor.setPais("Portugal");
		autor.setApellido("Saramago");
		autor.setCorreo("jose@autor.com");
		autor.setTelefono(3333348);
		autor.setDireccion("Portugal");
		
		libro.setIdLibro(0);
		libro.setTitulo("La viuda");
		libro.setEditorial("PlanetadeLibros");
		libro.setNum_paginas(320);
		libro.setEdicion("Primera Edicion");
		libro.setIdioma("Español");
		libro.setFecha_publicacion(new Date(0));
		libro.setDescripcion("Hay que vivir aunque sea de cualquier modo, siempre que sea vivir.");
		libro.setTipoPasta("Carton");
		libro.setISBN("978-958-42-8469-3");
		libro.setNum_ejemplares(45);
		libro.setPortada(null);
		libro.setPresentacionlibro("PDF o Fisico");
		libro.setPrecio(50.00);
		
		factura.setCliente(cliente); 
		detalleFactura.setFactura(factura);
		detalleFactura.setLibro(libro);
		libro.setAutor(autor);
		libro.setCategoria(categoria);
		
		System.out.println(cliente.toString());
		System.out.println(factura.toString());
		System.out.println(libro.toString());
		System.out.println(detalleFactura.toString());
		System.out.println(autor.toString());
		System.out.println(categoria.toString());
		System.out.println(datosLibreria.toString());
	
	
		System.out.println("**3**");
		context.close();
		System.out.println("**4**");
		
	}

}
