package command;

public class Client {

	public static void main(String[] args) {
		GameEngine gameEng = new GameEngine("1.03");
	
	Atacar attack = new Atacar(gameEng);
	Disparar disparar = new Disparar(gameEng);
	ModoDefensa defense = new ModoDefensa(gameEng);
	
	Invoker start = new Invoker();
	start.addCommand(attack);
	start.addCommand(disparar);
	start.addCommand(defense);
	
	start.executeCommands();

	
	}

}
