package memento;


public class Memento {
	
	private PersonaList state;
	
	public Memento(PersonaList stateSaved) {
		this.state=stateSaved;
	}

	public PersonaList getState() {
		return state;
	}

	
	
	

}
