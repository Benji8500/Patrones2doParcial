package strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Inventario inventario = new Inventario();
		List<Prenda> prendas = new ArrayList<>();
		prendas.add(new Prenda("Pantalon",300));
		prendas.add(new Prenda("Pantalon",700));
		prendas.add(new Prenda("Camisa",200));
		prendas.add(new Prenda("Chamarra",3000));
		prendas.add(new Prenda("Cinturon",300));
		prendas.add(new Prenda("Polera",300));
		prendas.add(new Prenda("Polera",300));
		prendas.add(new Prenda("Short",300));
		prendas.add(new Prenda("Vestido",900));
		
		inventario.setPrendas(prendas);
		
		inventario.setEstrategiaVenta(new Invierno());
		inventario.venta();
		
		inventario.setEstrategiaVenta(new Verano());
		inventario.venta();
		
		
		inventario.setEstrategiaVenta(new Primavera());
		inventario.venta();
		
		inventario.setEstrategiaVenta(new Otono());
		inventario.venta();
		
	}

}
