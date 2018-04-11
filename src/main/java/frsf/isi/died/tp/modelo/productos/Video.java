package frsf.isi.died.tp.modelo.productos;

public class Video extends MaterialCapacitacion {
	
	private static double costo_segundo;
	private Integer  duracion;
	
	public Video(){
		
	}
	public Video(Integer id, String titulo){
		this.id=id;
		this.titulo=titulo;
	}
	public Video(Integer id, String titulo, Double costo){
		this.id=id;
		this.titulo=titulo;
		costo_segundo=costo;
	}
	public Video(Integer id, String titulo, Double costo, Integer duracion){
		this.id=id;
		this.titulo=titulo;
		costo_segundo=costo;
		this.duracion=duracion;
	}
	@Override
	public Double precio() {
		// TODO Auto-generated method stub
		return this.costo + (this.duracion*costo_segundo);
	}

	@Override
	public Boolean esLibro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean esVideo() {
		// TODO Auto-generated method stub
		return null;
	}

}
