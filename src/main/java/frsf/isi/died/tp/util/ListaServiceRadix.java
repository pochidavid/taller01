package frsf.isi.died.tp.util;

import frsf.isi.died.tp.modelo.productos.MaterialCapacitacion;

public class ListaServiceRadix extends ListasService{

	private Ordenable[][] residuos = new Ordenable[10][10];
	private int[] cantidadPorFila = new int[10];
	
	
	@Override
	public void ordenar() {

		for(int i=0;i<5;i++) {
			// calcular la base de la posicion actual
			// para la unidad es 1, para la decena 10, para la centena 100
			// asi el numero 237 se puede descomponer en 2*100 + 3*10 + 7* 1
			int peso = (int) Math.pow(10.0,i);

			for(Ordenable mat : this.arregloOrdenable) {
				//TODO
			}
			int indiceArregloOrdenado=0;
			for(int j=0;j<10;j++) {
				for(int k=1;k<=cantidadPorFila[j];k++) {
					this.arregloOrdenable[indiceArregloOrdenado++]=residuos[j][k-1];	
				}		
				//reiniciar el contador
				cantidadPorFila[j]=0;
			}			
		}
	}

}
