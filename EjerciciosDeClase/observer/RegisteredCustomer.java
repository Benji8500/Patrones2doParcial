package observer;

import java.util.ArrayList;
import java.util.List;

public class RegisteredCustomer implements ICustomer{
	private String[] notifList;
	private Persona persona;
	
	
	public RegisteredCustomer(String[] notifList, Persona persona) {
		this.notifList = notifList;
		this.persona = persona;
	}
	@Override
	public void update(String message, Notification notif) {
		System.out.println("********* NOTIFY *********");
        System.out.println(message);
	}
	@Override
	public String[] getSubs() {
		return this.notifList;
	}
	

}
