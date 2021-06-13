package state;

public class Computadora {
	private IComputerState state;
	private String programas;
	private int consumoMemoria;
	private int consumoCpu;
	
	
	public void request() {
		this.state.handler(this);
	}
	
	
	public IComputerState getState() {
		return state;
	}
	public void setState(IComputerState state) {
		this.state = state;
	}
	public String getProgramas() {
		return programas;
	}
	public void setProgramas(String programas) {
		this.programas = programas;
	}
	public int getConsumoMemoria() {
		return consumoMemoria;
	}
	public void setConsumoMemoria(int consumoMemoria) {
		this.consumoMemoria = consumoMemoria;
	}
	public int getConsumoCpu() {
		return consumoCpu;
	}
	public void setConsumoCpu(int consumoCpu) {
		this.consumoCpu = consumoCpu;
	}
	
	
}
