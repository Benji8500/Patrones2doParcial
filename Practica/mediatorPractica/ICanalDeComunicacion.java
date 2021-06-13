package mediatorPractica;

public interface ICanalDeComunicacion {
    void send(String message, Colleague colleague, int destino);

	void sendAll(String message, Colleague colleague);
}