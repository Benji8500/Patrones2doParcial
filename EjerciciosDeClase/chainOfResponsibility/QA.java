package chainOfResponsibility;

public class QA implements ICustomerSupport {
	private ICustomerSupport next;
	@Override
	public void setNext(ICustomerSupport handler) {
		this.next=handler;
		
	}

	@Override
	public ICustomerSupport next() {
		return this.next;
	}

	@Override
	public void soporte(Orden criteria) {
		if(criteria==Orden.Bugs) {
            System.out.println("INFO> QA se encargara de aislar el error");

		}else {
			this.next.soporte(criteria);
			
		}
		
	}

}
