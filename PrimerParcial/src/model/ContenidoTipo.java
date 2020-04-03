package model;

import processing.core.PApplet;

public abstract class ContenidoTipo implements Comparable<ContenidoTipo>{
	private String nombre;
	private int año;
	private int rating;
	private String tipoc;
	private PApplet app;
	
	public ContenidoTipo(String nombre, int año, int rating, String tipoc, PApplet app) {
		this.nombre=nombre;
		this.año=año;
		this.rating=rating;
		this.tipoc=tipoc;
		this.app=app;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTipoc() {
		return tipoc;
	}

	public void setTipoc(String tipoc) {
		this.tipoc = tipoc;
	}

	public void draw(int posx, int posy) {
		
		
	}

}
