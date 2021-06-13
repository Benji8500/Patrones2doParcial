package command;

public class ModoDefensa implements ICommand{
	private GameEngine gameEngine;
	
	public ModoDefensa(GameEngine gameEngine) {
		this.gameEngine=gameEngine;
	}
	
	
	@Override
	public void execute() {
		System.out.println("...Defense Mode Activated...");
		this.gameEngine.modoDefensa();
	}

}
