package model;

import processing.core.PApplet;

public class Serie extends ContenidoTipo{
 private PApplet app;
	public Serie(String nombre, int a�o, int rating, String tipoc, PApplet app) {
		super(nombre,a�o,rating,tipoc,app);
		this.app=app;
	}

	public void draw(int posx,int posy) {
		
		
		app.text(getNombre()+" "+ getA�o() + " " + getRating()+"% "+getTipoc()+ " ", posx, posy);
	}
	
	@Override
	public int compareTo(ContenidoTipo arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
