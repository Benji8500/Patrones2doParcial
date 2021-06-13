package mediator;

public class QA extends Persona{
	
	private String name;
    private String ci;
    private String grado;
	

	public QA(ICanalDeComunicacion mediator) {
		super(mediator);
	}
	
	@Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }


	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Message Received "+name+","+ci+","+grado+">"+message);
		
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
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
