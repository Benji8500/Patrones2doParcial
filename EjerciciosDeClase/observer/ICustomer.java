package observer;

public interface ICustomer {
	void update(String message, Notification notif);
    String[] getSubs();
}
