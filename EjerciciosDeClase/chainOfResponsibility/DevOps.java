package chainOfResponsibility;

public class DevOps implements ICustomerSupport{
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
		if(criteria==Orden.Infraestructura) {
            System.out.println("INFO> DevOps se encargara de resolver la solicitud,"
            		+ " es necesario tener mas informacion");

		}else {
			this.next.soporte(criteria);
			
		}
		
	}

}
