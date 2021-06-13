package chainOfResponsibility;

public class Management implements ICustomerSupport {
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
		DevOps devOps1 = new DevOps();
		this.setNext(devOps1);
		
		QA qa1 = new QA();
		devOps1.setNext(qa1);
		
		Developer dev = new Developer();
		qa1.setNext(dev);
		
		Finanzas fi = new Finanzas();
		dev.setNext(fi);
		
		this.next.soporte(criteria);
		
	}
	
}
