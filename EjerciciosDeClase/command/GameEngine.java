package command;

public class GameEngine {
	private String version="1.0";
	
	public GameEngine(String ver) {
		this.version=ver;
	}
	
	public void showInfo(){
        System.out.println("version: "+version);
    }
	
	public void disparar(){
        System.out.println("COMMAND>disparar....");
        this.showInfo();
    }
	
	public void modoDefensa(){
        System.out.println("COMMAND>modoDefensa....");
        this.showInfo();
    }
	
	public void atacar(){
        System.out.println("COMMAND>atacar....");
        this.showInfo();
    }

}
