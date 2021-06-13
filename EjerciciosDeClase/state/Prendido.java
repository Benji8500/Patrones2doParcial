package state;
import java.util.Random;

public class Prendido implements IComputerState{
	
	public Prendido() {
		
		
	}
	
	

	@Override
	public void handler(Computadora comp) {
		Random rand = new Random();
		System.out.println("** Estado: Prendido **");
		int numProg = rand.nextInt(18);
		comp.setProgramas(numProg +" programas abiertos");
		comp.setConsumoMemoria(5*numProg);
		comp.setConsumoCpu(5*numProg);
		System.out.println("Programas: "+comp.getProgramas());
		System.out.println("Memoria Utilizada :"+comp.getConsumoMemoria()+"%");
		System.out.println("CPU Utilizado:"+comp.getConsumoCpu()+"%");
	    System.out.println("********");

		
	}

}
