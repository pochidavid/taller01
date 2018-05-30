package frsf.isi.died.tp.estructuras;

import frsf.isi.died.tp.modelo.productos.MaterialCapacitacion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArbolBinarioBusqueda extends Arbol {

	private MaterialCapacitacion valor;
	private Arbol izquierdo;
	private Arbol derecho;
	private Comparator<MaterialCapacitacion> comparador;

	public ArbolBinarioBusqueda(Comparator<MaterialCapacitacion> comparardor) {
		this(null,comparardor);
	}
	

	public ArbolBinarioBusqueda(MaterialCapacitacion e,Comparator<MaterialCapacitacion> comparardor) {
		this.izquierdo = new ArbolVacio();
		this.derecho = new ArbolVacio();
		this.valor = e;
		this.comparador = comparardor;
	}

	@Override
	public boolean esVacio() {
		return false;
	}

	@Override
	public Arbol izquierdo() {
		return this.izquierdo;
	}

	@Override
	public Arbol derecho() {
		return this.derecho;
	}

	@Override
	public boolean contiene(MaterialCapacitacion unValor) {
		if (this.valor.equals(unValor))
			return true;
		return this.izquierdo.contiene(unValor) || this.derecho.contiene(unValor);
	}

	@Override
	public boolean equals(Arbol unArbol) {
		return unArbol instanceof ArbolBinarioBusqueda && this.valor.equals(((ArbolBinarioBusqueda) unArbol).valor)
				&& this.izquierdo.equals(unArbol.izquierdo()) && this.derecho.equals(unArbol.derecho());
	}

	@Override
	public Integer profundidad() {		
		if(this.valor==null) return 0;
		return 1 + Math.max(this.izquierdo.profundidad(), this.derecho.profundidad());
	}

	@Override
	public void add(MaterialCapacitacion mat) {
		if (this.valor == null) {
			this.valor = mat;
			return;
		} else {
			if (this.comparador.compare(mat, this.valor) > 0) {
				if (this.derecho.esVacio())
					this.derecho = new ArbolBinarioBusqueda(mat,this.comparador);
				else
					this.derecho.add(mat);
			} else {
				if (this.izquierdo.esVacio())
					this.izquierdo = new ArbolBinarioBusqueda(mat,this.comparador);
				else
					this.izquierdo.add(mat);
			}
		}
	}
	
	@Override
	public void imprimir() {
		this.inOrden().stream().forEach(System.out::println);
	}

	@Override
	public Integer tamanio() {
		Integer tamanio = 1;
		tamanio+= this.izquierdo.tamanio();
		tamanio+= this.derecho.tamanio();

		return tamanio;
	}

	@Override
	public Integer tamanioLibros() {
            Integer tamanio = 0;
            if(this.valor.esLibro()) tamanio++;
            tamanio+= this.izquierdo.tamanioLibros();
            tamanio+= this.derecho.tamanioLibros();
            
            return tamanio;
	}

	@Override
	public Integer tamanioVideos() {
            Integer tamanio = 0;
            if(this.valor.esVideo()) tamanio++;
            tamanio+= this.izquierdo.tamanioVideos();
            tamanio+= this.derecho.tamanioVideos();
            
            return tamanio;
	}

	@Override
	public List<MaterialCapacitacion> preOrden() {
		List<MaterialCapacitacion> lista = new ArrayList<MaterialCapacitacion>();
		lista.add(valor);
                if(!(izquierdo.esVacio()))
                    lista.addAll(this.izquierdo.preOrden());
                if(!(derecho.esVacio()))
                    lista.addAll(this.derecho.preOrden());

		return lista;
	}

	@Override
	public List<MaterialCapacitacion> inOrden() {
		List<MaterialCapacitacion> lista = new ArrayList<MaterialCapacitacion>();
                if(!(izquierdo.esVacio()))
                    lista.addAll(this.izquierdo.inOrden());
		lista.add(valor);
                if(!(derecho.esVacio()))
                    lista.addAll(this.derecho.inOrden());


		return lista;
	}

	@Override
	public List<MaterialCapacitacion> postOrden() {
		List<MaterialCapacitacion> lista = new ArrayList<MaterialCapacitacion>();
                if(!(izquierdo.esVacio()))
                    lista.addAll(this.izquierdo.postOrden());
                if(!(derecho.esVacio()))
                    lista.addAll(this.derecho.postOrden());
                lista.add(valor);

		return lista;
	}
	
	@Override
	public MaterialCapacitacion buscar(Integer precioBuscado) {
		int comparacion =this.valor.precio().intValue()- precioBuscado.intValue(); 
		// TODO comple

		if(comparacion == 0) return this.valor;
		else if(comparacion > 0) return izquierdo.buscar(precioBuscado);
		else return derecho.buscar(precioBuscado);
	}

	@Override
	public List<MaterialCapacitacion> rango(Double precioMin, Double precioMax) {
		List<MaterialCapacitacion> lista = new ArrayList<MaterialCapacitacion>();
		int comparacionPrecioMin =this.valor.precio().compareTo(precioMin);
		int comparacionPrecioMax =this.valor.precio().compareTo(precioMax);

		// TODO completar
		return lista;
	}


}
