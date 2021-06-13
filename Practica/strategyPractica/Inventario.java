package strategyPractica;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
	private IEstrategiaBusqueda estrategiaBusqueda;
	private List<Celular> celularList = new ArrayList<>();
	
	public Inventario() {}
	
	public void buscar(String name) {
		if(celularList.size()<5) {
			BusquedaSimple busquedaSimple = new BusquedaSimple();
			this.setEstrategiaBusqueda(busquedaSimple);
		}else {
			BusquedaCompleja busquedaCompleja = new BusquedaCompleja();
			this.setEstrategiaBusqueda(busquedaCompleja);
			
		}
		estrategiaBusqueda.buscar(this.celularList, name);
	}
	
	public void buscar(int precio) {
		if(celularList.size()<5) {
			BusquedaSimple busquedaSimple = new BusquedaSimple();
			this.setEstrategiaBusqueda(busquedaSimple);
		}else {
			BusquedaCompleja busquedaCompleja = new BusquedaCompleja();
			this.setEstrategiaBusqueda(busquedaCompleja);
			
		}
		estrategiaBusqueda.buscar(this.celularList, precio);
	}
	
	public void buscar(String name, int precio) {
		if(celularList.size()<5) {
			BusquedaSimple busquedaSimple = new BusquedaSimple();
			this.setEstrategiaBusqueda(busquedaSimple);
		}else {
			BusquedaCompleja busquedaCompleja = new BusquedaCompleja();
			this.setEstrategiaBusqueda(busquedaCompleja);
			
		}
		estrategiaBusqueda.buscar(this.celularList,name, precio);
	}

	public IEstrategiaBusqueda getEstrategiaBusqueda() {
		return estrategiaBusqueda;
	}

	public void setEstrategiaBusqueda(IEstrategiaBusqueda estrategiaBusqueda) {
		this.estrategiaBusqueda = estrategiaBusqueda;
	}

	public List<Celular> getCelularList() {
		return celularList;
	}

	public void setCelularList(List<Celular> celularList) {
		this.celularList = celularList;
	}
	
	
}
