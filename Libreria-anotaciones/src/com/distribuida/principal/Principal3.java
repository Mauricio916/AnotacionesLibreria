package com.distribuida.principal;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Clientes;
import com.distribuida.entities.DatosLibreria;
import com.distribuida.entities.DetalleFacturas;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libros;


@Configuration
@Component("com.distribuida")
@PropertySource("classpath:datosLibreria.properties")
public class Principal3 {
	
	@Bean
	public Clientes cliente() {
		return new Clientes();
		
	}
	
	@Bean
	public Libros libro() {
		return new Libros();

}
	@Bean
	public Factura  factura() {
		return new Factura();

}
	@Bean
	public Categoria  categoria() {
		return new Categoria();

}
	@Bean
	public DetalleFacturas detFac () {
		return new DetalleFacturas();

}
	
	@Bean
	public Autor autor() {
		return new Autor();

}
	@Bean
	public DatosLibreria datosLibreria() {
		return new DatosLibreria();

}
}
