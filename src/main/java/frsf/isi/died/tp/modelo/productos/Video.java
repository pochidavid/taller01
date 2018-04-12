package frsf.isi.died.tp.modelo.productos;

public class Video extends MaterialCapacitacion {
	
	private static double costo_segundo = 0.15;
	private Integer  duracion;
	
	public Video(){
		
	}
	public Video(Integer id, String titulo){
		super(id,titulo);
	}
	public Video(Integer id, String titulo, Double costo){
		super(id,titulo,costo);
	}
	public Video(Integer id, String titulo, Double costo, Integer duracion){
		super(id,titulo,costo);
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
		return false;
	}

	@Override
	public Boolean esVideo() {
		// TODO Auto-generated method stub
		return true;
	}

}
