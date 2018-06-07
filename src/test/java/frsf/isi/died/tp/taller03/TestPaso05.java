package frsf.isi.died.tp.taller03;

import frsf.isi.died.tp.estructuras.ArbolBinarioBusqueda;
import frsf.isi.died.tp.modelo.productos.Libro;
import frsf.isi.died.tp.modelo.productos.MaterialCapacitacion;
import frsf.isi.died.tp.modelo.productos.Video;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestPaso05 {

    private ArbolBinarioBusqueda arbol;
    private Comparator<MaterialCapacitacion> comparaPrecio = (mc1, mc2)-> mc1.precio().intValue()- mc2.precio().intValue();

    @Before
    public void init() {

        arbol = new ArbolBinarioBusqueda(comparaPrecio);

        arbol.add(new Libro(1, "A", 10.0, 20.0, 10));
        arbol.add(new Libro(2, "C", 20.0, 10.0, 10));
        arbol.add(new Libro(3, "X", 30.0, 20.0, 10));
        arbol.add(new Libro(4, "B", 40.0, 30.0, 10));
        arbol.add(new Libro(5, "Z", 50.0, 25.0, 10));
        arbol.add(new Libro(6, "K", 60.0, 20.0, 10));
        arbol.add(new Video(7, "V", 70.0, 10));
        arbol.add(new Video(8, "W", 80.0, 10));
        arbol.add(new Video(9, "N", 30.0, 10));
        arbol.add(new Video(10, "F", 40.0, 10));
        arbol.add(new Video(11, "H", 50.0, 10));

    }

    @Test
    public void testRango(){
        List<MaterialCapacitacion> listaResultado = new ArrayList<>();
        listaResultado.add(new Libro(1, "A", 10.0, 20.0, 10));
        listaResultado.add(new Libro(2, "C", 20.0, 10.0, 10));
        listaResultado.add(new Libro(3, "X", 30.0, 20.0, 10));
        listaResultado.add(new Video(9, "N", 30.0, 10));
        listaResultado.add(new Video(10, "F", 40.0, 10));
        listaResultado.add(new Video(11, "H", 50.0, 10));

        assertEquals(listaResultado, arbol.rango(21.0,65.5));

    }

}
