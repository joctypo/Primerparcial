package model;

import java.util.Comparator;

public class NombreContenidoCompare implements Comparator<ContenidoTipo>{

	public NombreContenidoCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(ContenidoTipo o1, ContenidoTipo o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
