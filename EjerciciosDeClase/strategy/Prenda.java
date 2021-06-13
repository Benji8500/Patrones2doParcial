package strategy;

public class Prenda {
	private String tipo;
	private double precio;
	
	
	public Prenda(String tipo, int precio) {
		this.tipo = tipo;
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double d) {
		this.precio = d;
	}
	
	
	
}
