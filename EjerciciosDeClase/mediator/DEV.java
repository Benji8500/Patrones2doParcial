package mediator;

public class DEV extends Persona{
	
	private String name;
    private String ci;
    private String lenguaje;
	

	public DEV(ICanalDeComunicacion mediator) {
		super(mediator);
	}


	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Message Received "+name+","+ci+","+lenguaje+">"+message);
		
	}


	public String getLenguaje() {
		return this.lenguaje;
	}

	public void setLenguaje(String grado) {
		this.lenguaje = grado;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCi() {
		return ci;
	}


	public void setCi(String ci) {
		this.ci = ci;
	}



	
	

}
