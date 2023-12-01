package com.distribuida.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Clientes {
	
	private int idCliente;
	private int cedula;
	private String nombre;
	private String apellido;
	private String direccion;
	private int telefono;
	private String correo;
	
	public Clientes() {}



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
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
		return "Clientes [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + "]";
	}

	
	@PostConstruct
	public void despuesCreacion() {
		System.out.println("Se ejcuta tareas despues de la construccion");
	}
	@PreDestroy
	public void antesDestruccion() {
		System.out.println("Se ejcuta tareas antes de la destruccion del Bean");
	}
	
	

}
