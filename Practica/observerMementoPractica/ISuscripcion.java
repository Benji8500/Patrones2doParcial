package observerMementoPractica;

public interface ISuscripcion {
	void attach(IDev observer);
    void deattach(IDev observer);
    void notifyObserver(String com);
}
