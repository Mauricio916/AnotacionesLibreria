package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatosLibreria {

	@Value("${nombre}")
	private String nombre;
	@Value("${direccion}")
	private String direccion;
	@Value("${telefono}")
	private String telefono;
	@Value("${correo}")
	private String correo;
	
	
	public DatosLibreria() {}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "DatosLibreria [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", correo="
				+ correo + "]";
	}


}
