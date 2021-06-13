package observer;

import java.util.ArrayList;
import java.util.List;

public class RealCompany implements ICompany{
	
	private List<ICustomer> observerList= new ArrayList<>();

    private List<Notification> notList = new ArrayList<>();
	
	@Override
	public void attach(ICustomer observer) {
		observerList.add(observer);		
	}

	@Override
	public void deattach(ICustomer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver(Notification notif) {
		for(ICustomer user:observerList) {
			
		}
	}

}
