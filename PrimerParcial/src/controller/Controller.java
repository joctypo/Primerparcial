package controller;

import java.util.LinkedList;

import model.ContenidoTipo;
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
		case 'n':
			logic.ordenar(0);
			break;

		case 'a':
			logic.ordenar(1);
			break;
		case 'r':
			logic.ordenar(2);
			break;
		case 't':
			logic.ordenar(3);
			break;
		}
		
	}
	
	public LinkedList<ContenidoTipo> LiknedList() {
		
		return logic.getContenido();
		
	}

}
