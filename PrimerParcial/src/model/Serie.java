package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Serie extends ContenidoTipo{
 private PApplet app;
 private int rating;
	public Serie(PImage imagefinal, String nombre, int año, int rating, String tipoc, PApplet app) {
		super(imagefinal,nombre,año,rating,tipoc,app);
		this.app=app;
		this.rating = rating; 
	}

	public void draw(int posx,int posy) {
		
		app.textSize(20);
		app.image(getImagenfinal(), 10, posy,50,100);
		app.text(getNombre()+" "+ getAño() + " " + getRating()+"% "+getTipoc()+ " ", posx, posy);
	}
	
	@Override
	public int compareTo(ContenidoTipo arg0) {
		
		return this.rating - arg0.getRating();
	}

}
