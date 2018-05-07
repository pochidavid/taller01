package frsf.isi.died.tp.modelo;

import frsf.isi.died.tp.modelo.productos.MaterialCapacitacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BibliotecaList implements Biblioteca {
    private ArrayList<MaterialCapacitacion> materiales;

    public BibliotecaList() {
        this.materiales = new ArrayList<>();
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
        Integer cantidad = 0;

        for(MaterialCapacitacion material:materiales){
            if(material != null && material.esLibro()) cantidad++;
        }

        return cantidad;
    }

    @Override
    public Integer cantidadVideos() {
        Integer cantidad = 0;

        for(MaterialCapacitacion material:materiales){
            if(material != null && material.esVideo()) cantidad++;
        }

        return cantidad;
    }

    @Override
    public Collection<MaterialCapacitacion> materiales() {
        return this.materiales;
    }

    @Override
    public void imprimir() {
        for(MaterialCapacitacion material:materiales){
            System.out.println(material);
        }
    }

    @Override
    public void ordenarPorPrecio(Boolean b) {
        if(b) {
            Collections.sort(materiales, (m1,m2) -> (int) (m1.precio()-m2.precio()));
        }else{
            Collections.sort(materiales);
        }
    }
}
