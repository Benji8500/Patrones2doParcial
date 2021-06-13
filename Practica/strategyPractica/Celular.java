package strategyPractica;

public class Celular {
	enum Gama{
		ALTA,
		Media,
		Baja
	}
	private String modelo;
	private String marca;
	private int precio;
	private Gama gama;
	
	
	
	public Celular(String modelo, String marca, int precio, Gama gama) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.gama = gama;
	}
	public void info(){
        System.out.println("INFO> Modelo: "+modelo);
        System.out.println("INFO> Marca: "+marca);
        System.out.println("INFO> Precio: "+precio+"$");
        System.out.println("INFO> Gama: "+gama);
    }
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Gama getGama() {
		return gama;
	}
	public void setGama(Gama gama) {
		this.gama = gama;
	}
	
	
	
	
	
	
	
}
