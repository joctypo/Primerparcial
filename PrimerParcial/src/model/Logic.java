package model;

import java.util.*;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private String[] info1;
	private LinkedList<ContenidoTipo> contenido;
	private AñoContenidoCompare acc;
	private NombreContenidoCompare ncc;
	private TipoContenidoCompare tcc;
	
	
	
	
	
	
	public Logic(PApplet app) {
		this.app=app;
		contenido = new LinkedList<ContenidoTipo>();
		acc = new AñoContenidoCompare();
		ncc = new NombreContenidoCompare();
		tcc = new TipoContenidoCompare();
		
		info1=app.loadStrings("../data/imports/netflix.txt");
		
		cargar();
	}
	
	public void cargar() {
		for (int i=0; i<info1.length;i++) {
			String[] netflix1= info1[i].split(",");
			String nombre = netflix1[0];
			int año=Integer.parseInt(netflix1[1]);
			int rating = Integer.parseInt(netflix1[2]);
			String tipoc = netflix1[3];
			
			
			
			if(netflix1[3].contentEquals("serie")) {
				contenido.add(new Serie(nombre,año,rating,tipoc,app));
				
			}else {
				
				contenido.add(new Movie(nombre,año,rating,tipoc,app));
			}
			
			
			
		}
			
		}
		
	

	public void ordenar(int i) {
		switch (i) {
		case 0:
			Collections.sort(contenido,ncc);
			
			break;

		case 1:
			Collections.sort(contenido,acc);
			
			break;
		case 2:
			Collections.sort(contenido);
			
			break;
		case 3:
			Collections.sort(contenido,tcc);
			break;
		}
		
	}

	public LinkedList<ContenidoTipo> getContenido() {
		return contenido;
	}

	public void setContenido(LinkedList<ContenidoTipo> contenido) {
		this.contenido = contenido;
	}
	
	

}
