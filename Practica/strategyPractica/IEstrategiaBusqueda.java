package strategyPractica;

import java.util.List;


public interface IEstrategiaBusqueda {
	void buscar (List<Celular> celulares, String name);
	void buscar (List<Celular> celulares, String name, int Precio);
	void buscar (List<Celular> celulares, int precio);


}
