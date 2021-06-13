package mediatorPractica;

public class Usuario extends Colleague {
	private String name;
	private int number;

	public Usuario(ICanalDeComunicacion mediator) {
		super(mediator);
	}


	@Override
	public void messageReceived(String message, int number) {
		System.out.println(name+" Received Message >"+message+ "< From: " +number);
	}

	@Override
	public void send(String message, int Number) {
		canalDeComunicacion.send(message,this, Number);
	}
	
	@Override
	public void sendToAll(String message) {
		canalDeComunicacion.sendAll(message,this);
		
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}



	
}
