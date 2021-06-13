package mediatorPractica;

public abstract class Colleague {
	protected ICanalDeComunicacion canalDeComunicacion;

    public Colleague(ICanalDeComunicacion mediator){
        this.canalDeComunicacion =mediator;
    }

    public abstract void send(String message, int number);
    public abstract void sendToAll(String message);
    public abstract void messageReceived(String message, int number);


}
