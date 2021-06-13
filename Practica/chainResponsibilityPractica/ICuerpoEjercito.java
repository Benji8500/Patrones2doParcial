package chainResponsibilityPractica;


public interface ICuerpoEjercito {
	enum Orden {
		Entrevistas,
		Disciplina,
		DesbloqueosManifestaciones,
		Limpiezas
	}
	void setNext(ICuerpoEjercito handler);
	ICuerpoEjercito next(); 
    void recibirOrden(Orden or); 
}
