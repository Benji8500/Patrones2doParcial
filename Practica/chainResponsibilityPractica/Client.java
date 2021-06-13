package chainResponsibilityPractica;

import chainResponsibilityPractica.ICuerpoEjercito.Orden;

public class Client {

	public static void main(String[] args) {
		ManejoCuerpo man = new ManejoCuerpo();
		man.recibirOrden(Orden.Limpiezas);
		man.recibirOrden(Orden.Entrevistas);

	}

}
