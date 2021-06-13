package state;

public class Apagado implements IComputerState{
	
	public Apagado() {
		
	}
	
	

	@Override
	public void handler(Computadora comp) {
		System.out.println("** Estado: Apagado **");
		comp.setProgramas("0 programas abiertos");
		comp.setConsumoMemoria(5);
		comp.setConsumoCpu(5);
		System.out.println("Programas: "+comp.getProgramas());
		System.out.println("Memoria Utilizada :"+comp.getConsumoMemoria()+"%");
		System.out.println("CPU Utilizado:"+comp.getConsumoCpu()+"%");
	    System.out.println("********");

		
	}

}
