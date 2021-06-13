package state;

public class Reiniciar implements IComputerState{
	
	public Reiniciar() {
		
		
	}
	
	

	@Override
	public void handler(Computadora comp) {
		System.out.println("** Estado: Reiniciando **");
		comp.setProgramas("0 programas abiertos");
		comp.setConsumoMemoria(0);
		comp.setConsumoCpu(0);
		System.out.println("Programas: "+comp.getProgramas());
		System.out.println("Memoria Utilizada :"+comp.getConsumoMemoria()+"%");
		System.out.println("CPU Utilizado:"+comp.getConsumoCpu()+"%");
	    System.out.println("********");

		
	}

}
