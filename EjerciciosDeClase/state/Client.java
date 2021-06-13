package state;

public class Client {

	public static void main(String[] args) {
		IComputerState state = new Apagado();
		Computadora comp = new Computadora();
		comp.setState(state);
		comp.request();
		
		state = new Prendido();
		comp.setState(state);
		comp.request();
		
		state = new Reiniciar();
		comp.setState(state);
		comp.request();
	}

}
