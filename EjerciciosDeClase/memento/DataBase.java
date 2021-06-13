package memento;


import java.util.HashMap;
import java.util.Map;

public class DataBase {
	
	private Map<String, Memento> stateSaved = new HashMap<>();
    public void addMemento(String backName, Memento memento){
        stateSaved.put(backName, memento);
    }

    public Memento getMemento(String backName){
        return stateSaved.get(backName);
    }
}
