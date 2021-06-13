package observerMementoPractica;

public class Developer implements IDev {
	private String name;
	private String lenguajes;
	
	
	
	
	public Developer(String name, String lenguajes) {
		this.name = name;
		this.lenguajes = lenguajes;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getLenguajes() {
		return lenguajes;
	}





	public void setLenguajes(String lenguajes) {
		this.lenguajes = lenguajes;
	}





	@Override
	public void update(String message) {
		System.out.println("********* NOTIFY *********");
        System.out.println(message);
	}
	
	
}
