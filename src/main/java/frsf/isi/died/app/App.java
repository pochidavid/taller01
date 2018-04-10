package frsf.isi.died.app;

import frsf.isi.died.tp.modelo.Biblioteca;
import frsf.isi.died.tp.modelo.BibliotecaArray;
import frsf.isi.died.tp.modelo.productos.Libro;
import frsf.isi.died.tp.modelo.productos.MaterialCapacitacion;

public class App {

	public static void main(String[] args) {
		// crear un libro
		Libro l1 = new Libro(1, "Algoritmos 1", 50.0, 25.0, 310);
		System.out.println("Libro creado: " + l1.toString());
		// crear un libro
		Libro l2 = new Libro(2, "Java 1", 30.0, 40.0, 155);
		System.out.println("Libro creado: " + l2.toString());
		// crear un libro
		Libro l3 = new Libro(3, "Python", 20.0, 100.0, 460);
		System.out.println("Libro creado: " + l3.toString());

		System.out.println("Test");
		Biblioteca biblioteca = new BibliotecaArray();
		biblioteca.agregar(l1);
		biblioteca.agregar(l2);
		biblioteca.agregar(l3);

		System.out.println("Cantidad de material disponible:" + biblioteca.cantidadMateriales() + " ("
				+ biblioteca.cantidadLibros() + " libros y " + biblioteca.cantidadVideos() + " videos) ");

		biblioteca.imprimir();
		biblioteca.ordenarPorPrecio(true);
		biblioteca.imprimir();

		for (MaterialCapacitacion mat : biblioteca.materiales()) {
			if (mat != null)
				System.out.println(mat.toString());
		}
		
		//TODO agregar videos
	}
}
