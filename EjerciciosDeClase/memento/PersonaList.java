package memento;

import java.util.List;

public class PersonaList {
	private List<Persona> personas;
	

	public PersonaList(List<Persona> personas) {
		this.personas = personas;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	public void addPersonas(Persona per) {
		this.personas.add(per);
	}
	
	public void info(){
		for( Persona per: personas) {
			System.out.println("****");
	        System.out.println("INFO > Nombre: "+per.getName());
	        System.out.println("INFO > CI: "+per.getCi());
	        System.out.println("INFO > Edad: "+per.getEdad());
	        System.out.println("****");
		}
        
    }
}
