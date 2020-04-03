package model;

import processing.core.PApplet;

public class Movie extends ContenidoTipo{

private PApplet app;
private int rating;
	public Movie(String nombre, int año, int rating, String tipoc, PApplet app) {
		super(nombre,año,rating,tipoc,app);
		this.app=app;
		this.rating=rating;
		
	}

	
	public void draw(int posx,int posy) {
		
		
		app.text(getNombre()+" "+ getAño() + " " + getRating()+"% "+getTipoc()+ " ", posx, posy);
	}
	@Override
	public int compareTo(ContenidoTipo o) {
		
		return this.rating - o.getRating();
	}

}
