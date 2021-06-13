package mementoPractica;

public class Tesis {
	private String autor;
	private String tutor;
	private String contenido;
	
	public Tesis() {}
	
	

	public Tesis(String autor, String contenido, String tutor) {
		this.autor = autor;
		this.contenido = contenido;
		this.tutor = tutor;
	}



	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	public String getTutor() {
		return tutor;
	}



	public void setTutor(String tutor) {
		this.tutor = tutor;
	}



	public void info(){
        System.out.println("****");
        System.out.println("INFO > Autor: "+autor);
        System.out.println("INFO > Tutor: "+tutor);
        System.out.println("INFO > Contenido: "+contenido);
        System.out.println("****");
    }
	
	
}
