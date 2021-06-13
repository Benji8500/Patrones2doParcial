package strategy;

import java.util.List;

public class Invierno implements IEstrategiaVenta{

	@Override
	public void oferta(List<Prenda> Prendas) {
		for(Prenda pren: Prendas) {
			pren.setPrecio(pren.getPrecio()*1.1);
			System.out.println(">La estacion es invierno y la prenda de tipo: "+pren.getTipo()+" tiene un precio de "+ pren.getPrecio()+"bs");
		}
		
	}

}
