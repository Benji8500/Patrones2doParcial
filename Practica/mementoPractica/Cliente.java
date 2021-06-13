package mementoPractica;

public class Cliente {
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator();

		Tesis tesis;

		tesis = new Tesis("Andres O", "Lorem ipsum dolor sit amet. ", "Dr. Marcelo Z");
		originator.setState(tesis);
		careTaker.addMemento(originator.createMemento());

		tesis = new Tesis("Andres O",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
				"Dr. Marcelo Z");
		originator.setState(tesis);
		careTaker.addMemento(originator.createMemento());

		tesis = new Tesis("Andres O",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.  ",
				"Dr. Marcelo Z");
		originator.setState(tesis);
		careTaker.addMemento(originator.createMemento());

		tesis = new Tesis("Andres O",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
				"Dr. Marcelo Z");
		originator.setState(tesis);
		careTaker.addMemento(originator.createMemento());

		tesis = new Tesis("Andres O",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
				"Dr. Marcelo Z");
		originator.setState(tesis);
		careTaker.addMemento(originator.createMemento());
		
		 originator.restoreFromMemento(careTaker.getMemento(2));
	}
}

/*
 * Se tiene un estudiante que está realizando su tesis, cada ocasión que lleva
 * su documento a revisión el guarda un estado de este para poder retornar a
 * esa versión cuando el lo necesite, ya tiene 5 revisiones del tutor y esto
 * quiere decir que tiene 5 versiones, El necesita volver a su estado 3 para
 * revisar qué fue lo que cambio
 * 
 * 
 */
