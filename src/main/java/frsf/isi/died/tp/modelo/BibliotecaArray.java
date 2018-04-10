package frsf.isi.died.tp.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import frsf.isi.died.tp.modelo.productos.Libro;
import frsf.isi.died.tp.modelo.productos.MaterialCapacitacion;

import frsf.isi.died.tp.util.ListaServiceRadix;
import frsf.isi.died.tp.util.ListasService;

public class BibliotecaArray implements Biblioteca{

	private MaterialCapacitacion[] materialCapacitacion;
	private Integer cantidadSuscriptores;
	private Integer cantidadMaterial;
	private ListasService service;
	private Boolean ordenarPorPrecio;
	
	public BibliotecaArray() {
		service = new ListaServiceRadix();
		cantidadMaterial=0;
		cantidadSuscriptores=0;
		this.ordenarPorPrecio = false;
		this.materialCapacitacion= new MaterialCapacitacion[10];
	}
	


	@Override
	public void imprimir() {		
		//this.service.setArreglo(materialCapacitacion);
		if(ordenarPorPrecio)this.service.ordenar();
		this.service.imprimir();
	}
	
	

	@Override
	public void ordenarPorPrecio(Boolean b) {
		this.ordenarPorPrecio=b;
	}



	@Override
	public void agregar(MaterialCapacitacion material) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Integer cantidadMateriales() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Integer cantidadLibros() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Integer cantidadVideos() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Collection<MaterialCapacitacion> materiales() {
		// TODO Auto-generated method stub
		return null;
	}


}
