package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DetalleFacturas {
	
	private int idDetFac;
	private int cantidad;
	private double subtotal;
	
	@Autowired
	private Factura factura;
	
	@Autowired
	private Libros libro;
	
	public DetalleFacturas() {}

	public int getIdDetFac() {
		return idDetFac;
	}

	public void setIdDetFac(int idDetFac) {
		this.idDetFac = idDetFac;
		
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libros getLibro() {
		return libro;
	}

	public void setLibro(Libros libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "DetalleFacturas [idDetFac=" + idDetFac + ", cantidad=" + cantidad + ", subtotal=" + subtotal
				+ ", factura=" + factura + ", libro=" + libro + "]";
	}


	
	

	
	
	

}
