package chainResponsibilityPractica;

public class Coronel implements ICuerpoEjercito{
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
		if(or==Orden.DesbloqueosManifestaciones) {
			System.out.println("> INFO: Los desbloqueos y/o manifestaciones seran manejadas por el Coronel");
		} else {
			this.next.recibirOrden(or);
		}
	}

}
