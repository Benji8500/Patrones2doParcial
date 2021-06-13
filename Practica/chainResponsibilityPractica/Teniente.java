package chainResponsibilityPractica;

public class Teniente implements ICuerpoEjercito{
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
		if(or==Orden.Disciplina) {
			System.out.println("> INFO: La disciplina sera administrada por el Teniente");
		} else {
			this.next.recibirOrden(or);
		}
	}

}
