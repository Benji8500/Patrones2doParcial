package chainOfResponsibility;

public class Finanzas implements ICustomerSupport {
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
		if(criteria==Orden.Costos) {
            System.out.println("INFO> El departamento de finanzas esta revisando la peticion");

		}else {
			System.out.println("Support esta revisando el caso");
			
		}
		
	}

}
