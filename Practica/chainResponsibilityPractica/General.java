package chainResponsibilityPractica;

public class General implements ICuerpoEjercito{
	private ICuerpoEjercito next;

	@Override
	public void setNext(ICuerpoEjercito handler) {
		this.next= handler;
	}

	@Override
	public ICuerpoEjercito next() {
		return this.next;
	}

	@Override
	public void recibirOrden(Orden or) {
		if(or==Orden.Entrevistas) {
			System.out.println("> INFO: Las entrevistas seran llevadas a cabo por el General");
		} else {
			this.next.recibirOrden(or);
		}
	}

}
