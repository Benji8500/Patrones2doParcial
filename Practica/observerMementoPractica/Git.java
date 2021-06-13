package observerMementoPractica;

import java.util.ArrayList;
import java.util.List;

public class Git implements ISuscripcion{
	private List <IDev> observerList = new ArrayList<>();
	private Codigo state;

    public Git(){}

    public void setState(Codigo state) {
        System.out.println("**** Set State *****");
        state.info();
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("**** Create State *****");
        state.info();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento, String name){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.info();
        this.notifyObserver(name);
    }

	@Override
	public void attach(IDev observer) {
		observerList.add(observer);		
	}

	@Override
	public void deattach(IDev observer) {
		observerList.remove(observer);		
	}

	@Override
	public void notifyObserver(String com) {
		for (IDev user:observerList) {
			Developer d = (Developer) user;
           
                  user.update(d.getName()+" se ha restaurado la version del "+ com);

     }
		
	}
}
