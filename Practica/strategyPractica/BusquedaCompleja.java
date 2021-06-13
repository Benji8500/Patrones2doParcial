package strategyPractica;

import java.util.Iterator;
import java.util.List;

public class BusquedaCompleja implements IEstrategiaBusqueda{

	@Override
	public void buscar(List<Celular> celulares, String name) {
		System.out.println("BUSQUEDA COMPLEJA");
		Iterator<Celular> iterator = celulares.iterator();
		while (iterator.hasNext()) {
	        Celular celular = iterator.next();
	        if (celular.getModelo().toLowerCase().equals(name.toLowerCase())) {
	        	System.out.println("*** Modelo Encontrado");
				celular.info();
	        }
	    }		
		
	}

	@Override
	public void buscar(List<Celular> celulares, String name, int Precio) {
		System.out.println("BUSQUEDA COMPLEJA");

		Iterator<Celular> iterator = celulares.iterator();
		while (iterator.hasNext()) {
	        Celular celular = iterator.next();
	        if ((celular.getModelo().toLowerCase().equals(name.toLowerCase()))&& (celular.getPrecio() == Precio)) {
	        	System.out.println("*** Modelo Encontrado");
				celular.info();
	        }
	    }
		
	}

	@Override
	public void buscar(List<Celular> celulares, int precio) {
		System.out.println("BUSQUEDA COMPLEJA");

		Iterator<Celular> iterator = celulares.iterator();
		while (iterator.hasNext()) {
	        Celular celular = iterator.next();
	        if (celular.getPrecio() == precio) {
	        	System.out.println("*** Modelo Encontrado");
				celular.info();
	        }
	    }
		
		
	}



}
