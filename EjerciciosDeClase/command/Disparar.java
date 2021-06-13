package command;

public class Disparar implements ICommand{
	private GameEngine gameEngine;
	
	public Disparar(GameEngine gameEngine) {
		this.gameEngine=gameEngine;
	}
	
	
	@Override
	public void execute() {
		System.out.println("...Shooting...");
		this.gameEngine.disparar();
	}

}
