package mediator;

public class SM extends Persona{
	
	private String name;
    private String ci;
    private String certificaciones;
	

	public SM(ICanalDeComunicacion mediator) {
		super(mediator);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Message Received "+name+","+ci+","+certificaciones+">"+message);
		
	}

	public String getCertificaciones() {
		return this.certificaciones;
	}

	public void setCertificaciones(String grado) {
		this.certificaciones = grado;
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
