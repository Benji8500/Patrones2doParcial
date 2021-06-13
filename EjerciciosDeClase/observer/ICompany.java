package observer;

public interface ICompany {
	public enum Notification {
	    precios,
	    notificaciones,
	    premios,
	    noticias
	}
	
	
	void attach(ICustomer observer);
    void deattach(ICustomer observer);
    void notifyObserver(Notification notif);
}
