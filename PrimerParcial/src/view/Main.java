package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	private Controller controlle;
	
	
	public static void main(String[] args) {
		PApplet.main("view.Main");
	}
	
	public void settings() {
		size(600,600);
		
	}

	public void setup() {
		controlle = new Controller(this);
		
	}
	
	public void draw() {
		background(0);
		for (int i=0;i<controlle.LiknedList().size();i++) {
			
			int posx= 100;
			int posy= 70*(i+1);
			
			controlle.LiknedList().get(i).draw(posx,posy);
			
		}
		
		
		text("Pulsa n para ordenar por nombre",20,500);
		text("Pulsa a para ordenar por año",20,520);
		text("Pulsa r para ordenar por rating",20,540);
		text("Pulsa t para ordenar por tipo",20,560);
		
		
	}
	
	public void keyPressed() {
		
		controlle.ordenar(key);
		
	}
}
