package chainOfResponsibility;

public class Developer implements ICustomerSupport {
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
		if(criteria==Orden.NuevaFuncionalidad) {
            System.out.println("INFO> El departamento de Development se encargara de estimar la nueva funcionalidad");

		}else {
			this.next.soporte(criteria);
			
		}
		
	}

}
