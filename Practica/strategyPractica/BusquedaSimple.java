package strategyPractica;

import java.util.List;

public class BusquedaSimple implements IEstrategiaBusqueda{

	@Override
	public void buscar(List<Celular> celulares, String name) {
		System.out.println("BUSQUEDA SIMPLE");

		for(Celular celular:celulares) {
			if(celular.getModelo().toLowerCase().equals(name.toLowerCase())) {
				System.out.println("*** Modelo Encontrado");
				celular.info();
			}
		}
		
	}

	@Override
	public void buscar(List<Celular> celulares, String name, int Precio) {
		System.out.println("BUSQUEDA SIMPLE");

		for(Celular celular:celulares) {
			if((celular.getModelo().toLowerCase().equals(name.toLowerCase()))&& (celular.getPrecio() == Precio)) {
				System.out.println("*** Modelo Encontrado");
				celular.info();
			}
		}
		
	}

	@Override
	public void buscar(List<Celular> celulares, int precio) {
		System.out.println("BUSQUEDA SIMPLE");

		for(Celular celular:celulares) {
			if(celular.getPrecio() == precio) {
				System.out.println("*** Modelo Encontrado");
				celular.info();
			}
		}
		
	}



}
