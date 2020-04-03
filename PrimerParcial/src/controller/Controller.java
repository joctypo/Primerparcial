package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {

	private PApplet app;
	private Logic logic;
	
	
	public Controller(PApplet app) {
		this.app=app;
		logic = new Logic(app);
	}

	public void ordenar(char key) {
		
		switch (key) {
		case 'a':
			logic.ordenar(0);
			break;

		case 'b':
			logic.ordenar(1);
			break;
		case 'c':
			logic.ordenar(2);
			break;
		case 'd':
			logic.ordenar(3);
			break;
		}
		
	}

}
