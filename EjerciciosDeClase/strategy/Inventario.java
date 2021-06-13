package strategy;
import java.util.List;
import java.util.ArrayList;

public class Inventario {
	private IEstrategiaVenta estrategiaVenta;
	private List<Prenda> prendas = new ArrayList<>();
	public Inventario() {}
	
	public void venta() {
		estrategiaVenta.oferta(this.prendas);
	}
	
	
	public IEstrategiaVenta getEstrategiaVenta() {
		return estrategiaVenta;
	}
	public void setEstrategiaVenta(IEstrategiaVenta estrategiaVenta) {
		this.estrategiaVenta = estrategiaVenta;
	}
	public List<Prenda> getPrendas() {
		return prendas;
	}
	public void setPrendas(List<Prenda> prendas) {
		this.prendas = prendas;
	}
	
	
	
}
