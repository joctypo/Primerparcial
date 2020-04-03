package model;

import java.util.Comparator;

public class TipoContenidoCompare implements Comparator <ContenidoTipo>{

	public TipoContenidoCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(ContenidoTipo o1, ContenidoTipo o2) {
		// TODO Auto-generated method stub
		return o1.getTipoc().compareTo(o2.getTipoc());
	}

}
