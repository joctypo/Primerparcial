package model;

import java.util.*;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	private PApplet app;
	private String[] info1;
	private LinkedList<ContenidoTipo> contenido;
	private AñoContenidoCompare acc;
	private NombreContenidoCompare ncc;
	private TipoContenidoCompare tcc;
	private int ordenado;
	
	
	

	
	
	
	
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
			PImage imagen = app.loadImage("../data/imports/"+nombre.replace(" ",  "").toLowerCase());
			
			if(netflix1[3].contentEquals("serie")) {
				contenido.add(new Serie(imagen,nombre,año,rating,tipoc,app));
				
			}else {
				
				contenido.add(new Movie(imagen,nombre,año,rating,tipoc,app));
			}
			
			
			
		}
		
	
		
		
			
		}
		
	

	public void ordenar(int i) {
		switch (i) {
		case 0:
			Collections.sort(contenido,ncc);
			ordenado=0;
			break;

		case 1:
			Collections.sort(contenido,acc);
			ordenado=1;
			break;
		case 2:
			Collections.sort(contenido);
			ordenado=2;
			break;
		case 3:
			Collections.sort(contenido,tcc);
			ordenado=3;
			break;
		}
		
	}

	public LinkedList<ContenidoTipo> getContenido() {
		return contenido;
	}

	public void setContenido(LinkedList<ContenidoTipo> contenido) {
		this.contenido = contenido;
	}
	
	public void guardar() {
		
		String[] textico;
		textico = new String[contenido.size()];
		
		for (int t=0;t<contenido.size();t++) {
			String nombre= "Nombre: " + contenido.get(t).getNombre().toUpperCase();
			String año="Año: " + contenido.get(t).getAño();
			String rating= "Rating: " + contenido.get(t).getRating()+"%";
			String tipo= "Tipo: " + contenido.get(t).getTipoc();
			
			textico[t] = nombre+año+rating+tipo;
			
			
		}
		
		switch (ordenado) {
		case 0:
			app.saveStrings("./data/exports/nombre.txt", textico);
			break;
		case 1:
			app.saveStrings("./data/exports/año.txt", textico);
			break;
		case 2:
			app.saveStrings("./data/exports/rating.txt", textico);
			break;
		case 3:
			app.saveStrings("./data/exports/tipo.txt", textico);
			break;
		
		}
		
		
	}

}
