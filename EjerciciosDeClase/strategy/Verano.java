package strategy;

import java.util.List;

public class Verano implements IEstrategiaVenta{

	@Override
	public void oferta(List<Prenda> Prendas) {
		for(Prenda pren: Prendas) {
			pren.setPrecio(pren.getPrecio()*0.9);
			System.out.println(">La estacion es verano y la prenda de tipo: "+pren.getTipo()+" tiene un precio de "+ pren.getPrecio()+"bs");
		}
		
	}

}
