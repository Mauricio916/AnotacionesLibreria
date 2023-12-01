package com.distribuida.entities;

import java.awt.Image;
import java.sql.Date;

import org.springframework.stereotype.Component;


@Component
public class Libros {

	
	private int idLibro;
	private String titulo;
	private String editorial;
	private int num_paginas;
	private String edicion;
	private String idioma;
	private Date fecha_publicacion;
	private String descripcion;
	private String tipoPasta;
	private String ISBN;
	private int num_ejemplares;
	private Autor autor;
	private Categoria categoria;
	private Image portada;
	private String presentacionlibro; 
	private double precio;
	
	
	public Libros() {}




	public int getIdLibro() {
		return idLibro;
	}




	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}




	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getNum_paginas() {
		return num_paginas;
	}


	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}


	public String getEdicion() {
		return edicion;
	}


	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}


	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipoPasta() {
		return tipoPasta;
	}


	public void setTipoPasta(String tipoPasta) {
		this.tipoPasta = tipoPasta;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public int getNum_ejemplares() {
		return num_ejemplares;
	}


	public void setNum_ejemplares(int num_ejemplares) {
		this.num_ejemplares = num_ejemplares;
	}

	


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Image getPortada() {
		return portada;
	}


	public void setPortada(Image portada) {
		this.portada = portada;
	}


	public String getPresentacionlibro() {
		return presentacionlibro;
	}


	public void setPresentacionlibro(String presentacionlibro) {
		this.presentacionlibro = presentacionlibro;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}




	@Override
	public String toString() {
		return "Libros [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", num_paginas="
				+ num_paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fecha_publicacion="
				+ fecha_publicacion + ", descripcion=" + descripcion + ", tipoPasta=" + tipoPasta + ", ISBN=" + ISBN
				+ ", num_ejemplares=" + num_ejemplares + ", autor=" + autor + ", categoria=" + categoria + ", portada="
				+ portada + ", presentacionlibro=" + presentacionlibro + ", precio=" + precio + "]";
	}





	
	
	
	
}
