package model;

import processing.core.PApplet;

public class Movie extends ContenidoTipo{

private PApplet app;
	public Movie(String nombre, int a�o, int rating, String tipoc, PApplet app) {
		super(nombre,a�o,rating,tipoc,app);
		this.app=app;
	}

	
	public void draw(int posx,int posy) {
		
		
		app.text(getNombre()+" "+ getA�o() + " " + getRating()+"% "+getTipoc()+ " ", posx, posy);
	}
	@Override
	public int compareTo(ContenidoTipo o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
