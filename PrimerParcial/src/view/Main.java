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
		
	}
	
	public void keyPressed() {
		
		controlle.ordenar(key);
		
	}
}
