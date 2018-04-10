package frsf.isi.died.tp.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import frsf.isi.died.tp.modelo.productos.Libro;
import frsf.isi.died.tp.modelo.productos.MaterialCapacitacion;

public interface Biblioteca {

	public void agregar(MaterialCapacitacion material);
	
	public Integer cantidadMateriales();
	public Integer cantidadLibros();
	public Integer cantidadVideos();
	
	public Collection<MaterialCapacitacion> materiales();
	
	public void imprimir();
	
	public void ordenarPorPrecio(Boolean b);

	

	
}
