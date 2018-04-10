/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frsf.isi.died.tp.modelo.productos;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author mdominguez
 */
public class Libro extends MaterialCapacitacion {
	private Double precioCompra;
	private Integer paginas;

	public Libro() {
	}

	public Libro(Integer id, String titulo) {
		this(id, titulo,0.0,0.0,0);
	}

	public Libro(Integer id, String titulo, Double costo, Double precioCompra, Integer paginas) {
		super(id, titulo, costo);
		this.precioCompra = precioCompra;
		this.paginas = paginas;
	}

	public Double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	/**
	 * Método auxiliar que calcula cual es el aumento a aplicar al precio de costo en funcion 
	 * de la cantidad de paginas.
	 * Se debe aumentar un 3% cada 150 paginas.
	 * @return
	 */
	private Double porcentajeAumentoPorPagina() {
		//TODO completar metodo privado
		return 0.0;
	}

	@Override
	public Double precio() {
		//TODO implementar metodo abstracto
		return null;
	}

	@Override
	public Boolean esLibro() {
		//TODO implementar metodo abstracto
		return null;
	}

	@Override
	public Boolean esVideo() {
		//TODO implementar metodo abstracto
		return null;
	}

	

}