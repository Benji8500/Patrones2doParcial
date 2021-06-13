package chainResponsibilityPractica;

public class ManejoCuerpo implements ICuerpoEjercito{
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
		General gen = new General();
		this.setNext(gen);
		
		Teniente ten = new Teniente();
		gen.setNext(ten);
		
		Coronel cor = new Coronel();
		ten.setNext(cor);
		
		Cabo cab = new Cabo();
		cor.setNext(cab);
		
		this.next.recibirOrden(or);
		
	}

}
