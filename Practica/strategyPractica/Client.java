package strategyPractica;

import java.util.ArrayList;
import java.util.List;

import strategyPractica.Celular.Gama;

public class Client {

	public static void main(String[] args) {
		Inventario inventario = new Inventario();
		List<Celular> celuList = new ArrayList<>();
		
		celuList.add(new Celular("A20", "Samsung", 200, Gama.Baja));
		celuList.add(new Celular("A30", "Samsung", 400, Gama.Media));
		celuList.add(new Celular("S21", "Samsung", 1000, Gama.ALTA));
		celuList.add(new Celular("S21", "Samsung", 1100, Gama.ALTA));
		inventario.setCelularList(celuList);
		inventario.buscar("S21");
		inventario.buscar(400);
		inventario.buscar("A20", 200);
		celuList.add(new Celular("iPhone 8", "Apple", 300, Gama.Baja));
		celuList.add(new Celular("iPhone X", "Apple", 450, Gama.Media));
		celuList.add(new Celular("iPhone SE", "Apple", 500, Gama.Media));
		celuList.add(new Celular("iPhone 12 Pro", "Apple", 1200, Gama.ALTA));
		celuList.add(new Celular("iPhone 12 Pro", "Apple", 1350, Gama.ALTA));

		inventario.setCelularList(celuList);
		inventario.buscar("iPhone X");
		inventario.buscar(500);
		inventario.buscar("iPhone 12 Pro", 1350);


	}

}
