package chainResponsibilityPractica;

public class Cabo implements ICuerpoEjercito{
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
		if(or==Orden.Limpiezas) {
			System.out.println("> INFO: La limpieza sera realizada por el Cabo");
		} else {
			System.out.println("> ERROR: La orden no puede ser realizada");
		}
	}

}
