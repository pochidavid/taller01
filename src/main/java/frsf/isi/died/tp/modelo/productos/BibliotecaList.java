package frsf.isi.died.tp.modelo.productos;

import java.util.ArrayList;
import java.util.Collection;

import frsf.isi.died.tp.modelo.Biblioteca;

public class BibliotecaList implements Biblioteca {
	
	private	ArrayList<MaterialCapacitacion>	materiales;
	
	public	BibliotecaList() {	
		this.materiales	= new ArrayList<>();
	}

	@Override
	public void agregar(MaterialCapacitacion material) {
		materiales.add(material);
	}

	@Override
	public Integer cantidadMateriales() {
		return materiales.size();
	}

	@Override
	public Integer cantidadLibros() {
		int cont=0,i;
		for(i=0;i < materiales.size();i++){
			if(materiales.get(i) instanceof Libro){
				cont++;
			}
		}
		return cont;
	}

	@Override
	public Integer cantidadVideos() {
		int cont=0;
		for(int i=0;i < materiales.size();i++){
			if(materiales.get(i) instanceof Video){
				cont++;
			}
		}
		return cont;
	}

	@Override
	public Collection<MaterialCapacitacion> materiales() {
		return this.materiales;
	}

	@Override
	public void imprimir() {
		for(MaterialCapacitacion material: this.materiales()) System.out.println(material);
	}

	@Override
	public void ordenarPorPrecio(Boolean b) {
		// TODO Auto-generated method stub

	}

}
