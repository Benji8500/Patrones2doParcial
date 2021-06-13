package command;

public class Atacar implements ICommand{
	private GameEngine gameEngine;
	
	public Atacar(GameEngine gameEngine) {
		this.gameEngine=gameEngine;
	}
	
	
	@Override
	public void execute() {
		System.out.println("...Attacking...");
		this.gameEngine.atacar();
	}

}
