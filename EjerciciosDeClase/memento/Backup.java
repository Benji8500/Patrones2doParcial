package memento;


public class Backup {
	private PersonaList state;
	
	public Backup() {};
	
	public void setState(PersonaList state) {
		System.out.println("**** Set State *****");
		state.info();
		this.state=state;
	}
	
	public Memento createBackup() {
		System.out.println("**** Create Backup *****");
		state.info();
        return new Memento(this.state) ;
	}
	
	public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
		this.state.info();

    }

}
